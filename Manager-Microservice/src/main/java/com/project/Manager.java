package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JacksonXmlRootElement(namespace="Manager")
@ApiModel(description="Details about Manager")
@Entity
@Table(name = "manager")
public class Manager {
	
	@Id
	@ApiModelProperty(notes="Id of the manager")
	private int managerId;
	private String name;
	private String managerUsername;
	private String password;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	

	public Manager(int managerId, String name, String managerUsername, String password) {
		super();
		this.managerId = managerId;
		this.name = name;
		this.managerUsername = managerUsername;
		this.password = password;
	}


	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagerUsername() {
		return managerUsername;
	}

	public void setManagerUsername(String managerUsername) {
		this.managerUsername = managerUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
