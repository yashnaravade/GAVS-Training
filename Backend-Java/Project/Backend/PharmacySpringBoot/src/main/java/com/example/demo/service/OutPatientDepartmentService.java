package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.OutPatientDepartment;
import com.example.demo.repository.OutPatientDepartmentRepository;
@Service
public class OutPatientDepartmentService {
	@Autowired
	OutPatientDepartmentRepository repository;
	public OutPatientDepartment getPatientById(int opdId) {
		OutPatientDepartment opd=repository.findById(opdId).get();
		return opd;
	}
	public Iterable<OutPatientDepartment> getAllPatients(){
		Iterable<OutPatientDepartment> opda =repository.findAll();
		return opda;
	}
	public String savePatients(OutPatientDepartment opda) {
		repository.save(opda);
		return" patient is saved";
	}

}
