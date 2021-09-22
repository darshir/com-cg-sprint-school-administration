package com.cg.sprint.school.administration.model;

import java.util.Date;

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
@Table(name = "COMPLAINT")
public class Complaint {
    
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int complaintId;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name = "note")
    private String note;

    @Column(name = "date")
    private Date date;

	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
    
    public Complaint() {}

   
    
    

    public Complaint(int complaintId, @NotBlank(message = "Name is mandatory") String note, Date date) {
		super();
		this.complaintId = complaintId;
		this.note = note;
		this.date = date;
	}





	public Complaint(int complaintId, @NotBlank(message = "Name is mandatory") String note, Date date,
			Student student) {
		super();
		this.complaintId = complaintId;
		this.note = note;
		this.date = date;
		this.student = student;
	}

	public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }
    
    public long getComplaintId() {
        return complaintId;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }
    
	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", compalintNote=" + note + ", Date=" + date + ", studentId=" + student
				+ "]";
	}
}