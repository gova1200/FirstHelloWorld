package com.helloworld.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {
   @RequestMapping(value="/discounts")
   
   public String getDiscounts()
   {
	   return "you reached discounts page";
   }
}
