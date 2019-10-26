package com.mycompany.hkrapp6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.hkrapp6.entity.Invoices;
import com.mycompany.hkrapp6.repository.InvoicesRepository;
import com.mycompany.hkrapp6.service.InvoicesService;

@Service
public class InvoicesServiceImpl implements InvoicesService {
	
	@Autowired
	InvoicesRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public List<Invoices> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Invoices> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10));
    }

}
