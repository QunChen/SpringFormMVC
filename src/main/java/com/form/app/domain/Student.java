package com.form.app.domain;

public class Student {
	private String name;
	private String email;
	private String password;
	private Boolean isPR;
	
	
	
	public Student(String name, String email, String password, Boolean isPR) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.isPR = isPR;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", password="
				+ password + ", isPR=" + isPR + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Boolean getIsPR() {
		return isPR;
	}
	public void setIsPR(Boolean isPR) {
		this.isPR = isPR;
	}
	
	
	
}
