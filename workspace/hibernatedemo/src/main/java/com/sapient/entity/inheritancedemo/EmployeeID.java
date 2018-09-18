package com.sapient.entity.inheritancedemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeID_TPC")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorValue(value="EMPS")
public class EmployeeID {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String name;

	
	public EmployeeID(){
		
	}
	public EmployeeID(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeID [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
