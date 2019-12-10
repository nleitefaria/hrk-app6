package com.mycompany.hkrapp6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mycompany.hkrapp6.entity.Suppliers;
import com.mycompany.hkrapp6.repository.SuppliersRepository;
import com.mycompany.hkrapp6.service.SuppliersService;

@Service
public class SuppliersServiceImpl implements SuppliersService{
	
	@Autowired
	SuppliersRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public List<Suppliers> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Suppliers> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC,"id")));
    }

}
