package com.cg.sprint.school.administration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("Student")
@Scope("prototype")
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;

	@Column(name = "STUDENT_NAME", length = 50)
	private String studentName;

//	@Column(name = "STUDENT_PASSWORD")
//	private String studentPassword;
	
	@ManyToOne
	@JoinColumn(name = "ADMIN_ID")
	private Admin admin;
	
	
	public Student() {

	}


	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}


	public Student(int studentId, String studentName, Admin admin) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.admin = admin;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", admin=" + admin + "]";
	}
	
	

//	public Student(String studentId, String studentName, String studentPassword) {
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.studentPassword = studentPassword;
//	}
//
//	public String getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(String studentId) {
//		this.studentId = studentId;
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public String getStudentPassword() {
//		return studentPassword;
//	}
//
//	public void setStudentPassword(String studentPassword) {
//		this.studentPassword = studentPassword;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPassword=" + studentPassword
//				+ "]";
//	}

}