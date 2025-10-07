package com.example.studentdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME", length = 100, nullable = false)
	private String name;

	@Column(name = "ADDRESS", length = 255)
	private String address;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public Student(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
