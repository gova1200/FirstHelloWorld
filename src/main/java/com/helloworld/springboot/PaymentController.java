package com.helloworld.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController 
{
   @RequestMapping(value="/payments")
      public String getPayments() 
   {
	   return "you reached payments page";
   }
    
   @RequestMapping(value="/payments/gpay")
   public String getGpayPayments() 
   {
	   return "you reached GPAY payments page";
   }
   
   
   @RequestMapping(value="/payments/credit")
   public String getCreditPayments() 
    {
	   return "you reached credit payments page";
    }
}
