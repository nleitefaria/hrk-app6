package com.mycompany.hkrapp6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.hkrapp6.entity.Health;
import com.mycompany.hkrapp6.repository.HealthRepository;
import com.mycompany.hkrapp6.service.HealthService;

@Service
public class HealthServiceImpl implements HealthService{
	
	@Autowired
	HealthRepository repository;
		
	public Long count()
	{
		return repository.count();
	}

	@Transactional
	public Health save(Health health) 
	{
		return repository.save(health);
	}
	
	

}
