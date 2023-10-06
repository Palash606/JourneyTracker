package com.major.resume.entities.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentAcademicDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String studentTenthSchoolName;
	private Double studentTenthPercentage;
	private String studentTenthBoard;
	private String studentTwelfthSchoolName;
	private Double studentTwelfthPercentage;
	private String studentTwelfthBoard;
	private Boolean studentArrears;
	private Double studentCurrentCgpa;

	@OneToOne
	@JoinColumn(name = "student_id", referencedColumnName = "id")
	private StudentBasicDetails studentBasicDetails;

	public StudentAcademicDetails() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentTenthSchoolName() {
		return studentTenthSchoolName;
	}

	public void setStudentTenthSchoolName(String studentTenthSchoolName) {
		this.studentTenthSchoolName = studentTenthSchoolName;
	}

	public Double getStudentTenthPercentage() {
		return studentTenthPercentage;
	}

	public void setStudentTenthPercentage(Double studentTenthPercentage) {
		this.studentTenthPercentage = studentTenthPercentage;
	}

	public String getStudentTenthBoard() {
		return studentTenthBoard;
	}

	public void setStudentTenthBoard(String studentTenthBoard) {
		this.studentTenthBoard = studentTenthBoard;
	}

	public String getStudentTwelfthSchoolName() {
		return studentTwelfthSchoolName;
	}

	public void setStudentTwelfthSchoolName(String studentTwelfthSchoolName) {
		this.studentTwelfthSchoolName = studentTwelfthSchoolName;
	}

	public Double getStudentTwelfthPercentage() {
		return studentTwelfthPercentage;
	}

	public void setStudentTwelfthPercentage(Double studentTwelfthPercentage) {
		this.studentTwelfthPercentage = studentTwelfthPercentage;
	}

	public String getStudentTwelfthBoard() {
		return studentTwelfthBoard;
	}

	public void setStudentTwelfthBoard(String studentTwelfthBoard) {
		this.studentTwelfthBoard = studentTwelfthBoard;
	}

	public Boolean getStudentArrears() {
		return studentArrears;
	}

	public void setStudentArrears(Boolean studentArrears) {
		this.studentArrears = studentArrears;
	}

	public Double getStudentCurrentCgpa() {
		return studentCurrentCgpa;
	}

	public void setStudentCurrentCgpa(Double studentCurrentCgpa) {
		this.studentCurrentCgpa = studentCurrentCgpa;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentAcademicDetails(Integer id, String studentTenthSchoolName, Double studentTenthPercentage,
			String studentTenthBoard, String studentTwelfthSchoolName, Double studentTwelfthPercentage,
			String studentTwelfthBoard, Boolean studentArrears, Double studentCurrentCgpa,
			StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.studentTenthSchoolName = studentTenthSchoolName;
		this.studentTenthPercentage = studentTenthPercentage;
		this.studentTenthBoard = studentTenthBoard;
		this.studentTwelfthSchoolName = studentTwelfthSchoolName;
		this.studentTwelfthPercentage = studentTwelfthPercentage;
		this.studentTwelfthBoard = studentTwelfthBoard;
		this.studentArrears = studentArrears;
		this.studentCurrentCgpa = studentCurrentCgpa;
		this.studentBasicDetails = studentBasicDetails;
	}

}
