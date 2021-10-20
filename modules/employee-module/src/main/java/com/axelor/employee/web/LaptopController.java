package com.axelor.employee.web;


import com.axelor.employee.db.College;
import com.axelor.employee.db.Laptop;
import com.axelor.employee.db.repo.LaptopRepository;
import com.axelor.employee.service.LaptopService;
import com.axelor.inject.Beans;
import com.axelor.meta.schema.actions.ActionView;
import com.axelor.meta.schema.actions.ActionView.ActionViewBuilder;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Context;

public class LaptopController {

	public void exampleMethod(ActionRequest request, ActionResponse response) {
		Context context = request.getContext();
		
		System.err.println("Current Context "+context);
		
		Context parentContext = context.getParent();
		
		System.err.println("Parent Context: "+parentContext);
		
		Laptop laptop = context.asType(Laptop.class);
		
		System.err.println(laptop);
		if(laptop.getId() != null) {
			laptop = Beans.get(LaptopRepository.class).find(laptop.getId());
		}
			
		System.err.println("Parent Context: "+parentContext);
		System.err.println(laptop);
		
		Beans.get(LaptopService.class).validateDob(laptop);
		
		
//		response.setAlert("Hello");
//		response.setError("Error Message");
//		response.setNotify("Notify Message");
		response.setFlash("Flash Message");
		
		response.setAttr("test", "title", "Title Changed");
		
		ActionViewBuilder actionViewBuilder = ActionView.define("Colleges").model(College.class.getName()).add("grid", "college-grid");
		response.setView(actionViewBuilder.map());
	}

}
