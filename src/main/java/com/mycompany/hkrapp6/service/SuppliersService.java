package com.mycompany.hkrapp6.service;

import java.util.List;

import org.springframework.data.domain.Page;
import com.mycompany.hkrapp6.entity.Suppliers;

public interface SuppliersService {
	
	Long count();
	List<Suppliers> findAll();
	Page<Suppliers> findAllPaged(int page);
	Suppliers save(Suppliers customer);
	
}
