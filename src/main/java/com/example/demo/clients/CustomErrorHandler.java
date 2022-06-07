package com.example.demo.clients;

import org.springframework.stereotype.Component;

import feign.Response;
import feign.codec.ErrorDecoder;
@Component
public class CustomErrorHandler implements ErrorDecoder{

	@Override
	public Exception decode(String methodKey, Response response) {
		if(response.status()==404) {
			return new Exception("Service down");
		}
		return new Exception("Error code mismatch!!") ;
	}

}
