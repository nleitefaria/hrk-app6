package com.mycompany.hkrapp6.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.hkrapp6.entity.Customers;

public interface CustomersService {
	
	Long count();
	List<Customers> findAll();
	Page<Customers> findAllPaged(int page) ;

}
