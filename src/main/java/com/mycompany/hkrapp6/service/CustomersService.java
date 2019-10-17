package com.mycompany.hkrapp6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.hkrapp6.repository.CustomersRepository;

@Service
public class CustomersService {
	
	@Autowired
	CustomersRepository repository;
	
	public Long count()
	{
		return repository.count();
	}

}
