package com.mycompany.hkrapp6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.hkrapp6.entity.Shippers;
import com.mycompany.hkrapp6.repository.ShippersRepository;
import com.mycompany.hkrapp6.service.ShippersService;

@Service
public class ShippersServiceImpl implements ShippersService {
	
	@Autowired
	ShippersRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public List<Shippers> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Shippers> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC,"id")));
    }
	
	@Transactional
	public Shippers save(Shippers shipper) 
    {
        return repository.save(shipper);
    }

}
