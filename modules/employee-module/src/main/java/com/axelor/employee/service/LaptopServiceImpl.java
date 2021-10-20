package com.axelor.employee.service;

import com.axelor.employee.db.Laptop;

public class LaptopServiceImpl implements LaptopService{

	@Override
	public void validateDob(Laptop laptop) {
		
		System.err.println("Inside Laptop Service Implementation");
	}

	@Override
	public String callService() {
		
		return "Hello from service method";
		
	}

}
