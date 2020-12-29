package com.java.jackson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] args) throws IOException {

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

		try {
			ObjectMapper mapper = new ObjectMapper();
//			String writeValueAsString = mapper.writeValueAsString(student);
//			mapper.writeValue(new File("student.json"), writeValueAsString);
//			System.out.println(writeValueAsString);
//			
//			String writeValueAsString2 = mapper.writeValueAsString(student);
//			System.err.println(writeValueAsString2);
			//mapper.writerWithDefaultPrettyPrinter().writeValue(new File("student.json"), writeValueAsString);
			
			//String json = "{\"Employee-Id\" : 1615,\"Employee-Name\" : \"Bhaskar\",\"Employee-Role\" : \"Java Developer\",\"Employee-Add\" : {  \"House-no\" : 11,  \"House-Name\" : \"DSR Inspire\"},\"Projects\" : [ \"Gofounders\", \"Admin\", \"Onpassive\" ],\"Versions\" : {  \"Onpassive\" : 4,  \"Gofounders\" : 1,  \"Admin\" : 2}}";
			File json=new File("student.json");
			Student readValue = mapper.readValue(json, Student.class);
			System.err.println(readValue);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
