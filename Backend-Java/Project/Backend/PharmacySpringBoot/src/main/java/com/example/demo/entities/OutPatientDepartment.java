package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class OutPatientDepartment {
@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
private int opdId;
private String opdName;
private String opdDiagnosis;
public OutPatientDepartment() {
}
public OutPatientDepartment(int opdId, String opdName, String opdDiagnosis) {
	super();
	this.opdId = opdId;
	this.opdName = opdName;
	this.opdDiagnosis = opdDiagnosis;
}
public int getOpdId() {
	return opdId;
}
public void setOpdId(int opdId) {
	this.opdId = opdId;
}
public String getOpdName() {
	return opdName;
}
public void setOpdName(String opdName) {
	this.opdName = opdName;
}
public String getOpdDiagnosis() {
	return opdDiagnosis;
}
public void setOpdDiagnosis(String opdDiagnosis) {
	this.opdDiagnosis = opdDiagnosis;
}
@Override
public String toString() {
	return "OutPatientDepartment [id=" + opdId + ", name=" + opdName + ", diagnosis=" + opdDiagnosis + "]";
}




}
