package com.example.validatordemo.result;

/**
* Copyright:   BEIJING GOODWILL (c) 2015
* Creator:  zhangwj
* CreateDateTime： 2015年12月31日 上午11:14:21
* Description： 系统错误码定义：定义规则依0（0标识成功）为界限：正数定义客户端调用错误，客户端需检测调用程序的正确性；负数定义系统错误，当返回负数时，客户端需联系系统管理员来进行问题的排查
*/ 
public enum ResultCode {
	SUCCESS(0, "OK"), 
	ERROR_EMPTY_PARAMS(1, "请求参数缺失"), 
	ERROR_PARAMS(2, "请求参数不合法"), 
	TOKEN_IS_VOID(3, "token is not valid"),
	GEN_TOKEN_FAILED(4,"获取token失败！"),
	SEND_SMS_FAILED(5,"短信发送失败！"),
	PARTNER_IS_VOID(6, "partner 无效"),
	USER_HAS_OPENED(8, "用户已开通"),
	USER_NOT_OPENED(9, "用户未开通"),
	NOT_FOUND_USER(10, "用户名或密码错误！"),
	MOBILE_HAS_REGISTERED(11, "该手机号已经注册"),
//	@Deprecated//用户名不是唯一键，故用户名可重复
//	LOGIN_HAS_REGISTERED(12, "该用户名已被注册"),
	DATA_LOAD_FAILED(13, "数据加载失败！请稍后重试"),
//	@Deprecated
//	USER_BANDED_PATIENT(14,"该用户已绑定该就诊卡"),
	BAND_CARD_FAILURE(15,"绑定失败，未能匹配到您的病历"),
//	@Deprecated
//	HOSPITAL_NO_PATIENT(16,"抱歉！医院不存在当前就诊卡号"),
	WECHAT_LOGOUT_ERROR(17,"微信注销失败！"),
	RECORD_NOT_FOUND(18, "未找到此记录"),
	ERROR_OLD_PASSWORD(19, "旧密码错误"),
	ERROR_FORMAT_MOBILE(20, "手机号格式错误"),
//	@Deprecated
//	BAND_IDNO_ERROR(21, "姓名和身份证信息不一致"),
	BAND_INFO_ERROR(22, "绑定信息有误"),
	NOT_ONESELF_BUILDING(23, "此记录不是自建病历"),
	NOT_FOUND_MOBILE(24, "未找到此手机号用户"),
	NOT_FOUNT_CARDMSG(25, "未找到此用户的就诊卡信息"),
//	接口暂未用
	PATIENT_NOTIFY_FAILURE(26,"卡号通知失败"),
	USER_BOUND_OTHER_PATIENT(27, "此用户已绑定其他患者"),
	NOT_USER_BOUND_PATIENT(28, "微信未绑定此患者"),
	MOBILE_BANDED_WECHAT(29, "此手机号已被其他微信绑定"),
	GET_HOSPITALPUB_CARDMSG_FAILED(30, "获取前置机就诊卡信息失败！"),
//	调试用客户端不处理
	GET_HOSPITALPUB_DOMAIN_FAILED(31, "获取前置机域名失败！"),
	GET_HOSPITALPUB_STREAM_FAILED(32, "获取前置机文档流失败！"),
	GET_HOSPITALPUB_CLINIC_VISIT_FAILED(33, "获取前置机就诊记录失败"),
	GET_HOSPITALPUB_DOC_FAILED(34, "获取前置机文档失败"),
	ID_CARD_ERROR(35, "身份证号格式有误"),
	USER_EXIST_BAND(36, "您要绑定的卡号已存在"),
	PATIENT_NOT_FOUND(37, "未找到此成员"),
	NAME_NOT_UPDATE(38, "不是首次绑定医疗卡，用户名不可更改"),
	IDNO_NOT_UPDATE(39, "不是首次绑定医疗卡，身份证号不可更改"),
	REGISTERED_FAILED(40, "注册失败"),
	HAS_PATIENT(41, "该成员已存在，请核对您填写的身份证号码"),
	GET_HOSPITALPUB_MEDICAL_DATA(42, "获取前置机体检报告失败！"),
	ERROR_TICKET(43, "票据错误！"),
	TICKET_EXPIRE(44, "票据已到期！"),
	ERROR_PASSWORD(45, "密码错误"),
	ALREADY_BAND_CARD(46,"身份已验证，不可修改"),
	DATA_EMPTY(47, "该报告暂无电子版"),
	EXCESSIVE_ATTEMPTS(48, "您今天验证失败次数过多，请24小时后再尝试"),	
	NOT_FIND_LAST_VISIT(49, "验证失败。可能是您填写的信息有误；如果您今天首次在本院就诊，请在明天进行验证。"),
	ERROR_QUESTION_ANSWER(50, "验证失败，问题回答有误，请核对后重试"),
	VISIT_RECORD_INFO_INCOMPLETE(51, "未能获取到完整的就诊信息，请返回后，尝试其他绑卡方式"),
	NOT_FOUND_PATIENT(52, "患者不存在！"),
	CODE_INVALID(53, "验证码失效"),
	MOBILE_NOT_CONSISTENT(54, "手机号不一致"),
	ERROR_CODE(55, "验证码错误"),
	EXCESSIVE_ATTEMPTS_VERIFY_CODE(56, "验证码验证失败次数过多"),
	ERROR_API_VERSION(57, "接口版本号错误"),
	OFFLIEN(58, "您的账号于#login_time#在另一台手机#device_model#登录，如非您本人操作，建议您修改密码。"),
	HOSPITALPUB_SERVICE_FAILED(59, "直连前置机服务失败！"),
	HOSPITALPUB_NET_EXCEPTION(60, "医院服务暂时无法使用，请稍候重试！"),
	ALREADY_SEND_CODE(61, "验证码已发送，请1分钟之后重试"),
	PATIENT_NOT_EXISTS(62, "未添加任何成员"),
	GET_HOSPITALPUB_CHARGESINFO_FAILED(63, "获取前置机费用信息失败！"),
	APP_HAVE_NO_HOSPITAL(64, "当前应用未开通任何医院！"),
	SHARE_REPORT_NOT_FOUND(65, "该分享报告不存在,请检查后再试！"),
	GET_HOSPITALPUB_INCREASECARD_FAILED(66, "获取前置机增量卡失败！"),
	REPORT_NOT_FOUND(67, "报告不存在,请检查后再试！"),
	VISITRECORD_NOT_FOUND(68, "就诊次信息暂未开放,请耐心等待！"),
	VALID_CARDMSG_FAILD(69, "您填写的资料无法验证通过，请核实后重试"),
	NOT_FOUND_WECHAT_USER(70, "首页使用微信登录授权请绑定手机号"),
	ALREADY_BIND_DEVICE(71, "温馨提示：您的账号已绑定#device_model#手机设备，建议您在该设备申请解绑后再使用新设备登录。"),
	ALREADY_VOTE(100,"您已经评价过，无需重复评价"),
	
//	病案复印错误码段 100-200
	DUPLICATE_NAME(101, "添加/修改名称失败，该名称已存在！"),
	DELETEDATA_ERROR(102, "删除失败，该条记录已不存在！"),
	CALCULATEDATA_ERROR(103, "计算失败，所传参数与后台校验结果不符！"),
	ADD_ERROR(104, "添加失败"),
	UPDATE_ERROR(105, "修改失败"),
	REFUND_ERROR(106, "预付费金额应该大于退款金额"),
	NOT_FOUND(107, "该条记录已不存在!"),
	NON_PAYMENT(108, "用户存在未支付订单!"),
	CANCEL_LIMIT(109, "今日取消订单达到上限!"),
	REFUSE_LIMIT(110, "今年拒绝支付达到上限!"),
	OPERARE_ERROR(101, "操作失败!"),
	AMOUNT_ERROR(101, "查询病案费用错误!"),
	EXCEl_NOT_NULL(102,"excel内容为空"),
	IMEXCEl_FAIL(103,"导入excel失败"),
	MAIL_NOT_NULL(104,"邮寄订单邮寄金额不能为空"),
	LOCK_ORDER(105,"该订单正在由“某某某”处理"),
	ORDER_NOT_EX(106,"订单不存在"),
	ORDER_TRAN_FINISH(107,"订单已经交易完成"),
	ORDER_NOT_PAYPTAL(108,"非该平台挂号记录，暂不支持支付，请前往初始挂号平台进行支付"),
	ORDER_NOT_REFUNDPTAL(109,"非该平台挂号记录，暂不支持取消，请前往初始挂号平台进行取消"),
	
	
	
//	图文问诊错误码段 201-300
	ALREADY_BIND_HIS_ACCOUNT(201, "您的账号已经被绑定！"),
	ALREADY_BIND_OTHER_HIS(202, "已绑定账号，请勿重绑！"),
	BIND_HIS_FAILED(203, "绑定账号失败！"),
	USER_INFO_IS_NULL(204, "用户信息为空"),
	PAY_TIME_OUT(205, "该订单该状态下,不能支付"),
	PAY_AMOUNT_OUT(206, "用户数量已超限，操作失败"),	
	DOCOTOR_COLLECTED(207, "该医生已经被收藏"),
	HOSPITAL_CONFIG_INVALID(208, "医院配置失效"),
	HOSPITAL_CONFIG_EXPIRATION(209, "医院配置过期"),
	UNBIND_HIS_ACCOUNT(210, "未绑定HIS账号"),
	ONLY_UPDATE_HIS_PASSWORD(211, "仅可更新密码"),
	PAY_AMOUNT(212, "支付金额不合法,请重新支付"),
	DOCOTOR_RESERVED(213, "该医生已经被预约过"),
	DOCOTOR_RESERVE_FULL(214, "医生当前时段已约满"),
	DOCOTOR_RESERVE_STOP(215, "医生当前时段已停止预约"),
	SCHEDULE_ORDER_FAILED(216, "停诊预约订单退款失败"),
	DOCOTOR_RESERVED_ORDER(217, "您已预约过该时段，请换个时段进行预约"),
	REPEAT_ORDER(227, "该排班订单已经提交，不能重复提交"),
	UNFINSHED_ORDER(218, "您当前还有1个未完成的咨询，请咨询完成后再次预约"),
	RESERVED_COUNT_ERROR(219, "当前号源不足"),
	RESERVED_ERROR(220, "您好，预约失败请重新预约"),
	AXB_BIND_ERROR(221, "暂时无法接通，请稍后再拨打"),
	PATIENT_CANCEL_ORDER(222, "取消失败，咨询正在进行中"),
	PATIENT_NOT_SUPPORT_ORDER(227, "取消失败，该状态不支持患者取消"),
	MODEL_NOT_SUPPORT(223, "该模式不支持患者取消"),
	PATIENT_CANCEL_ERROR(224, "取消失败，当前时段不能取消"),
	PATIENT_NOT_APPOINTMENT(225, "无法预约，超过可预约时间"),
	PATIENT_NEXT_NULL(226, "当前为最后一位患者,无下一位预约"),
	REPEAT_VOTE(227, "该订单已经评价，不能进行重复评价"),
	//权限系统错误码段 301-400
	RELOGIN_TIP(301, "您未登录，请重新登录！"),
	UNAUTHORIZED_TIP(302, "权限限制，您访问了未授权的页面！"),
	LOGIN_PASS_ERROR(303, "密码错误，请重新登录！"),
	NO_SUCH_USER(304, "无此用户，请重新登录"),
	CREATE_TOKEN_ERROR(305, "有空值，创建token失败"),
	GET_LOGIN_TOKEN(306, "获取登录token异常！"),
	NO_ALLOT_ROLE(307, "该用户未分配角色！"),
	DISABLED_USER(308, "用户已停用，请联系管理人员开通！"),
	
//	支付系统错误码段 401-500
	REFUNDED(401, "已全部退款，不可进行二次退款"),
	OPENID_NOT_BLANK(402, "trade_type=JSAPI时，openid不可为空"),
	UNIFIED_ORDER_FAILED(403, "统一下单失败"),
	PAY_ACCOUNT_NOT_EXIST(404, "支付账号不存在，请联系管理员进行配置"),
	PAY_ACCOUNT_TYPE_NOT_NULL(405, "支付账号类型不能为空"),

	//定制化项目错误码段501-600
	NAMENOTMATCH(501,"姓名和身份证号不一致"),
	INVALIDPID(503,"该患者未绑卡"),
	SETTLEDATENOTNULL(504,"结算日期(visitSettleDate)不能为空!"),
	VISITIDNOTNULL(505,"就诊次(visitId)不能为空!"),
	INVALIDVISITTYPE(506,"未匹配到该就诊类型!"),
	ILLEGALPARAM(507,"就诊卡号或就诊类型为空，或pageSize不合法!"),
	WAIT_REMIND_NOT_FOUND(508,"暂无候诊信息!"),
	UP_PUSH_STATUS_FAIL(509,"更新推送状态失败"),
	GET_USERID_FAIL(510,"获取用户ID异常"),
	DATA_UP_FAIL(511,"数据同步异常"),
	
	
//	开发平台错误码段601-700
	CHECK_SIGN_FAILED(601, "验签失败！"),
	REQUEST_EXPIRATION(602, "请求已过期"),
	
//	病案系统错误段701-800
	DOC_NOT_OPEN(701, "#report_class##report_type#暂未开放电子版"),
	DOC_NOT_START_OPEN(702, "#report_start_date#之前的#report_class##report_type#暂未开放电子版"),
	DOC_NOT_VIEW(703, "#report_class##report_type#在出院#view_time_limit##view_time_unit#后提供电子版"),
	
	//--------快递系统对接错误代码 801-900-----------//
	DELIVERY_QUERY_FAILED(801, "查询失败"),
	DELIVERY_CREATE_FAILED(802, "下单失败"),
	DELIVERY_QUERY_NOTFOUND (803, "未找到快递单信息"),
	DELIVERY_LACK_TYPE(804, "缺少快递类型"),
	DELIVERY_LACK_HOSPITALNO(805, "缺少医院编码"),
	DELIVERY_LACK_BIND(806, "该医院未找到该快递信息"),
	DELIVERY_LACK_CODE(807, "缺少申请单号"),
	DELIVERY_LACK_PROVINCE(808, "缺少省份"),
	DELIVERY_LACK_CITY(809, "缺少省份"),
	DELIVERY_LACK_COUNTY(810, "缺少县/区"),
	DELIVERY_LACK_ADDRESS(811, "缺少详细地址"),
	DELIVERY_LACK_CONTACT(812, "缺少联系人"),
	DELIVERY_LACK_MOBILE(813, "缺少电话"),
	DELIVERY_LACK_GOODNAME(814, "缺少物品名称"),
	DELIVERY_LACK_GOODDES(815, "缺少物品描述"),
	DELIVERY_LACK_GOODCOUNT(816, "缺少物品数量"),
	DELIVERY_LACK_MAILNO(817, "缺少运单号"),
	DELIVERY_LACK_CITYTO(818, "缺少目标城市"),
	DELIVERY_LACK_PAPERNUM(819, "缺少纸张数"),
	DELIVERY_INSERT_FAILED(820, "操作失败"),
	DELIVERY_DELETE_FAILED(821, "操作失败"),
	DELIVERY_UPDATE_FAILED(822, "操作失败"),
	RECEIPT_ADD_FAILED(850, "新增失败"),
	//--------推送系统对接错误代码 901-1000-----------//
	PUSH_EMPTY_PARAMS(901, "缺少参数"),
	PUSH_ERROR_PARAMS(902, "参数错误"),
	PUSH_ERROR_PUSH(903, "推送错误"),
	PUSH_NOTSUPPORT_PUSH(904, "推送平台不支持此类推送"),
	
	//--------调查问卷错误代码 1001-1100-----------//
	SURVEY_DATA_ERROR(1001,"数据结构错误,请检查后再试"),
	SURVEY_NO_DTAT(1002,"获取问卷数据出错,请检查数据后再试"),
	SURVEY_EXPORT_ERROR(1003,"数据导出失败,请联系管理员"),
	SURVEY_SERVICE_OFF(1004,"问卷服务未开通,请核对后再试"),
	SCORE_NOT_NULL(1005,"计分问卷选项分数不能为空"),
	QUESTION_NOT_SAME(1006,"问卷问题不能相同"),
	DERIVEDRULE_FORMULA_ERROR(1007,"问题规则不能为空！"),
	FORMULA_ERROR(1008,"公式错误！"),
	QUESTIONNAIRE_NOT_OPEN(1009,"问卷状态未开启"),
	
	//调度任务错误代码----1101-1200---//
	
	TASK_ADD_ERROR(1101, "新增任务错误"),
	TASK_RUN_ERROR(1102, "开启任务错误"),
	TASK_STOP_ERROR(1103, "停止任务错误"),
	TASK_DELETE_ERROR(1104, "删除任务错误"),
	TASK_UPDATECORN_ERROR(1105, "修改任务表达式错误"),
	TASK_RUNONECE_ERROR(1106, "立即执行任务错误"),
	TASK_RESET_ERROR(1107, "重置所有任务错误"), 
	TASK_UPDATEMAIL_ERROR(1108, "修改邮箱错误"), 
	
	//--------云医生改版4.0错误代码 1201-1300-----------//
	HOSPITAL_DISCREPANCY(1201, "验证失败，您绑定的帐号对应的医院和您当前医院不符。"),
	NOT_FOUND_EMRUSER(1202, "EMR帐号或密码错误。"),
	NOT_REMOVE_BIND_ACCOUNT(1203,"演示账号，不可解绑。"),
	UPDATE_HOSPITAL_FAILED(1204,"您已经绑定了EMR或HIS帐号，无法修改医院。"),
	VERIFY_DOCTOR_REALNAME_FAILED(1205,"验证失败，请绑定REALNAME医生的帐号。"),
	VERIFY_EMR_PASWORD_FAILED(1206,"验证失败，您的信息已被其他手机号码绑定，如果您要使用，请修改EMR帐号密码后再进行尝试。"),
	VERIFY_FS_EMR_PASWORD_FAILED(1224,"验证失败，您的信息已被其他手机号码绑定。"),
	VERIFY_FS_HIS_PASWORD_FAILED(1225,"验证失败，您的信息已被其他手机号码绑定。"),
	VERIFY_BIND_ACCOUNT_FAILED(1207,"验证失败，您当前帐号已经绑定了1个EMR帐号。"),
	VERIFY_INFO_FAILED(1208,"验证信息错误。"),
	HOSPITALMRBF_SERVICE_FAILED(1209,"直连移睿医生前置机失败。"),
	VERIFY_HIS_PASWORD_FAILED(1210,"验证失败，您的信息已被其他手机号码绑定，如果您要使用，请修改HIS帐号密码后再进行尝试。"),
	VERIFY_BIND_HIS_ACCOUNT_FAILED(1211,"验证失败，您当前帐号已经绑定了1个HIS帐号。"),
	UNBIND_EMR_ACCOUNT(1212, "未绑定EMR账号"),
	PATIENT_COLLECTED(1213, "该患者已经被收藏"),
	GET_HOSPITALPUB_PATIENTINFOS_FAILED(1214, "获取前置机所有患者失败！"),
	GET_GROUPID_FAILED(1215, "获取分组ID失败！"),
	DATA_FOUND_REPETITION(1216, "该条记录已存在。"),
	DATA_NOTE_FAILED(1217, "上传笔记失败在。"),
	DATA_BINDFLAG_FAILED(1218, "bindFlag没有按规定传值。"),
	VERIRY_ACCOUNT_FAILED(1219, "验证HIS账号是否有效失败。"),
	VERIRY_HOSPITAL_FAILED(1220, "该医院已禁用或使用已过期,请知悉。"),
	ADJUST_GROUPID_FAILED(1221, "调整分组失败，该成员最少在一个分组里面。"),
	VERIRY_ACCOUNTP_PW_FAILED(1222, "验证HIS账号是否有效失败,HIS账号或密码错误。"),
	VERIRY_HIS_DOCTOR_FAILED(1223, "验证HIS账号是否有效失败,该医院没有此医生信息。"),
	//邮件错误代码----1201-1300---//
	SEND_EMAIL_ERROR(1201, "发送邮件失败"),
	
	//医生版新版错误码----1301-1400---//
	AUTH_NOT_OPEN(1301, "未开通权限，请联系医院信息科！"),
	VERIFY_INFO_ERROR(1302, "验证信息错误"),	
	OPERATETION_NOT_INFO(1303, "该患者没有手术信息"),
	OPERATETION_ERROR(1304, "获取手术信息前置机异常"),
	EMR_UNBIND_MOBILE(1305, "该账号并未绑定手机号"),
	
	//云病历后台管理系统错误码----1401-1500---//
	NOT_FIND_APPHOSPITAL(1401, "未找到应用对应医院列表信息"),
	BATCH_SAVE_ERROR(1402, "批量保存数据失败"),
	NULL_FILE_ERROR(1403, "文件为空,请检查后再试"),
	UPLOAD_FILE_ERROR(1404, "上传文件失败,请稍后再试!"),
	UPDATE_SYNCINSTITUTION_ERROR(1405, "同步配置信息表失败"),
	HOSPITAL_NULL(1406, "该医院不存在，请检查后再试"),
	DATA_EXIST_ERROR(1407, "数据已存在，请检查后修改"),
	AD_OVERDUE_TIMEOUT(1408, "该广告已过期，请修改后重试"),
	NOT_ADD_CHILDNODES(1409, "该节点为终节点，无法添加子节点"),
	
	//健康记录错误码----1501-1600---//
	ALREADY_BOUND(1501, "该设备已被绑定"),
	BIND_FAIL(1502, "绑定失败"),
	UNBIND_FAIL(1503, "解绑失败"),
	DEL_FAIL(1504, "删除失败"),
	UP_FAIL(1505, "更新失败"),
	Add_FAIL(1506, "自建失败"),
	USER_NOT_EXIST(1507, "用户不存在"),
	
	//日历系统错误代码
	
	CALENDAR_HOLIDAY_ADDERROR(1501, "操作失败"),
	CALENDAR_HOLIDAY_GETERROR(1502, "获取错误"),
	
	//病历讨论---1601-1700
	REGISTER_RONGCLOUD_TOKEN_FAILE(1601, "该用户不存在"),
	GET_RONGCLOUD_INFO_ERROR(1602, "获取融云信息发生异常！"),
	REFRESH_RONGCLOUD_GROUP_INFO_ERROR(1603, "查询群组信息失败！"),
	DISMISS_RONGCLOUD_GROUP_ERROR(1604, "解散讨论组失败！"),
	
	
	//用户系统---1701-1800
	SELF_EXIST(1701,"该帐号已存在【本人】就诊人！"),
	MOBILE_NO_REGISTERED(1702, "该手机号未注册"),
	UPDATE_FAIL(1703, "更新数据失败"),
	MOBILE_REGISTERED_CONTINUE(1704, "该手机号未注册"),
	DEVICE_EXIST(1705, "已经存在此设备"),
	
	
	//门诊筛查---1801-1900
	NOT_FOUND_REGISTRATION(1801,"未获取患者挂号信息"),
	NOT_FOUND_CONFIGURATION(1802,"未找到配置信息"),
	ENCRYPT_DATA_ERROR(1803,"门诊筛查加密数据出错"),
	
	//出诊信息
	OUT_OPERATE_ERROR(1901, "操作失败"),
	OUT_DATA_NOTFOUND(1902, "数据不存在"),
	OUT_DEL_FAILED(1903, "删除失败"),
	OUT_FILE_SUPPORT(1904, "文件格式不支持"),
	OUT_DATA_ERROR(1905, "数据格式错误"), 
	OUT_DEPART_ERROR(1906, "该医院科室数据不存在，请先导入科室数据"),
	OUT_CLIENT_REPEAT(1907, "门诊分类重复"),
	OUT_CLIENT_DEL_ERROR(1908, "门诊分类下存在科室，不允许删除"),
	OUT_DEPART_EX(1909, "科室已经存在"),
	OUT_DOCTOR_EX(1910, "医生已经存在"),
	OUT_DEPT_DEL_ERROR(1911, "科室下存在医生，不允许删除"),
	OUT_CALL_SCHEDULING_ERROR(1912, "同一医生在同一时间段不允许排班两个科室"),
	OUT_DEPART_STATUS_ERROR(1913, "该医院科室已关闭，请先开通科室"),
	OUT_DOCTOR_STATUS_ERROR(1914, "该医院该医生已关闭，请先开通科室"),
	OUT_DATE_STATUS_ERROR(1915, "本次排班该医生时间有重复"),
	OUT_DATE_ADD_FAIL(1916, "数据添加失败"),
	OUT_DATE_UPDATE_FAIL(1917, "数据修改失败"),
	OUT_STOPDATE_EMPTY(1918, "停诊时间不能为空"),
	OUT_DATE_ERROR(1919, "时间有误"),
	
	//患者版前置机错误代码---2001-2100 （负责人：赵德锋）
	
	REQUEST_PARAMETER_ENCRYPTION_ERROR(2001, "【前置机包裹】请求参数加密失败！"),
	RESPONSE_PARAMETER_DECODE_ERROR(2002, "【前置机包裹】返回数据解密失败！"),
	CONNECT_KYLIN_SERVER_ERROR(2003, "连接kylin失败，请联系管理员！"),
	
	//网络复诊错误代码---2101-2200
	
	RECIPETEMP_NOT_NULL(2101, "常用处方模板不能为空"),
	SAVE_RECIPE_FAIL(2102, "保存处方失败"),
	RECIPE_SUBMITTED(2103, "处方已提交，不可修改"),
	SCHEDULE_ALREADY_EXIST(2104, "当前日期已有排班，不可复制排班"),
	RECIPE_NOTEXISTS(2105, "您要修改的处方不存在，请检查入参"),
	FURTH_CONSULT_NOTEXISTS(2106, "网络复诊预约单不存在，请检查入参"),
	DOCTOR_NOTEXISTS(2107, "医生信息不存在，请检查入参"),
	DRUG_EXISTS(2108, "常用药已经存在"),
	DOCTOR_SIGN_FAILD(2109, "医生处方签名失败"),
	NOT_FIND_HOSPITALCONFIG(2110, "未找到当前医院配置信息"),
	NET_HOSPITAL_NOT_OPEN(2111, "医院未开通网络复诊服务"),
	FURTH_CONSULT_ADD_ERROR(2112, "预约失败"),
	SCHEDULE_ALREADY_REPETITION(2113, "当前日期排班重复,请检查后再试"),
	PATIENT_VISITS_ONGOING(2114, "当前排班包含就诊中病人，无法停诊"),
	FURTH_CONSULT_NOT_FOUND(2115, "网络复诊单不存在"),
	FURTH_INVALID_OPERATION(2116, "非法操作"),
	FURTH_REPORT_REPEAT(2117, "您已报到，请勿重复报到"),
	FURTH_REPORT_DATE_ERROT(2118, "请于就诊当天报到"),
	FURTH_REPORT_FAIL(2119, "报到失败，请联系管理员"),
	FURTH_SCHEDULE_CANCEL(2120, "当前排班已取消，请重新选择"),
	FURTH_OPERA_ERROR(2121, "操作失败"),
	FURTH_PHAMAID_ERROR(2122, "审核药师id不能为空"),
	FURTH_PHAMA_NAME_ERROR(2123, "审核药师姓名不能为空"),
	RECIPE_NOT_FOUND(2124, "处方单不存在"),
	RECIPE_STATUS_ERROR(2125, "处方单状态错误"),
	RECIPE_QUERY_DRUG_ERROR(2126, "查询药品错误"),
	RECIPE_SMS_VERTIFY_CLOSED(2127, "医生签名短信验证未开启"),
	RECIPE_NOT_SUBMITTED(2128, "处方未提交，请先提交处方"),
	RECIPE_DETAIL_NOT_NULL(2129, "药品明细不能为空，请检查"),
	MEDICAL_TEMPL_REPEAT(2130, "该模板名称已经存在"),
	MEDICAL_TEMPL_NOT_FOUND(2131, "模板不存在"),
	MEDICAL_RVIEW_WARN(2132, "合理用药审查警示"),
	RECIPE_ADDRESS_ERROR(2133, "收货信息错误"),
	RECIPE_DRUG_STORE_NOT_FOUND(2134, "药店不存在"),
	RECIPE_DISTRIBUT_ERROR(2136, "处方分配失败"),
	RECIPE_MAIL_TYPE_ERROR(2137, "物流类型错误"),
	
	
	
	//出院带药错误代码--2201-2300
	DRUGCODE_EXISTS(3101, "药品编码存在，不能重复添加"),
	EXCEL_DATATYPE_ERROR(3102, "excel中数据格式错误，请检查"),
	
	//意见反馈 2601-2700
	FEED_ADD_ERROR(2601, "添加失败"),
	
	//医生版前置机错误代码---2701-3000 （负责人：张少广）
	
	SEND_WEBSERVICE_REQUEST_ERROR(27001, "【移睿医生前置机】请求 webservcie接口失败！"),
	PRSE_XML_ERROR(2702, "解析报文发生异常！"),
	PATIENT_INFO_ISNULL(2703, "患者信息为空!"),
	HOSPITALIZATION_COSTS_ERROR(2704, "解析患者基本信息以及住院费用发生异常！"),
	QUERY_CASE_LENG_ERROR(2705, "病历文件内容失败！"),
	QUERY_ORDER_ADVICE_ERROR(2706, "获取医嘱信息失败！"),
	QUERY_CASE_LIST_ERROR(2707, "获取本次病历信息失败！"),
	QUERY_EXAM_LIST_ERROR(2708, "获取检查信息失败！"),
	QUERY_INSPECT_LIST_ERROR(2709, "获取检验信息失败！"),
	QUERY_VITAL_SIGN__ERROR(2710, "获取体征信息失败！"),
	CONNECT_AD_SERVER_ERROR(2711, "AD域连接失败，请联系管理员！"),
	
	//云病历 3101-3300
	PATIENT_RESERVED_MOBILE_NOT_FOUND(3101, "未找到您在我院预留的手机号码，前置机返回手机号为空"),
	PATIENT_RESERVED_MOBILE_QZJ_RETURN_EMPTY(3103, "未找到您在我院预留的手机号码，前置机返回结果为空"),
	PATIENT_RESERVED_MOBILE_FORMAT_ERROR(3104, "您在我院预留的手机号码格式不正确，请去办卡处修改手机号"),
	
	//	人脸识别  隐私保护错误码  3301-3400
	FACE_AUDIT_REPEAT(3301, "该成员已认证，无需重复认证"),
	FACE_PATIENT_CARD_NOTFOUND(3302, "未找到该成员证件信息"),
	FACE_PRIVACY_ISOFF(3303, "该证件号未开启隐私保护"),
	FACE_NOT_AUDIT(3304, "该成员未认证"),
	FACE_AUDIT_FAILD(3305, "人脸认证失败"),
	FACE_ILLEGAL_OPERA(3306, "非法操作"),
	FACE_AUTHORIZE_ERROR(3307, "人脸授权错误"),
	FACE_AUTHORIZE_FAIL(3308, "获取人脸授权失败"),
	PRIVACY_CARD_NOT_FOUND(3309, "患者证件号未找到"),
	PRIVACY_OPEN_FAILD(3310, "开启隐私保护失败"),
	IDENTITY_DEL_FAILD(3311, "删除权限失败"),
	IDENTITY_ADD_FAILD(3312, "获取权限失败"),
	IDENTITY_AUTH_FAILD(3313, "无权限查看病历"),
	BING_NEED_FACE_AUTH(3314, "该成员需要人脸授权"),
	
	//自助入院错误码  3401-3500
	NOT_FOUND_SELFHELPRECORD(3401, "未找到该条自助入院记录"),
	PATIENT_NOT_BEHOSPITALIZED(3402, "当前不是待入院状态"),
	NOT_FOUND_PATIENTINFO(3403, "未找到就诊卡号对应的患者信息"),
	NOT_FOUND_PATIENTIDNO(3404, "未找到患者的身份号"),
	
	//proc初诊登记错误码 3501-3600
	FIRST_VISIT_ADD_FAILD(3501, "初诊信息添加失败"),
	FIRST_VISIT_UPDATE_FAILD(3502, "初诊信息修改失败"),
	FIRST_VISIT_DELETE_FAILD(3503, "初诊信息删除失败"),
	FIRST_VISIT_COUNT_BEYONG(3504, "初诊信息登记次数已达上限"),
	FIRST_VISIT_REGISTER(3505, "初诊信息已登记"),
	FIRST_VISIT_BINDING(3506, "初诊信息已绑卡"),
	FIRST_VISIT_CACHE(3507, "初诊信息已暂存"),
	LACK_TEMPORARY_CODE(3508, "缺少临时卡号"),
	FIRST_VISIT_CANCEL_FAILD(3509, "初诊信息取消失败"),
	FIRST_VISIT_STATUS_ERROR(3510, "初诊信息状态不正确"),
	HIS_FIRST_VISIT_ADD_FAILD(3511, "his系统初诊信息添加失败"),
	HIS_FIRST_VISIT_QUERY_FAILD(3512, "his系统初诊信息查询失败"),
	FIRST_VISIT_DATA_EXCEPTION(3513, "初诊信息数据异常"),
	
	//proc复诊检查预约错误码3601-3700
	SUBSEQUENT_VISIT_APPOINTMENT_ADD_FAILD(3601, "添加失败"),
	SUBSEQUENT_VISIT_APPOINTMENT_DATA_EXIST(3602, "数据已存在"),
	SUBSEQUENT_VISIT_APPOINTMENT_DELETE_FAILD(3603, "删除失败"),
	SUBSEQUENT_VISIT_APPOINTMENT_SELECT_FAILD(3604, "查询失败"),
	SUBSEQUENT_VISIT_APPOINTMENT_START_FAILD(3605, "启用失败"),
	SUBSEQUENT_VISIT_APPOINTMENT_FORBIDDEN_FAILD(3606, "禁用失败"),
	SUBSEQUENT_VISIT_APPOINTMENT_CANCEL(3607, "取消预约失败，请至少提前2天取消。"),
	SUBSEQUENT_VISIT_APPOINTMENT_UPDATE_FAILD(3608, "修改失败"),
	SUBSEQUENT_VISIT_APPOINTMENT_STATUS_EXCEPTION(3609, "状态异常"),
	SUBSEQUENT_VISIT_APPOINTMENT_DATA_EXCEPTION(3610, "数据异常"),
	SUBSEQUENT_VISIT_APPOINTMENT_EXAM_ITEM_MISSING(3611, "检查项目缺失"),
	
	// 护士上门错误码 3701 -- 3800
	FURTH_NURSING_ORDER_SAVE_ERROR(3701,"预约失败"),
	FURTH_NURSING_SERVICE_NOT_OPENED(3702,"服务未开通"),
	FURTH_NURSING_GET_ARRRESS_ERROR(3703,"查询地址失败"),
	FURTH_NURSING_HOSPITAL_CONFIG_ERROR(3704,"医院信息错误，请联系管理员"),
	FURTH_NURSING_OUT_DISTANCE_ERROR(3705,"超出医院服务范围"),
	FURTH_NURSING_SERVICE_NOT_FOUND(3706,"服务不存在"),
	FURTH_NURSING_ORDER_ADD_FAIL(3708,"预约失败"),
	FURTH_NURSING_RECORD_ADD_FAIL(3709,"添加报告失败"),
	FURTH_NURSING_RECORD_UPDATE_FAIL(3710,"修改报告失败"),
	FURTH_NURSING_PAY_TIME_OUT(3711,"支付超时"),
	FURTH_NURSING_COST_NOT_FOUND(3712, "支付单不存在"),
	FURTH_NURSING_ASSES_ADD_FAIl(3713, "评估记录添加失败"),
	FURTH_NURSING_ASSES_NO_PATIENT(3714, "住院号无对应的患者信息"),
	FURTH_NURSING_DATA_EXIST(3715, "数据已存在"),
	FURTH_NURSING_RECORD_AUDIT_FAIL(3716,"审核报告失败"),
	FURTH_NURSING_CATEGORY_ADD_FAIL(3717,"添加服务分类失败"),
	FURTH_NURSING_CATEGORY_UPDATE_FAIL(3718,"修改服务分类失败"),
	FURTH_NURSING_CONSUM_UPDATE_FAIL(3719,"修改耗材失败"),
	FURTH_NURSING_REFUND_FREE_FAIL(3720,"退款金额输入有误"),
	FURTH_NURSING_DATA_ALREADY_EXIST(3721, "数据已存在"),
	FURTH_NURSING_PUSH_CONF_ALREADY_EXIST(3722, "数据已配置"),

	// CMS系统错误码 3801--3900 负责人：杨菲
	CMS_SECTION_ALREADY_EXIST(3801, "栏目已存在"),
	CMS_UPLOAD_FAIL(3802, "文件上传失败"),
	CMS_MEDIA_NUMBER_WRONG(3803, "内容中的图片/视频数目不对"),
	CMS_ARTICLE_ALREADY_EXIST(3804, "内容已存在"),

	// 采血提醒错误码 3901--3999 负责人：张宇
	BLOOD_QUEUENO_ERROR(3901, "二维码信息错误，请核对后重试"),

	// 在线复诊-开检验 4000--4050 负责人：杨菲
	INSPECTION_APPLICATION_EMPTY_CARD_ERROR(4000, "该患者没有门诊卡号，无法提交申请单"),
	INSPECTION_APPLICATION_ERROR(4001, "提交申请单失败"),


	EXCEPTION(-1, "系统错误，请联系管理员！"), 
	NO_MATCH_METHOD(-2, "没有找到相关处理方法，请联系管理员！"),
	NICE_EXCEPTION(-3, "请求超时，稍后请重试！"),
	UNKNOW_ERROR(-4, "网络异常，请稍后重试");
	
	
	private Integer code;

	private String msg = "";

	ResultCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return this.code;
	}

	public String getMsg() {
		return this.msg == null ? "" : this.msg;
	}

	public static String getMsg(Integer code) {
		for (ResultCode re : ResultCode.values()) {
			if (re.code.intValue() == code.intValue()) {
				return re.msg;
			}
		}
		return "";
	}

	public static ResultCode getRc(Integer code) {
		for (ResultCode re : ResultCode.values()) {
			if (re.code.intValue() == code.intValue()) {
				return re;
			}
		}
		return null;
	}
}
