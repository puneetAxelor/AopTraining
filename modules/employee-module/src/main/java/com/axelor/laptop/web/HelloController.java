package com.axelor.laptop.web;

import com.axelor.meta.CallMethod;

public class HelloController {

	@CallMethod
	  public String say(String what) {
		System.out.println("Method called");
	    return "About: " + what;
	  }
}
