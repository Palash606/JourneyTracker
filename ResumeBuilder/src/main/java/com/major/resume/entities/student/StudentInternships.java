package com.major.resume.entities.student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentInternships {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String internshipName;
	private String organizationName;
	private Date startDate;
	private Date endDate;
	private String internshipCertificate;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentBasicDetails studentBasicDetails;

	public StudentInternships(Integer id, String internshipName, String organizationName, Date startDate, Date endDate,
			String internshipCertificate, StudentBasicDetails studentBasicDetails) {
		super();
		this.id = id;
		this.internshipName = internshipName;
		this.organizationName = organizationName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.internshipCertificate = internshipCertificate;
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentInternships() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInternshipName() {
		return internshipName;
	}

	public void setInternshipName(String internshipName) {
		this.internshipName = internshipName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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

	public String getInternshipCertificate() {
		return internshipCertificate;
	}

	public void setInternshipCertificate(String internshipCertificate) {
		this.internshipCertificate = internshipCertificate;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

}
