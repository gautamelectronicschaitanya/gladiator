package com.demo.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="EMI_DETAILS")
public class CustomerEmiDetails {

	@Id
	@Column(name="TRANSACTION_NO")
	private int transactionid;
	@Column(name="EMI_OPTION")
	private String emioptions;
	@Column(name="INSTALLMENT")
	private long installment;
	@Column(name="START_DATE")
	private LocalDate startdate;
	@Column(name="END_DATE")
	private LocalDate enddate;
	@Column(name="LATE_FEE")
	private LocalDate latedate;
	@Column(name="	PAID_INSTALLMENT")
	private long paidinstallment;
	@Column(name="PENDING_INSTALLMENT")
	private long pendindisntallment;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public String getEmioptions() {
		return emioptions;
	}
	public void setEmioptions(String emioptions) {
		this.emioptions = emioptions;
	}
	public long getInstallment() {
		return installment;
	}
	public void setInstallment(long installment) {
		this.installment = installment;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	public LocalDate getLatedate() {
		return latedate;
	}
	public void setLatedate(LocalDate latedate) {
		this.latedate = latedate;
	}
	public long getPaidinstallment() {
		return paidinstallment;
	}
	public void setPaidinstallment(long paidinstallment) {
		this.paidinstallment = paidinstallment;
	}
	public long getPendindisntallment() {
		return pendindisntallment;
	}
	public void setPendindisntallment(long pendindisntallment) {
		this.pendindisntallment = pendindisntallment;
	}
}
	
	
	

	
	
	
	
	

	
	
	
