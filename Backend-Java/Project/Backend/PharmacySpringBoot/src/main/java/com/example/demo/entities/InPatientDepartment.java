package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class InPatientDepartment {
@Id
private Long ipdId;
private String ipdName;
private String ipdDiagnosis;
private boolean ipdDischarged;
public InPatientDepartment() {}
public InPatientDepartment(Long ipdId, String ipdName, String ipdDiagnosis, boolean ipdDischarged) {
	super();
	this.ipdId = ipdId;
	this.ipdName = ipdName;
	this.ipdDiagnosis = ipdDiagnosis;
	this.ipdDischarged = ipdDischarged;
}
public Long getIpdId() {
	return ipdId;
}
public void setIpdId(Long ipdId) {
	this.ipdId = ipdId;
}
public String getIpdName() {
	return ipdName;
}
public void setIpdName(String ipdName) {
	this.ipdName = ipdName;
}
public String getIpdDiagnosis() {
	return ipdDiagnosis;
}
public void setIpdDiagnosis(String ipdDiagnosis) {
	this.ipdDiagnosis = ipdDiagnosis;
}
public boolean isIpdDischarged() {
	return ipdDischarged;
}
public void setIpdDischarged(boolean ipdDischarged) {
	this.ipdDischarged = ipdDischarged;
}
@Override
public String toString() {
	return "InPatientDepartment [ipdId=" + ipdId + ", ipdName=" + ipdName + ", ipdDiagnosis=" + ipdDiagnosis
			+ ", ipdDischarged=" + ipdDischarged + "]";
}


}
