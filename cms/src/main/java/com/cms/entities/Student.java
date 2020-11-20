package com.cms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_registration")
public class Student {


	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="complain_id")
	private Complain complain;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="std_id")
	private Integer stdId;
	
	@Column(name="std_id")
	private String stdName;
	
	@Column(name="std_username")
	private String stdUsername;
	
	@Column(name="std_gender")
	private String stdGender;
	
	@Column(name="std_cnic")
	private String stdCnic;
	
	@Column(name="std_address")
	private String stdAddress;
	
	@Column(name="std_password")
	private String stdPassword;
	
	@Column(name="remarks")
	private String remarks;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdUsername() {
		return stdUsername;
	}
	public void setStdUsername(String stdUsername) {
		this.stdUsername = stdUsername;
	}
	public String getStdGender() {
		return stdGender;
	}
	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}
	public String getStdCnic() {
		return stdCnic;
	}
	public void setStdCnic(String stdCnic) {
		this.stdCnic = stdCnic;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public String getStdPassword() {
		return stdPassword;
	}
	public void setStdPassword(String stdPassword) {
		this.stdPassword = stdPassword;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdUsername=" + stdUsername + ", stdGender="
				+ stdGender + ", stdCnic=" + stdCnic + ", stdAddress=" + stdAddress + ", stdPassword=" + stdPassword
				+ ", remarks=" + remarks + "]";
	}
	
	
}
