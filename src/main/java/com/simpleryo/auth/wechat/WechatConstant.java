package com.simpleryo.auth.wechat;

/**
 * spring-social-wechat
 * 
 * @author <a href="mailto:lei.su@simpleryo.co.nz">sulei</a>
 * @version 18.6.27
 */
public class WechatConstant {
	
	public static final String LANG = "en"; // zh-CN or en

	public static final String AUTH_API_URL = "https://api.weixin.qq.com/sns/auth";

	public static final String ACCESS_TOKEN_API_URL = "https://api.weixin.qq.com/sns/oauth2/access_token";

	public static final String REFRESH_TOKEN_API_URL = "https://api.weixin.qq.com/sns/oauth2/refresh_token";

	public static final String USERINFO_API_URL = "https://api.weixin.qq.com/sns/userinfo";

	public static final String AUTHORIZE_API_URL = "https://open.weixin.qq.com/connect/oauth2/authorize";
	
	public static final String QRCONNECT_API_URL = "https://open.weixin.qq.com/connect/qrconnect";

}
