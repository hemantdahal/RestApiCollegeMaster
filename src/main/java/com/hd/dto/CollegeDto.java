package com.hd.dto;

public class CollegeDto {
	private String name;
	private String qualification;
	private String major;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "CollegeDto [name=" + name + ", qualification=" + qualification + ", major=" + major + "]";
	}
	

}
