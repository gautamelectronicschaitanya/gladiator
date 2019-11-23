package com.demo.entity;

import java.time.LocalDate;

import javax.persistence.*;

public class CustomerCardDetails {
	
	@Id
	@Column(name="CARD_NUMBER")
	private int cardno;
	@Column(name="CARD_TYPE")
	private String cardtype;
	@Column(name="CARD_LIMIT")
	private long cardlimit;
	@Column(name="CARD_STATUS")
	private String cardstatus;
	@Column(name="ISSUE_DATE")
	private LocalDate issuedate;
	@Column(name="VALID_TILL")
	private LocalDate expirydate;
	@Column(name="TOTAL_CREDIT")
	private long totalcredit;
	@Column(name="USED_CREDIT")
	private long usedcredit;
	@Column(name="REMAINING_CREDIT")
	private long remaincredit;
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public long getCardlimit() {
		return cardlimit;
	}
	public void setCardlimit(long cardlimit) {
		this.cardlimit = cardlimit;
	}
	public String getCardstatus() {
		return cardstatus;
	}
	public void setCardstatus(String cardstatus) {
		this.cardstatus = cardstatus;
	}
	public LocalDate getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(LocalDate issuedate) {
		this.issuedate = issuedate;
	}
	public LocalDate getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(LocalDate expirydate) {
		this.expirydate = expirydate;
	}
	public long getTotalcredit() {
		return totalcredit;
	}
	public void setTotalcredit(long totalcredit) {
		this.totalcredit = totalcredit;
	}
	public long getUsedcredit() {
		return usedcredit;
	}
	public void setUsedcredit(long usedcredit) {
		this.usedcredit = usedcredit;
	}
	public long getRemaincredit() {
		return remaincredit;
	}
	public void setRemaincredit(long remaincredit) {
		this.remaincredit = remaincredit;
	}
	
	
	
	
	
	
	
	
	
	
	
}
