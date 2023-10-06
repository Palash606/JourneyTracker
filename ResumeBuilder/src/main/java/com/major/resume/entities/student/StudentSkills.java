package com.major.resume.entities.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentSkills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String skillName;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentBasicDetails studentBasicDetails;

	public StudentSkills(Integer id, String skillName, StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentSkills() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

}
