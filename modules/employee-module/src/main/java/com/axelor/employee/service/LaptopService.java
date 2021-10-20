package com.axelor.employee.service;

import com.axelor.employee.db.Laptop;
import com.axelor.meta.CallMethod;

public interface LaptopService {

	public void validateDob(Laptop laptop);

	@CallMethod
	public String callService();
}
