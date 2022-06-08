package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clients.FeignClient;

import feign.FeignException;

@SpringBootApplication
@RestController
@EnableFeignClients
public class FeignConsumerApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}
	
	  @Autowired
	  FeignClient feignClient;
	
	  @GetMapping("/test")
	  public String home() {
		  try {
		  return feignClient.getHome(); 
		  }
		  
		  catch(FeignException e) {
			  return "Generic CAught exeception!!";
		  }
	  }
	 
	
	

}
