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
public class Person   
{
	@Id
	@GeneratedValue
	protected int pId; 
	
	@Column(unique=true, nullable=false)
	protected String uName;
	
	//@JoinColumn(name="bId")
	
	@OneToMany (mappedBy="person")	
	protected List<Account> accounts;
	
	@OneToMany (mappedBy="person")	
	protected List<CustomerRelation> relations;
	
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

	public void addAccount(Account account) {
		if (accounts == null)
		{
			accounts = new ArrayList<Account>();
		}
		if (!this.accounts.contains(account))
		{
			this.accounts.add(account);
		}
	}
	
	public List<CustomerRelation> getCustomerRelations() {
		return relations;
	}

	public void addCustomerRelation(CustomerRelation relation) {
		if (relations == null)
		{
			relations = new ArrayList<CustomerRelation>();
		}
		if (!this.relations.contains(relation))
		{
			this.relations.add(relation);
		}
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
