package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Department;
import com.example.domain.Emp;
import com.example.dto.EmpRepository;
import com.example.service.EmpService2;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=Learn1202Application.class)
public class Learn1202ApplicationTests {

	
	@Autowired
	EmpService2 empService2;
	 
	
		@Test
		public void contextLoads() {
			
		}
		
		
		//增

		@Test
		public void insertEmp(Emp e) {
			empService2.findEmp(1);
		}
		
		
		//删
		@Test
		public void deleteAllEmp() {
			empService2.deleteAllEmp();
		}
		@Test
		public void deleteEmpById(long eid) {
			empService2.deleteEmpById(1);
		}
		//改
		@Test
		public void empName(long eid,String ename) {
			
			 empService2.empName("lyt");
		}

		//查
		@Test
	    public Emp findEmp(long id) {
	    	return empService2.findEmp(1);
	    }
	    //查所有
		@Test
	    public List<Emp> findEmp(){
	    	return empService2.findEmp();
	    } 
}
