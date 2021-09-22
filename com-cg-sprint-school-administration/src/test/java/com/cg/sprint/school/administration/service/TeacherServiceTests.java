package com.cg.sprint.school.administration.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.sprint.school.administration.model.Teacher;


@SpringBootTest
public class TeacherServiceTests {
	
	private static final Logger LOG = LoggerFactory.getLogger(TeacherServiceTests.class);
	
	@Autowired
	private TeacherService teacherService;
	
	@Test
	public void testFindTeacherById() throws Exception{
		LOG.info("testTeacherById");
		Teacher expected = new Teacher(2,"Anusha");
		Teacher actual = teacherService.getTeacherById(2);
		assertEquals(expected.getTeacherId(), actual.getTeacherId());
		
	}
	@Test
	public void testFindTeacherByIdNotFound() throws Exception{
		LOG.info("testNotTeacherById");
		Teacher unexpected = new Teacher(2,"Anusha");
		Teacher actual = teacherService.getTeacherById(3);
		assertNotEquals(unexpected.getTeacherId(), actual.getTeacherId());
		
	}

}