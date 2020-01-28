package com.mycompany.hkrapp6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.mycompany.hkrapp6.entity.Customers;

public interface CustomersService {
	
	Long count();
	Optional<Customers> findById(int id);
	List<Customers> findAll();
	Page<Customers> findAllPaged(int page);
	Customers update(int id, Customers customer);
	Customers save(Customers customer);

}
