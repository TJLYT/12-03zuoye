package com.example.domain;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity

@Table(name="emp")
//@NamedQuery(name = "Emp.findall", query = "SELECT e FROM Emp e")
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long eid;

	private String ename;

	private double salary;
	
	private long dept_id;

	@ManyToOne
	@JoinColumn(name="deptno")
	private Department department;

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getDept_id() {
		return dept_id;
	}

	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setDepartment(String name) {
		// TODO Auto-generated method stub
		
	}
	public String getDepartment(String name) {
		return name;
	}
}
