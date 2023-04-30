package com.gl.boot.SpringBootDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
public class Customer {

	@Id
	private String email;
	private String custname;
	private String city;
	private String phone;
	private String password;

}
