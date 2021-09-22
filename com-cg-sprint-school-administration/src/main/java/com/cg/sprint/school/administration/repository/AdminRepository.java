package com.cg.sprint.school.administration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sprint.school.administration.model.Admin;

//@Repository("adminRepository")
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
//	List<Admin> findByName(String adminName);
//
//	Admin findById(String adminId);
	
}