package de.mho.finpim.persistence.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person   
{
	@Id
	@GeneratedValue
	protected int pId; 
	
	protected String name;
	
	@OneToMany(mappedBy="Account", cascade=CascadeType.ALL)
	protected List<Account> accounts;
	
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
