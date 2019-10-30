package com.mycompany.hkrapp6.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.hkrapp6.entity.Products;

public interface ProductsService {
	
	Long count();
	List<Products> findAll();
	Page<Products> findAllPaged(int page);

}
