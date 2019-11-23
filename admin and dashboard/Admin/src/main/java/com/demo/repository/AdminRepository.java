/**
 * @author Chaitanay Gautam
 * This is a administrator repository class use to create a link between the various layers with the RDBMS
 */
package com.demo.repository;
import com.demo.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.TransactionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class AdminRepository {
	  
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Object object){
		entityManager.merge(object);
	}
	
	@Transactional
	public Object fetchById(Class clazz, Object pk){
		return entityManager.find(clazz,pk);
	}
	
   @Transactional
   public List<BankDetails> fetchbyPk(int uid)
   {
	   String selectQuery="Select c from BankDetails c where c.usd.USERID=:uid";
		  Query q=entityManager.createQuery(selectQuery);
		  q.setParameter("uid",uid);
		  @SuppressWarnings("unchecked")
		List<BankDetails> bk =q.getResultList();
         return bk;
   }
   
  @Transactional
   public AdminDetails fetchAll()
   {
	   String selectQuery ="Select d from AdminDetails as d";
	   Query q=entityManager.createQuery(selectQuery);
	   @SuppressWarnings("unchecked")
	List<AdminDetails> bk =q.getResultList();
	   System.out.println("size ==== " + bk.size());
	   return bk.get(0);
   }

  @Transactional
  public List<UserDetails> FectAllUserDetails()
  {
	  UserDetails ud;
	  String selectQuery ="Select d from UserDetails as d";
	  Query q = entityManager.createQuery(selectQuery);
	 List<UserDetails> uds = q.getResultList();
	  return uds;
  }
  
  
  @Transactional
  public AuthDetails UpdateStatusByPk (int pk)
  {
	   String selectQuery="Select c from AuthDetails c where c.userDetails.USERID=:uid";
		  Query q=entityManager.createQuery(selectQuery);
		  q.setParameter("uid",pk);
		  ArrayList<AuthDetails> ad = (ArrayList<AuthDetails>) q.getResultList();
         return ad.get(0);
  }
  
  public List<UserDetails> fetchAllStatus()
  {
	   String selectQuery ="Select d from UserDetails as d where d.authDetails.status = 'fail'";
	   Query q=entityManager.createQuery(selectQuery);
	List<UserDetails> bk =q.getResultList();
	   return bk;
  }
 
  
   
}
