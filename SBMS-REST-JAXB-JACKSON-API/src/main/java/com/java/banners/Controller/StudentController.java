package com.java.banners.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.banners.DTO.Address;
import com.java.banners.DTO.Student;

@RestController
public class StudentController {

	@RequestMapping(value = "/student", produces = "application/xml")
	public Student getStudent()
	{
		Student student = new Student();
		student.setId(1615);
		student.setName("Bhaskar");
		student.setRole("Java Developer");

		Address address = new Address();
		address.setHno(12 - 01);
		address.setHname("DSR Inspire");
		student.setAdd(address);

		List<String> projects = new ArrayList<String>();
		projects.add("Gofounders");
		projects.add("Admin");
		projects.add("Onpassive");
		student.setProjs(projects);

		Map<String, Integer> versions = new HashMap<String, Integer>();
		versions.put("Gofounders", 1);
		versions.put("Admin", 2);
		versions.put("Onpassive", 4);
		student.setVersions(versions);
		
		return student;
		
	}
}
