package com.mycompany.hkrapp6.service;

import java.util.List;
import org.springframework.data.domain.Page;
import com.mycompany.hkrapp6.entity.Orders;

public interface OrdersService {
	
	Long count();
	List<Orders> findAll();
	Page<Orders> findAllPaged(int page);

}
