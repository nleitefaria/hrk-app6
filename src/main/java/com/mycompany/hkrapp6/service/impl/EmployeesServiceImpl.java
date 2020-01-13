package com.mycompany.hkrapp6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.hkrapp6.entity.Customers;
import com.mycompany.hkrapp6.entity.Employees;
import com.mycompany.hkrapp6.repository.EmployeesRepository;
import com.mycompany.hkrapp6.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService{
	
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
        return repository.findAll(PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC,"id")));
    }
	
	@Transactional
	public Employees save(Employees employee) 
    {
        return repository.save(employee);
    }

}
