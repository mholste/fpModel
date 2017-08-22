package de.mho.finpim.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person   
{
	@Id
	@GeneratedValue
	protected int pId; 
	
	protected String name;
	
	public Person() { }
	
	public Person (String name)
	{
		this.name = name;
	}

	public int getpId() {
		return pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
