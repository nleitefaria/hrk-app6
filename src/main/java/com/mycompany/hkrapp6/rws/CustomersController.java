package com.mycompany.hkrapp6.rws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hkrapp6.entity.Customers;
import com.mycompany.hkrapp6.service.CustomersService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomersController {
	
	@Autowired
	CustomersService service;
	
	@GetMapping("/count")
	public Long count() {
		//Count
	    return service.count();
	}
	
	@GetMapping("/all")
	public List<Customers> findAll() {
	    return service.findAll();
	}
	
	@GetMapping("/all/{pageNum}")
	public Page<Customers> findAllPaged(@PathVariable Integer pageNum) {
	    return service.findAllPaged(pageNum - 1);
	}
	
	@PostMapping("/")
    public ResponseEntity<Customers> create(@RequestBody Customers customer)
	{       
        System.out.println("Creating customer"); 	
		try
		{
			service.save(customer);
			System.out.println("Done");
			return new ResponseEntity<Customers>(HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			System.out.println("An error ocurred while creating the entity");
			return new ResponseEntity<Customers>(HttpStatus.BAD_REQUEST);					
		}	
    }
	

}
