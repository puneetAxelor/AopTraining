package com.axelor.employee.module;

import com.axelor.app.AxelorModule;
import com.axelor.employee.service.LaptopService;
import com.axelor.employee.service.LaptopServiceImpl;

public class EmployeeModule extends AxelorModule {

	@Override
	public void configure() {
		bind(LaptopService.class).to(LaptopServiceImpl.class);
	}
}
