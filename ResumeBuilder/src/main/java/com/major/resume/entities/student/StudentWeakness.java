package com.major.resume.entities.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentWeakness {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String studentWeakness;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentBasicDetails studentBasicDetails;

	public StudentWeakness(Integer id, String studentWeakness, StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.studentWeakness = studentWeakness;
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentWeakness() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentWeakness() {
		return studentWeakness;
	}

	public void setStudentWeakness(String studentWeakness) {
		this.studentWeakness = studentWeakness;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}
}