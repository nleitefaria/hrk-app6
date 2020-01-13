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

import com.mycompany.hkrapp6.entity.Employees;
import com.mycompany.hkrapp6.service.EmployeesService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeesController {
	
	@Autowired
	EmployeesService service;
	
	@GetMapping("/count")
	public Long count() {
	    return service.count();
	}
	
	@GetMapping("/all")
	public List<Employees> findAll() {
	    return service.findAll();
	}
	
	@GetMapping("/all/{pageNum}")
	public Page<Employees> findAllPaged(@PathVariable Integer pageNum) {
	    return service.findAllPaged(pageNum - 1);
	}
	
	@PostMapping("/")
    public ResponseEntity<Employees> create(@RequestBody Employees employee)
	{
		try
		{
			service.save(employee);			
			return new ResponseEntity<Employees>(HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Employees>(HttpStatus.BAD_REQUEST);					
		}	
    }

}
