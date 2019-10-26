package com.mycompany.hkrapp6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.mycompany.hkrapp6.entity.Customers;
import com.mycompany.hkrapp6.repository.CustomersRepository;
import com.mycompany.hkrapp6.service.CustomersService;

@Service
public class CustomersServiceImpl implements CustomersService {
	
	@Autowired
	CustomersRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public List<Customers> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Customers> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10));
    }
	
}
