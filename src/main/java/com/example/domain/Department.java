package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="dept")
public class Department {
	@Id
	private int deptno;
	
	private String name;
	
	private int id;
}