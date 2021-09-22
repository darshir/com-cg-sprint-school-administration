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

import com.cg.sprint.school.administration.model.Student;
import com.cg.sprint.school.administration.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTests {

	@InjectMocks
	StudentService service;

	@Mock
	StudentRepository repository;

	public static List<Student> studentList;

	@BeforeAll
	public static void createStuData() {

		studentList = new ArrayList<>();
		studentList.add(new Student(101, "Sonu"));
		studentList.add(new Student(102, "Monu"));
		studentList.add(new Student(103, "Tonu"));
	}

	// @BeforeEach ---

	@Test
	public void testFindAllStudent() {

		when(repository.findAll()).thenReturn(studentList);

		assertEquals(3, service.getAllStudent().size());

		verify(repository, times(1)).findAll();
	}

	@Test
	public void testAddNewStudent() {
		service.addStudent(studentList.get(2));
		verify(repository, times(1)).save(studentList.get(2));
	}

	@AfterAll
	public static void nullifyStuData() {
		studentList = null;
	}
}