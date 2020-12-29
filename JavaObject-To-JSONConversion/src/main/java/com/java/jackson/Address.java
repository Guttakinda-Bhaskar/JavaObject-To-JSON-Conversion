package com.java.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
@JsonView
public class Address {
	@JsonProperty(value = "House-no")
	private Integer hno;
	@JsonProperty(value = "House-Name")
	private String hname;
}
