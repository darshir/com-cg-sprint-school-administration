package com.cg.sprint.school.administration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "HOMEWORK")
public class Homework {
    
	@Id
	@Column(name="HOMEWORK_ID")
	//@GeneratedValue(strategy = GenerationType.AUTO)
    private int homeId;
    
    
    @Column(name = "name")
    private String name;
    
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "TEACHER_ID")
	private Teacher teacher;
    
    public Homework() {
    }

	public Homework(int homeId, String name) {
		super();
		this.homeId = homeId;
		this.name = name;
	}

	public Homework(int homeId, String name, Student student) {
		super();
		this.homeId = homeId;
		this.name = name;
		this.student = student;
	}

	public Homework(int homeId, String name, Student student, Teacher teacher) {
		super();
		this.homeId = homeId;
		this.name = name;
		this.student = student;
		this.teacher = teacher;
	}

	public int getHomeId() {
		return homeId;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Homework [homeId=" + homeId + ", name=" + name + ", student=" + student + ", teacher=" + teacher + "]";
	}

   
}