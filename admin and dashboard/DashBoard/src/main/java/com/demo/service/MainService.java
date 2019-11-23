package com.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.CustomerEmiDetails;
import com.demo.entity.CustomerProfile;
import com.demo.repository.MainRepository;

@Service
public class MainService {

	

	@Autowired
    MainRepository repo;
	
	public List<CustomerProfile> GetEmiDetails()
	{
	   List<CustomerProfile> custdetails = (List<CustomerProfile>)repo.fectchCustomerDetails(CustomerEmiDetails.class,101);
	   return custdetails;
	}
	
	
}
