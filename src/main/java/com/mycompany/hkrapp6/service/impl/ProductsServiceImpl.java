package com.mycompany.hkrapp6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.hkrapp6.entity.Products;
import com.mycompany.hkrapp6.repository.ProductsRepository;
import com.mycompany.hkrapp6.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService{
	
	@Autowired
	ProductsRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public List<Products> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Products> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10));
    }

}