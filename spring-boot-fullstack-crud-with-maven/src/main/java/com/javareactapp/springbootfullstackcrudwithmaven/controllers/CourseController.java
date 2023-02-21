package com.javareactapp.springbootfullstackcrudwithmaven.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javareactapp.springbootfullstackcrudwithmaven.Services.CoursesHardcodedService;
import com.javareactapp.springbootfullstackcrudwithmaven.models.Course;

@RestController
public class CourseController {
	@Autowired
	private CoursesHardcodedService courseManagementService;
	
	@GetMapping("/instructors/{username}/courses")
	public List<Course> getAllCourses(@PathVariable String username) {
		return courseManagementService.findAll();
	}
}
