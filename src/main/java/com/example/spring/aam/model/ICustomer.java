package com.example.spring.aam.model;

import java.util.Set;

public interface ICustomer {

	public int getCustomerID();

	public void setCustomerID(int customerID);

	public String getCustomerFirstName();

	public void setCustomerFirstName(String customerFirstName);

	public String getCustomerLastName();

	public void setCustomerLastName(String customerLastName);

	public String getCustomerAddress();

	public void setCustomerAddress(String customerAddress);

	public String getCustomerEmail();

	public void setCustomerEmail(String customerEmail);

	public Set<Customer> getReportedProblems();

	public void setReportedProblems(Set<Customer> reportedProblems);

}