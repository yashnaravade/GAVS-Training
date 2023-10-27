package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Nurse {
@Id
private int nurseId;
private String nurseName;
private String nurseDepartment;
public Nurse(int nurseId, String nurseName, String nurseDepartment) {
	super();
	this.nurseId = nurseId;
	this.nurseName = nurseName;
	this.nurseDepartment = nurseDepartment;
}
public int getNurseId() {
	return nurseId;
}
public void setNurseId(int nurseId) {
	this.nurseId = nurseId;
}
public String getNurseName() {
	return nurseName;
}

public void setNurseName(String nurseName) {
	this.nurseName = nurseName;
}
public String getNurseDepartment() {
	return nurseDepartment;
}
public void setNurseDepartment(String nurseDepartment) {
	this.nurseDepartment = nurseDepartment;
}
@Override
public String toString() {
	return "Nurse [nurseId=" + nurseId + ", nurseName=" + nurseName + ", nurseDepartment=" + nurseDepartment + "]";
}
}
