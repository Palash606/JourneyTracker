package com.major.resume.entities.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentStrengths {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String studentStrength;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentBasicDetails studentBasicDetails;

	public StudentStrengths(Integer id, String studentStrength, StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.studentStrength = studentStrength;
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentStrengths() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentStrength() {
		return studentStrength;
	}

	public void setStudentStrength(String studentStrength) {
		this.studentStrength = studentStrength;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

}
