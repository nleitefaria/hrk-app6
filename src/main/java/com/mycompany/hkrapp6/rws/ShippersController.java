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
import com.mycompany.hkrapp6.entity.Shippers;
import com.mycompany.hkrapp6.entity.Suppliers;
import com.mycompany.hkrapp6.service.ShippersService;

@RestController
@RequestMapping("/api/v1/shipper")
public class ShippersController {
	
	@Autowired
	ShippersService service;
	
	@GetMapping("/count")
	public Long count() {
		//Count
	    return service.count();
	}
	
	@GetMapping("/all")
	public List<Shippers> findAll() {
	    return service.findAll();
	}
	
	@GetMapping("/all/{pageNum}")
	public Page<Shippers> findAllPaged(@PathVariable Integer pageNum) {
	    return service.findAllPaged(pageNum - 1);
	}
	
	@PostMapping("/")
    public ResponseEntity<Shippers> create(@RequestBody Shippers shipper)
	{
		try
		{
			service.save(shipper);			
			return new ResponseEntity<Shippers>(HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Shippers>(HttpStatus.BAD_REQUEST);					
		}	
    }

}
