package com.mycompany.hkrapp6.rws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hkrapp6.service.CustomersService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomersController {
	
	@Autowired
	CustomersService service;
	
	@GetMapping("/count")
	public Long count() {
	    return service.count();
	}
	

}
