package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.InPatientDepartment;
@Repository
public interface InPatientDepartmentRepository extends CrudRepository<InPatientDepartment, Long> {
    Iterable<InPatientDepartment> findByipdDischargedFalse();
}
