package com.mycompany.hkrapp6.rws;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.hkrapp6.entity.Health;
import com.mycompany.hkrapp6.service.HealthService;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {
	
	@Autowired
	HealthService service;
	
	@GetMapping("/count")
	public Long count() {
		//Count
	    return service.count();
	}
		
	@GetMapping("/")
    public ResponseEntity<Health> create()
	{   
		Health health = new Health();
		health.setDescription("TST");
		health.setCreatedAt(new Date());
		try
		{
			service.save(health);			
			return new ResponseEntity<Health>(HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Health>(HttpStatus.BAD_REQUEST);					
		}	
    }
}
