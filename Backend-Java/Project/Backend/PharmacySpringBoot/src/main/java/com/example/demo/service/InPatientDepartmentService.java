package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.InPatientDepartment;
import com.example.demo.repository.InPatientDepartmentRepository;

@Service
public class InPatientDepartmentService {
	@Autowired
	InPatientDepartmentRepository repository;
	public Iterable<InPatientDepartment> getActivePatients(){
		return repository.findByipdDischargedFalse();
	}
	public String savePatient(InPatientDepartment inp) {
		repository.save(inp);
		return "patient data is saved";
	}

}
