package com.mycompany.hkrapp6.service;

import java.util.List;
import org.springframework.data.domain.Page;
import com.mycompany.hkrapp6.entity.Shippers;

public interface ShippersService 
{
	Long count();
	List<Shippers> findAll();
	Page<Shippers> findAllPaged(int page);
	Shippers save(Shippers shipper);
	
}
