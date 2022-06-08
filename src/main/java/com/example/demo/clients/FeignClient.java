package com.example.demo.clients;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@org.springframework.cloud.openfeign.FeignClient(value="feignConsumer",url="http://localhost:8082")
@Component
public interface FeignClient {
	
	  @RequestMapping(method = RequestMethod.GET,value="/home") 
	  public String getHome();
	  
	  
	 
}
