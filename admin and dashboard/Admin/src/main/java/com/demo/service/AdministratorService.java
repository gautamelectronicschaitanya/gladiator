/**
 * @author Chaitanay Gautam
 * This is the Administrator Service class holding business logic
 */

package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.AdminDetails;
import com.demo.entity.AuthDetails;
import com.demo.repository.AdminRepository;

@Service()
public class AdministratorService {

	@Autowired
	AdminRepository adminrepo;

	    public boolean LoginValidate(String adminName, String adminPassword) {
		AdminDetails ad = (AdminDetails) adminrepo.fetchAll();
		if (ad.getAdminPassword().equals(adminPassword) && ad.getAdminName().equals(adminName)) {
			return true;
		} else {
			return false;
		}
	}

	public String CheckStatus(int user_id) {
		AuthDetails ad = (AuthDetails) adminrepo.fetchById(AuthDetails.class, user_id);
		return ad.getStatus();
	}

	public void UpDateStatus(int user_id, String status) {
		AuthDetails ad = (AuthDetails) adminrepo.fetchById(AuthDetails.class, user_id);
		ad.setStatus(status);
		adminrepo.add(ad);
	}

}
