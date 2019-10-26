package com.mycompany.hkrapp6.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.hkrapp6.entity.Invoices;

public interface InvoicesService {
	
	Long count();
	List<Invoices> findAll();
	Page<Invoices> findAllPaged(int page);

}
