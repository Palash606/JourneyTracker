package com.major.resume.entities.student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class StudentCertificates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String certificateName;
	private Date dateOfCompletion;
	private String platform;
	private String digitalId;
	private String certificateUpload;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private StudentBasicDetails studentBasicDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public Date getDataOfCompletion() {
		return dateOfCompletion;
	}

	public void setDataOfCompletion(Date dataOfCompletion) {
		this.dateOfCompletion = dataOfCompletion;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getDigitalId() {
		return digitalId;
	}

	public void setDigitalId(String digitalId) {
		this.digitalId = digitalId;
	}

	public String getCertificateUpload() {
		return certificateUpload;
	}

	public void setCertificateUpload(String certificateUpload) {
		this.certificateUpload = certificateUpload;
	}

	public StudentCertificates(Integer id, String certificateName, Date dateOfCompletion, String platform,
			String digitalId, String certificateUpload) {
		super();
		this.id = id;
		this.certificateName = certificateName;
		this.dateOfCompletion = dateOfCompletion;
		this.platform = platform;
		this.digitalId = digitalId;
		this.certificateUpload = certificateUpload;
	}

	public StudentCertificates() {
	}

}