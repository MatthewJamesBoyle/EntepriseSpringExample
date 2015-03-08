package com.example.spring.aam.model;

import java.util.Date;

public class Works implements IWorks {

	private int workID;
	private Customer customerID;
	private Date workStartDate = new Date(), workEndDate = new Date();
	private Asset assetID;

	public int getWorkID() {
		return workID;
	}

	public void setWorkID(int workID) {
		this.workID = workID;
	}

	public Customer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Customer customerID) {
		this.customerID = customerID;
	}

	public Date getWorkStartDate() {
		return workStartDate;
	}

	public void setWorkStartDate(Date workStartDate) {
		this.workStartDate = workStartDate;
	}

	public Date getWorkEndDate() {
		return workEndDate;
	}

	public void setWorkEndDate(Date workEndDate) {
		this.workEndDate = workEndDate;
	}

	public Asset getAssetID() {
		return assetID;
	}

	public void setAssetID(Asset assetID) {
		this.assetID = assetID;
	}

}
