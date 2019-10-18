package com.mycompany.hkrapp6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.mycompany.hkrapp6.entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer>, JpaSpecificationExecutor<Customers>  {

}
