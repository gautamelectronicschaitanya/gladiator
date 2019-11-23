package com.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class MainRepository {

	@PersistenceContext
     private EntityManager entitymanager;
	
	@Transactional
	public void save(Object obj)
	{
		entitymanager.merge(obj);
	}
	
	public Object fectchCustomerDetails(Class cls, Object pk)
	{
		return entitymanager.find(cls, pk);	
	}

}
