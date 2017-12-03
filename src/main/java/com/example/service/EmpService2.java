package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Department;
import com.example.domain.Emp;
import com.example.dto.EmpRepository;

@Transactional
@Service
public class EmpService2 {

	 @PersistenceContext  //持久化上下文

	EntityManager manager;
	@Autowired
    private EmpRepository empRepository ;
	
	
	
	//增

	
	public void insertEmp(Emp e) {
		if(empRepository.findOne(e.getEid()) == null){
			Emp e1=new Emp();
			e1.setEname("wangyan");
			e1.setSalary(7000);
			e1.setDepartment(Department.class.getName());
			empRepository.save(e);
		}
	}
	
	
	//删
	public void deleteAllEmp() {
		empRepository.deleteAll();
	}
	
	public void deleteEmpById(long eid) {
		empRepository.delete(eid);
	}
	//改
	public Emp empName(long eid,String ename) {
		Emp emp =manager.find(Emp.class, eid);
		empRepository.saveAndFlush(ename);
		return emp;
	}

	//查
	  //查询
    public Emp findEmp(long id) {
    	return manager.find(Emp.class, id);
    }
    //查所有
    public List<Emp> findEmp(){
    	TypedQuery<Emp> query = manager.createQuery("Select e from Emp e",Emp.class);
		return query.getResultList();	
    }


	public Emp empName(String ename) {
		return	empRepository.saveAndFlush(ename);
	 
		
	} 
	
}
