package org.model;

import java.util.Date;

public class StudRegistration {
	private String empName="MNrudu";
	private String address;
	private double salary =102.30;
	private Date selectedddate;
	private String country;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getSelectedddate() {
		return selectedddate;
	}

	public void setSelectedddate(Date selectedddate) {
		this.selectedddate = selectedddate;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	

}
