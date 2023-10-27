package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.OutPatientDepartment;
@Repository
public interface OutPatientDepartmentRepository extends CrudRepository<OutPatientDepartment,Integer> {

}
