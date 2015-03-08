package com.example.spring.aam.model;

import java.util.Set;

public class Customer implements ICustomer {

	private int customerID;
	private String customerFirstName, customerLastName, customerAddress,
			customerEmail;
	private Set<Customer> reportedProblems;

	public Set<Customer> getReportedProblems() {
		return reportedProblems;
	}

	public void setReportedProblems(Set<Customer> reportedProblems) {
		this.reportedProblems = reportedProblems;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.ICustomer#getCustomerID()
	 */
	@Override
	public int getCustomerID() {
		return customerID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.ICustomer#setCustomerID(int)
	 */
	@Override
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.ICustomer#getCustomerFirstName()
	 */
	@Override
	public String getCustomerFirstName() {
		return customerFirstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.model.ICustomer#setCustomerFirstName(java.lang
	 * .String)
	 */
	@Override
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.ICustomer#getCustomerLastName()
	 */
	@Override
	public String getCustomerLastName() {
		return customerLastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.model.ICustomer#setCustomerLastName(java.lang.
	 * String)
	 */
	@Override
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.ICustomer#getCustomerAddress()
	 */
	@Override
	public String getCustomerAddress() {
		return customerAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.model.ICustomer#setCustomerAddress(java.lang.String
	 * )
	 */
	@Override
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.ICustomer#getCustomerEmail()
	 */
	@Override
	public String getCustomerEmail() {
		return customerEmail;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.model.ICustomer#setCustomerEmail(java.lang.String)
	 */
	@Override
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
