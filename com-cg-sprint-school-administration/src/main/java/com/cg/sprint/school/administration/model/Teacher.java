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

@Component("Teacher")
@Scope("prototype")
@Entity
@Table(name = "TEACHER")
public class Teacher implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TEACHER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;

	@Column(name = "TEACHER_NAME", length = 50)
	private String teacherName;
	
	@ManyToOne
	@JoinColumn(name = "ADMIN_ID")
	private Admin admin;

//	@Column(name = "TEACHER_PASSWORD")
//	private String teacherPassword;

	public Teacher() {

	}

	public Teacher(int teacherId, String teacherName) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
	}

	public Teacher(int teacherId, String teacherName, Admin admin) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.admin = admin;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", admin=" + admin + "]";
	}

	
//	public Teacher(String teacherId, String teacherName, String teacherPassword) {
//		super();
//		this.teacherId = teacherId;
//		this.teacherName = teacherName;
//		this.teacherPassword = teacherPassword;
//	}
//
//	public String getTeacherId() {
//		return teacherId;
//	}
//
//	public void setTeacherId(String teacherId) {
//		this.teacherId = teacherId;
//	}
//
//	public String getTeacherName() {
//		return teacherName;
//	}
//
//	public void setTeacherName(String teacherName) {
//		this.teacherName = teacherName;
//	}
//
//	public String getTeacherPassword() {
//		return teacherPassword;
//	}
//
//	public void setTeacherPassword(String teacherPassword) {
//		this.teacherPassword = teacherPassword;
//	}
//
//	@Override
//	public String toString() {
//		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherPassword=" + teacherPassword
//				+ "]";
//	}

}