package com.example.validatordemo.Annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.Optional;

/**校验请求头
 * @Author: ZhangChao
 * @Date: 2019/6/29 15:17
 **/
@Slf4j
@Aspect
@Component
public class HeaderCheckerAspect {
    @Before("@within(headerChecker)")
    public void doBeforeForClass(HeaderChecker headerChecker) {
        doBefore(headerChecker);
    }
    @Before("@annotation(headerChecker)")
    public void doBefore(HeaderChecker headerChecker) {
        HttpServletRequest request = currentRequest();
        if (Objects.isNull(request)) {
            log.info("没有请求,跳过检查");
            return;
        }

        String[] headerNames = headerChecker.headerNames();
        for (String headerName : headerNames) {
            String value = request.getHeader(headerName);
            if (StringUtils.hasText(value)) {
                continue;
            }
            log.error("请求头: {} 缺失", headerName);
            throw new IllegalArgumentException("请求头: " + headerName + "缺失");
        }

        log.info("检查通过");
    }

    /**
     * Return request current thread bound or null if none bound.
     *
     * @return Current request or null
     */
    private HttpServletRequest currentRequest() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return Optional.ofNullable(servletRequestAttributes).map(ServletRequestAttributes::getRequest).orElse(null);
    }

}
