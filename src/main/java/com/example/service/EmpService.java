package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.domain.Emp;

@Service  //如果一个类带了@Service注解，将自动注册到Spring容器，不需要再在applicationContext.xml文件定义bean了，
     //类似的还包括@Component、@Repository、@Controller。
@Transactional
public class EmpService {

	 @PersistenceContext  //持久化上下文

	EntityManager manager;

	 public void findEmp(long eid) {
			Emp e  = manager.find(Emp.class, eid);
			System.out.println(e);
		}

	 @Transactional
		public void insertEmp(long id ,String ename , int salary , long  dept_id) {
			Emp e  = new Emp();
			e.setEid(id);
			e.setEname(ename);
			e.setSalary(salary);
			e.setDept_id(dept_id);
			//別忘記持久化
			manager.persist(e);
		}
		
		@Transactional
		public void deleteEmp(int id) {
			Emp e = manager.find(Emp.class, id);
			manager.remove(e);
		}
	
}
