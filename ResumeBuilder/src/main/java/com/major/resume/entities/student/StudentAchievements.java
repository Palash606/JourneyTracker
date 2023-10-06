package com.major.resume.entities.student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentAchievements {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String achievementName;
	private Date achievementDate;
	private Integer achievementSemester;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentBasicDetails studentBasicDetails;

	public StudentAchievements(Integer id, String achievementName, Date achievementDate, Integer achievementSemester,
			StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.achievementName = achievementName;
		this.achievementDate = achievementDate;
		this.achievementSemester = achievementSemester;
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentAchievements() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAchievementName() {
		return achievementName;
	}

	public void setAchievementName(String achievementName) {
		this.achievementName = achievementName;
	}

	public Date getAchievementDate() {
		return achievementDate;
	}

	public void setAchievementDate(Date achievementDate) {
		this.achievementDate = achievementDate;
	}

	public Integer getAchievementSemester() {
		return achievementSemester;
	}

	public void setAchievementSemester(Integer achievementSemester) {
		this.achievementSemester = achievementSemester;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

}
