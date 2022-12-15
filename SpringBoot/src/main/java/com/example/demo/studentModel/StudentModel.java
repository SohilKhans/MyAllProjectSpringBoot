package com.example.demo.studentModel;

public class StudentModel {
	private Long id;
	private String name;
	private int age;
	private String myAddress;
	private Long phone;
	private String city;
	private int pincode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMyAddress() {
		return myAddress;
	}

	public void setMyAddress(String myAddress) {
		this.myAddress = myAddress;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", age=" + age + ", myAddress=" + myAddress + ", phone="
				+ phone + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
