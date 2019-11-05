package com.mycompany.hkrapp6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.mycompany.hkrapp6.entity.Shippers;
import com.mycompany.hkrapp6.entity.Suppliers;

public interface SuppliersRepository extends JpaRepository<Suppliers, Integer>, JpaSpecificationExecutor<Shippers>  {

}
