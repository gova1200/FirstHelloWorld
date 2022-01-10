package com.helloworld.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{

	@RequestMapping(value="/")
		public String getHelloWorld()
		{
			return("Welcome to springboot  :), HelloWorld through spring Approach");
		}
	
	@RequestMapping(value="/other")
	public String getOtherHelloWorld()
	{
		return("Welcome to springboot  :),==>getOtherHelloWorld");
	}
}
