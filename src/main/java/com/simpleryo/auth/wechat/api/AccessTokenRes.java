package com.simpleryo.auth.wechat.api;

import lombok.Data;

/**
 * spring-social-wechat
 * 
 * @author <a href="mailto:lei.su@simpleryo.co.nz">sulei</a>
 * @version 18.6.27
 */
@Data
public class AccessTokenRes {

	private String accessToken;

	private String expiresIn;

	private String refreshToken;

	private String openid;

	private String scope;

	private String unionid;
}
