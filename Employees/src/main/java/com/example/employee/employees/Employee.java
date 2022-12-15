package com.example.employee.employees;

public class Employee {
	private String fastName;
	private String lastName;

	public Employee(String fastName, String lastName) {
		super();
		this.fastName = fastName;
		this.lastName = lastName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFastName() {
		return fastName;
	}

	public void setFastName(String fastName) {
		this.fastName = fastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [fastName=" + fastName + ", lastName=" + lastName + "]";
	}

}
