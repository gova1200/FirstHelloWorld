package com.helloworld.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
     @RequestMapping(value="/products")
     public String getProducts()
     {
    	 return "you reached to product page";
     }
}
