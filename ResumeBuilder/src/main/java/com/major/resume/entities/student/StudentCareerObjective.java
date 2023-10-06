package com.major.resume.entities.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentCareerObjective {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String careerObjective;

	@OneToOne
	@JoinColumn(name = "student_id", referencedColumnName = "id")
	private StudentBasicDetails studentBasicDetails;

	public StudentCareerObjective(Integer id, String careerObjective, StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.careerObjective = careerObjective;
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentCareerObjective() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCareerObjective() {
		return careerObjective;
	}

	public void setCareerObjective(String careerObjective) {
		this.careerObjective = careerObjective;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

}
