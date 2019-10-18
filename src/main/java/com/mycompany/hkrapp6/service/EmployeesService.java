package com.mycompany.hkrapp6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.hkrapp6.entity.Employees;
import com.mycompany.hkrapp6.repository.EmployeesRepository;

@Service
public class EmployeesService {
	
	@Autowired
	EmployeesRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public List<Employees> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Employees> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10));
    }

}
