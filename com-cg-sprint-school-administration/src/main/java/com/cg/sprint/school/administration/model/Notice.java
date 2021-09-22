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
@Table(name = "NOTICE")
public class Notice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int noticeId;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;
    
       @Column(name = "date")
    private String date;

    @Column(name="notice")
    private String notice;
    
    @ManyToOne
	@JoinColumn(name = "ADMIN_ID")
	private Admin admin;
    
    public Notice() {}

	public Notice(int noticeId, @NotBlank(message = "Name is mandatory") String name, String date, String notice) {
		super();
		this.noticeId = noticeId;
		this.name = name;
		this.date = date;
		this.notice = notice;
	}

	public Notice(int noticeId, @NotBlank(message = "Name is mandatory") String name, String date, String notice,
			Admin admin) {
		super();
		this.noticeId = noticeId;
		this.name = name;
		this.date = date;
		this.notice = notice;
		this.admin = admin;
	}

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", name=" + name + ", date=" + date + ", notice=" + notice + ", admin="
				+ admin + "]";
	}
    
    
  
   
}