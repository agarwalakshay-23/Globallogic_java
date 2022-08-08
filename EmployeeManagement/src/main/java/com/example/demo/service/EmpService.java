package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo repo;
	
	public void addEmployee(EmployeeEntity e) {
		this.repo.save(e);
	}
	
	
	public List<EmployeeEntity> getAllEmployee(){
		return this.repo.findAll();
	}
	
	public EmployeeEntity getEmpById(int id) {
		Optional<EmployeeEntity>e= this.repo.findById(id);
		
		if(e.isPresent()) {
			return e.get();
		}
		return null;		
	}
	
	public void delete(int id) {
	  this.repo.deleteById(id);
	}

}
