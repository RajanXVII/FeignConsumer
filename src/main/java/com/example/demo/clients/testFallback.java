package com.example.demo.clients;

public class testFallback implements FeignClient{

	@Override
	public String getHome() {
		
		return "Fallback called";
	}

}
