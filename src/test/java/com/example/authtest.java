package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class authtest {

	@Test
	public void authentication(){
		   userAuthentication ua=new userAuthentication();
		   String result = userAuthentication.auth("ibtisam","1234");
		   System.out.println(result);
		   assertEquals("Authentication succesful", result);
		   
	   }

}
