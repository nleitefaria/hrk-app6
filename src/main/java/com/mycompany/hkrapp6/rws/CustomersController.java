package com.mycompany.hkrapp6.rws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("update/{id}") 	    
	public Customers update(@PathVariable String id, @RequestBody Customers customer)    {
		return service.update(Integer.parseInt(id), customer);	    
	}

	@PostMapping("/")
    public ResponseEntity<Customers> create(@RequestBody Customers customer)
	{       
		try
		{
			service.save(customer);			
			return new ResponseEntity<Customers>(HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Customers>(HttpStatus.BAD_REQUEST);					
		}	
    }
	
	
	

}
