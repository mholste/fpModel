package de.mho.finpim.persistence.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Person.findByName", query="SELECT p FROM person p WHERE p.uName = :name")

public class Person   
{
	@Id
	@GeneratedValue
	protected int pId; 
	
	@Column(unique=true, nullable=false)
	protected String uName;
	
	@OneToMany
	@JoinColumn(name="bId")
	protected List<Bank> banks;
	
	protected String pwd;
	
	protected String fName;
	
	protected String name;
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() { }
	
	public Person (String name)
	{
		this.uName = name;
	}

	public int getpId() {
		return pId;
	}

	public String getUName() {
		return uName;
	}

	public void setUName(String name) {
		this.uName = name;
	}

	public List<Bank> getBanks() {
		return banks;
	}

	public void addBank(Bank bank) {
		if (bank == null)
		{
			banks = new ArrayList<Bank>();
		}
		if (!this.banks.contains(bank))
		{
			this.banks.add(bank);
		}
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
