package com.cg.sprint.school.administration.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.school.administration.exception.AdminNotFoundException;
import com.cg.sprint.school.administration.exception.ComplaintNotFoundException;
import com.cg.sprint.school.administration.exception.CourseNotFoundException;
import com.cg.sprint.school.administration.exception.NoticeNotFoundException;
import com.cg.sprint.school.administration.exception.StudentNotFoundException;
import com.cg.sprint.school.administration.exception.StudyMaterialNotFoundException;
import com.cg.sprint.school.administration.exception.TeacherNotFoundException;
import com.cg.sprint.school.administration.model.Admin;
import com.cg.sprint.school.administration.model.Complaint;
import com.cg.sprint.school.administration.model.Notice;

import com.cg.sprint.school.administration.model.Student;
import com.cg.sprint.school.administration.model.Teacher;
import com.cg.sprint.school.administration.repository.AdminRepository;
import com.cg.sprint.school.administration.repository.NoticeRepository;
import com.cg.sprint.school.administration.repository.StudentRepository;
import com.cg.sprint.school.administration.repository.TeacherRepository;


@Service
public class AdminServiceImpl {

	private static final Logger LOG = LoggerFactory.getLogger(AdminService.class);

	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TeacherRepository teacherRepository;
	@Autowired
	private NoticeRepository noticeRepository;


	//  Admin Functionalities

	// Add Admin
	public Admin addAdmin(Admin admin) {
		LOG.info("addAdmin");
		try {
			return adminRepository.save(admin);
		} catch (IllegalArgumentException iae) {
			LOG.error(iae.getMessage());
			return null;
		}
	}

	//Get Admin By Id
	public Admin getAdminById(int adminId) throws AdminNotFoundException {
		LOG.info("getAdminById " + adminId);
		Optional<Admin> optAdmin = adminRepository.findById(adminId);
		if (optAdmin.isEmpty()) {
			LOG.error("Admin not found.");
			throw new AdminNotFoundException();
		} else
			return optAdmin.get();
	}

	//Get All Admin
	public List<Admin> getAllAdmin() {
		LOG.info("getAllAdmin");
		return adminRepository.findAll();
	}

	// Update Admin Details
	public Admin updateAdmin(Admin admin) {
		LOG.info("updateAdmin");
		return adminRepository.save(admin);
	}

	// Delete Admin
	public int deleteAdmin(int adminId) {
		LOG.info("deleteAdmin");
		try {
		adminRepository.deleteById(adminId);
		return adminId;
		}catch(AdminNotFoundException ex) {
			LOG.error("Admin Not Found");
			return -1;
		}
	}

	//Notice Functionalities
	
	//Add Notice
	public Notice addNotice(Notice notice) throws IllegalArgumentException {
		LOG.info("addNotice");
		try {
			return noticeRepository.save(notice);
		} catch (IllegalArgumentException iae) {
			LOG.error(iae.getMessage());
			return null;
		}
	}
	
	//get Notice
	public List<Notice> getAllNotice() {
		LOG.info("getAllNotice");
		return (List<Notice>) noticeRepository.findAll();
	}

	
	//get Notice By Id
	public Notice getNoticeById(int noticeId) throws NoticeNotFoundException {
		LOG.info("getNoticeById " + noticeId);
		Optional<Notice> optNotice = noticeRepository.findById(noticeId);
		if (optNotice.isEmpty()) {
			LOG.error("No Notice Found.");
			throw new NoticeNotFoundException();
		} else
			return optNotice.get();
	}

	// Update Notice Details
	public Notice updateNotice(Notice notice) {
		LOG.info("updateNotice");
		return noticeRepository.save(notice);
	}

	// Delete Notice
	public int deleteNotice(int noticeId) {
		LOG.info("deleteNotice");
		
		noticeRepository.deleteById(noticeId);
		return noticeId;
		
	}


}
