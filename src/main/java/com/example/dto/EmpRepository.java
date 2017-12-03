package com.example.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Emp;
//JPQL是一种查询实体的语言
//选择JPQL 1.具备良好的可移植性。2.针对持久化实体模型
/**查询有4类
 * 1.选择
 * 2.聚合
 * 3.更新
 * 4.删除
 * @author lenovo
 *
 */
public interface EmpRepository extends JpaRepository<Emp, Long>{

	void delete(long eid);

	Emp saveAndFlush(String ename);

	void save(String ename);

	

}
