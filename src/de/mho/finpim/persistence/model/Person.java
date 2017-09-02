package de.mho.finpim.persistence.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person   
{
	@Id
	@GeneratedValue
	protected int pId; 
	
	@Column(unique=true, nullable=false)
	protected String uName;
	
	@OneToMany
	@JoinColumn(name="accID")
	protected List<Account> accounts;
	
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
