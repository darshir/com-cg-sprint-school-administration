package com.cg.sprint.school.administration.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.sprint.school.administration.model.Admin;
import com.cg.sprint.school.administration.model.Student;
import com.cg.sprint.school.administration.repository.AdminRepository;
import com.cg.sprint.school.administration.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
public class AdminServiceTests {

	@InjectMocks
	AdminService service;

	@Mock
	AdminRepository repository;

	public static List<Admin> adminList;

	@BeforeAll
	public static void createAdmData() {

		adminList = new ArrayList<>();
		adminList.add(new Admin(1, "Sonu"));
	    adminList.add(new Admin(2, "Monu"));
		adminList.add(new Admin(2, "Tonu"));
	}

	// @BeforeEach ---

	@Test
	public void testFindAllAdmin() {

		when(repository.findAll()).thenReturn(adminList);

		assertEquals(3, service.getAllAdmin().size());

		verify(repository, times(1)).findAll();
	}

	@Test
	public void testAddNewAdmin() {
		service.addAdmin(adminList.get(2));
		verify(repository, times(1)).save(adminList.get(2));
	}

	@AfterAll
	public static void nullifyAdmData() {
		adminList = null;
	}
}