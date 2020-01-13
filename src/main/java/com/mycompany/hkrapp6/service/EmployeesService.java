package com.mycompany.hkrapp6.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.hkrapp6.entity.Employees;

public interface EmployeesService {
	
	Long count();
	List<Employees> findAll();
	Page<Employees> findAllPaged(int page);
	Employees save(Employees employee);

}
