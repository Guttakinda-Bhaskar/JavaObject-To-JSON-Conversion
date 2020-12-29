package com.java.banners.DTO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class Student {
	private Integer id;
	private String name;
	private String role;
	private Address add;
	private List<String> projs;
	private Map<String,Integer> versions;
}
