package com.mycompany.hkrapp6.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.hkrapp6.entity.Customers;
import com.mycompany.hkrapp6.repository.CustomersRepository;
import com.mycompany.hkrapp6.service.CustomersService;

import org.springframework.data.domain.Sort;

@Service
public class CustomersServiceImpl implements CustomersService {
	
	@Autowired
	CustomersRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
	
	public Optional<Customers> findById(int id)
	{
		return repository.findById(id);
	}
	
	public List<Customers> findAll()
	{
		return repository.findAll();
	}
	
	public Page<Customers> findAllPaged(int page) 
    {
        return repository.findAll(PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC,"id")));
    }
	
	@Transactional
	public Customers save(Customers customer) 
    {
        return repository.save(customer);
    }
	
	@Transactional
	public Customers update(Customers customer) 
    {	
		if(customer != null)
		{
			return repository.save(customer);
		}	
        return null;
    }

	@Override
	public Customers update(int id, Customers newCustomer) {		
		Optional<Customers> c = repository.findById(id);		
		Customers customer = c.get();				
		if(customer != null)
		{			
			if(newCustomer.getCompany() != null)
			{
				customer.setCompany(newCustomer.getCompany());
			}
			
			if(newCustomer.getLastName() != null)
			{
				customer.setLastName(newCustomer.getLastName());				
			}
			
			if(newCustomer.getFirstName() != null)
			{
				customer.setFirstName(newCustomer.getFirstName());		
			}
			
			if(newCustomer.getJobTitle() != null)
			{
				customer.setJobTitle(newCustomer.getJobTitle());		
			}
			
			if(newCustomer.getBusinessPhone() != null)
			{
				customer.setBusinessPhone(newCustomer.getBusinessPhone());		
			}
			
			if(newCustomer.getHomePhone() != null)
			{
				customer.setHomePhone(newCustomer.getHomePhone());		
			}
			
			if(newCustomer.getMobilePhone() != null)
			{
				customer.setMobilePhone(newCustomer.getMobilePhone());		
			}
			
			if(newCustomer.getFaxNumber() != null)
			{
				customer.setFaxNumber(newCustomer.getFaxNumber());		
			}
			
			if(newCustomer.getAddress() != null)
			{
				customer.setAddress(newCustomer.getAddress());		
			}
			
			if(newCustomer.getCity() != null)
			{
				customer.setCity(newCustomer.getCity());		
			}
			
			if(newCustomer.getStateProvince() != null)
			{
				customer.setStateProvince(newCustomer.getStateProvince());		
			}
			
			if(newCustomer.getZipPostalCode() != null)
			{
				customer.setZipPostalCode(newCustomer.getZipPostalCode());		
			}
			
			if(newCustomer.getCountryRegion() != null)
			{
				customer.setCountryRegion(newCustomer.getCountryRegion());		
			}
			
			if(newCustomer.getWebPage() != null)
			{
				customer.setWebPage(newCustomer.getWebPage());		
			}

			return repository.save(customer);	
		}	
        return null;
	}
	
}
