package io.netty.example.http.controller;

import java.util.Map;

import io.netty.handler.codec.http.FullHttpResponse;

public interface IController {

	//old
	public FullHttpResponse doCtr(Map<String, String> params);
	
	public FullHttpResponse doCtr(Map<String, String> params,String method);

	
}
