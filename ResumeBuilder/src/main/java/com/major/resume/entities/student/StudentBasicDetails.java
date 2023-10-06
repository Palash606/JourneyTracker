package com.major.resume.entities.student;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class StudentBasicDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String studentName;
	@Column(name = "student_scholar", unique = true)
	private String studentScholar;
	@Enumerated(EnumType.STRING)
	private StudentGender studentGender;
	private String studentDept;
	private Integer studentSemester;
	private Integer studentSection;
	@Column(unique = true)
	private String studentCollegeEmail;
	@Column(unique = true)
	private String studentPersonalEmail;
	@Column(unique = true)
	private String studentGithub;
	@Column(unique = true)
	private String studentLinkedin;
	private String studentAddress;
	@Column(unique = true)
	private String studentPhone;
	@Column(unique = true)
	private String studentEnrollmentNo;
	private String studentPhoto;
	private String studentCategory;

	@OneToOne(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private StudentAcademicDetails studentAcademicDetails;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentCertificates> studentCertificates;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentProjects> studentProjects;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentInternships> studentInternships;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentSkills> studentSkills;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentAchievements> studentAchievements;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentCocurriculars> studentCocurriculars;

	@OneToOne(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private StudentCareerObjective studentCareerObjective;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentStrengths> studentStrengths;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentHobbies> studentHobbies;

	@OneToMany(mappedBy = "studentBasicDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StudentWeakness> studentWeaknesses;

	public StudentBasicDetails(Integer id, String studentName, String studentScholar, StudentGender studentGender,
			String studentDept, Integer studentSemester, Integer studentSection, String studentCollegeEmail,
			String studentPersonalEmail, String studentGithub, String studentLinkedin, String studentAddress,
			String studentPhone, String studentEnrollmentNo, String studentPhoto, String studentCategory,
			StudentAcademicDetails studentAcademicDetails, List<StudentCertificates> studentCertificates,
			List<StudentProjects> studentProjects, List<StudentInternships> studentInternships,
			List<StudentSkills> studentSkills, List<StudentAchievements> studentAchievements,
			List<StudentCocurriculars> studentCocurriculars, StudentCareerObjective studentCareerObjective,
			List<StudentStrengths> studentStrengths, List<StudentHobbies> studentHobbies,
			List<StudentWeakness> studentWeaknesses) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentScholar = studentScholar;
		this.studentGender = studentGender;
		this.studentDept = studentDept;
		this.studentSemester = studentSemester;
		this.studentSection = studentSection;
		this.studentCollegeEmail = studentCollegeEmail;
		this.studentPersonalEmail = studentPersonalEmail;
		this.studentGithub = studentGithub;
		this.studentLinkedin = studentLinkedin;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
		this.studentEnrollmentNo = studentEnrollmentNo;
		this.studentPhoto = studentPhoto;
		this.studentCategory = studentCategory;
		this.studentAcademicDetails = studentAcademicDetails;
		this.studentCertificates = studentCertificates;
		this.studentProjects = studentProjects;
		this.studentInternships = studentInternships;
		this.studentSkills = studentSkills;
		this.studentAchievements = studentAchievements;
		this.studentCocurriculars = studentCocurriculars;
		this.studentCareerObjective = studentCareerObjective;
		this.studentStrengths = studentStrengths;
		this.studentHobbies = studentHobbies;
		this.studentWeaknesses = studentWeaknesses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentScholar() {
		return studentScholar;
	}

	public void setStudentScholar(String studentScholar) {
		this.studentScholar = studentScholar;
	}

	public StudentGender getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(StudentGender studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentDept() {
		return studentDept;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	public Integer getStudentSemester() {
		return studentSemester;
	}

	public void setStudentSemester(Integer studentSemester) {
		this.studentSemester = studentSemester;
	}

	public Integer getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(Integer studentSection) {
		this.studentSection = studentSection;
	}

	public String getStudentCollegeEmail() {
		return studentCollegeEmail;
	}

	public void setStudentCollegeEmail(String studentCollegeEmail) {
		this.studentCollegeEmail = studentCollegeEmail;
	}

	public String getStudentPersonalEmail() {
		return studentPersonalEmail;
	}

	public void setStudentPersonalEmail(String studentPersonalEmail) {
		this.studentPersonalEmail = studentPersonalEmail;
	}

	public String getStudentGithub() {
		return studentGithub;
	}

	public void setStudentGithub(String studentGithub) {
		this.studentGithub = studentGithub;
	}

	public String getStudentLinkedin() {
		return studentLinkedin;
	}

	public void setStudentLinkedin(String studentLinkedin) {
		this.studentLinkedin = studentLinkedin;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentEnrollmentNo() {
		return studentEnrollmentNo;
	}

	public void setStudentEnrollmentNo(String studentEnrollmentNo) {
		this.studentEnrollmentNo = studentEnrollmentNo;
	}

	public String getStudentPhoto() {
		return studentPhoto;
	}

	public void setStudentPhoto(String studentPhoto) {
		this.studentPhoto = studentPhoto;
	}

	public String getStudentCategory() {
		return studentCategory;
	}

	public void setStudentCategory(String studentCategory) {
		this.studentCategory = studentCategory;
	}

	public StudentAcademicDetails getStudentAcademicDetails() {
		return studentAcademicDetails;
	}

	public void setStudentAcademicDetails(StudentAcademicDetails studentAcademicDetails) {
		this.studentAcademicDetails = studentAcademicDetails;
	}

	public List<StudentCertificates> getStudentCertificates() {
		return studentCertificates;
	}

	public void setStudentCertificates(List<StudentCertificates> studentCertificates) {
		this.studentCertificates = studentCertificates;
	}

	public List<StudentProjects> getStudentProjects() {
		return studentProjects;
	}

	public void setStudentProjects(List<StudentProjects> studentProjects) {
		this.studentProjects = studentProjects;
	}

	public List<StudentInternships> getStudentInternships() {
		return studentInternships;
	}

	public void setStudentInternships(List<StudentInternships> studentInternships) {
		this.studentInternships = studentInternships;
	}

	public List<StudentSkills> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(List<StudentSkills> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public List<StudentAchievements> getStudentAchievements() {
		return studentAchievements;
	}

	public void setStudentAchievements(List<StudentAchievements> studentAchievements) {
		this.studentAchievements = studentAchievements;
	}

	public List<StudentCocurriculars> getStudentCocurriculars() {
		return studentCocurriculars;
	}

	public void setStudentCocurriculars(List<StudentCocurriculars> studentCocurriculars) {
		this.studentCocurriculars = studentCocurriculars;
	}

	public StudentCareerObjective getStudentCareerObjective() {
		return studentCareerObjective;
	}

	public void setStudentCareerObjective(StudentCareerObjective studentCareerObjective) {
		this.studentCareerObjective = studentCareerObjective;
	}

	public List<StudentStrengths> getStudentStrengths() {
		return studentStrengths;
	}

	public void setStudentStrengths(List<StudentStrengths> studentStrengths) {
		this.studentStrengths = studentStrengths;
	}

	public List<StudentHobbies> getStudentHobbies() {
		return studentHobbies;
	}

	public void setStudentHobbies(List<StudentHobbies> studentHobbies) {
		this.studentHobbies = studentHobbies;
	}

	public List<StudentWeakness> getStudentWeaknesses() {
		return studentWeaknesses;
	}

	public void setStudentWeaknesses(List<StudentWeakness> studentWeaknesses) {
		this.studentWeaknesses = studentWeaknesses;
	}

	public StudentBasicDetails() {

	}

	@Override
	public String toString() {
		return "StudentBasicDetails [id=" + id + ", studentName=" + studentName + ", studentScholar=" + studentScholar
				+ ", studentGender=" + studentGender + ", studentDept=" + studentDept + ", studentSemester="
				+ studentSemester + ", studentSection=" + studentSection + ", studentCollegeEmail="
				+ studentCollegeEmail + ", studentPersonalEmail=" + studentPersonalEmail + ", studentGithub="
				+ studentGithub + ", studentLinkedin=" + studentLinkedin + ", studentAddress=" + studentAddress
				+ ", studentPhone=" + studentPhone + ", studentEnrollmentNo=" + studentEnrollmentNo + ", studentPhoto="
				+ studentPhoto + ", studentCategory=" + studentCategory + ", studentAcademicDetails="
				+ studentAcademicDetails + ", studentCertificates=" + studentCertificates + ", studentProjects="
				+ studentProjects + ", studentInternships=" + studentInternships + ", studentSkills=" + studentSkills
				+ ", studentAchievements=" + studentAchievements + ", studentCocurriculars=" + studentCocurriculars
				+ ", studentCareerObjective=" + studentCareerObjective + ", studentStrengths=" + studentStrengths
				+ ", studentHobbies=" + studentHobbies + ", studentWeaknesses=" + studentWeaknesses + "]";
	}

}
