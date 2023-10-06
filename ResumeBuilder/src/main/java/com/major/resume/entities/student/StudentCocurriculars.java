package com.major.resume.entities.student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentCocurriculars {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nameOfClub;
	private String positionAtClub;
	private Date startDate;
	private Date endDate;
	private String otherActivity;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentBasicDetails studentBasicDetails;

	public StudentCocurriculars(Integer id, String nameOfClub, String positionAtClub, Date startDate, Date endDate,
			String otherActivity, StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.nameOfClub = nameOfClub;
		this.positionAtClub = positionAtClub;
		this.startDate = startDate;
		this.endDate = endDate;
		this.otherActivity = otherActivity;
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentCocurriculars() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameOfClub() {
		return nameOfClub;
	}

	public void setNameOfClub(String nameOfClub) {
		this.nameOfClub = nameOfClub;
	}

	public String getPositionAtClub() {
		return positionAtClub;
	}

	public void setPositionAtClub(String positionAtClub) {
		this.positionAtClub = positionAtClub;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOtherActivity() {
		return otherActivity;
	}

	public void setOtherActivity(String otherActivity) {
		this.otherActivity = otherActivity;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

}
