package com.google.api.gwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class OAuth2Token extends JavaScriptObject{
	
	public static final OAuth2Token newInstance(String accessToken){
		return newNativeInstance(accessToken);
	}
	
	protected OAuth2Token(){}
	
	private static final native OAuth2Token newNativeInstance(String token)/*-{
		return {access_token: token};
	}-*/;
	
	public final native String getAccessToken() /*-{
		return this.access_token;
	}-*/;
	
	public final native String getError() /*-{
		return this.error;
	}-*/;
	
	public final native String getExpiresIn() /*-{
		return this.expires_in;
	}-*/;
	
	public final native String getSate() /*-{
		return this.state;
	}-*/;

}
