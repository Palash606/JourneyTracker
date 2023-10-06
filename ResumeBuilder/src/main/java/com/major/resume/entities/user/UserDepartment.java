package com.major.resume.entities.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDepartment {
	@Id
	private Integer id;
	private String departmentName;

	public UserDepartment(Integer id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

	public UserDepartment() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
