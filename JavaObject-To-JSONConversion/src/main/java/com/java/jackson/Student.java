package com.java.jackson;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
@JsonView
public class Student {
	@JsonProperty(value = "Employee-Id")
	private Integer id;
	@JsonProperty(value = "Employee-Name")
	private String name;
	@JsonProperty(value = "Employee-Role")
	private String role;
	@JsonProperty(value = "Employee-Add")
	private Address add;
	@JsonProperty(value = "Projects")
	private List<String> projs;
	@JsonProperty(value = "Versions")
	private Map<String,Integer> versions;
}
