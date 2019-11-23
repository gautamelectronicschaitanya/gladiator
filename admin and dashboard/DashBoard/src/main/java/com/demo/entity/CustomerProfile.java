package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="USER_PROFILE")
public class CustomerProfile {

	@Id
	@Column(name="USERID")
	private int custid;
	@Column(name="NAME")
	private String custname;
	@Column(name="USERID")
	private long phonenumber;
	@Column(name="PHONE_NO")
	private String email;
	@Column(name="EMAIL")
	private String password;
	@Column(name="ADDRESS")
	private String address;
	
	
	@OneToMany
    CustomerBankDetails bankdetails;
	
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
