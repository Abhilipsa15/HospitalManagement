package com.nt.model;

import lombok.Data;

@Data
public class Hospital {
	private Integer id;
	private String name;
	private String city;
	private String state;
	private String phn_no;
	private Integer zipcode;
	private Integer no_of_beds;
	

}
