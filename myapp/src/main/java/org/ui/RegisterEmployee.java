package org.ui;

import org.model.StudRegistration;

public class RegisterEmployee {

	StudRegistration studReg = new StudRegistration();

	public void register() {
		System.out.println(studReg.getEmpName());
		System.out.println(studReg.getSalary());
		System.out.println(studReg.getAddress());
		System.out.println(studReg.getSelectedddate());
		System.out.println(studReg.getCountry());
		

	}

	public StudRegistration getStudReg() {
		return studReg;
	}

	public void setStudReg(StudRegistration studReg) {
		this.studReg = studReg;
	}
	
	
}
