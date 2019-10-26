package com.mycompany.hkrapp6.rws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hkrapp6.entity.Invoices;
import com.mycompany.hkrapp6.service.InvoicesService;

@RestController
@RequestMapping("/api/v1/invoice")
public class InvoicesController {
	
	@Autowired
	InvoicesService service;
	
	@GetMapping("/count")
	public Long count() {
		//Count
	    return service.count();
	}
	
	@GetMapping("/all")
	public List<Invoices> findAll() {
	    return service.findAll();
	}
	
	@GetMapping("/all/{pageNum}")
	public Page<Invoices> findAllPaged(@PathVariable Integer pageNum) {
	    return service.findAllPaged(pageNum - 1);
	}
	
	

}
