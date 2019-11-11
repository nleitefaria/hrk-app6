package com.mycompany.hkrapp6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mycompany.hkrapp6.entity.Orders;
import com.mycompany.hkrapp6.repository.OrdersRepository;
import com.mycompany.hkrapp6.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	OrdersRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public List<Orders> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Orders> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10));
    }

}
