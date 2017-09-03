package de.mho.finpim.persistence.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Account 
{
	@Id
	@GeneratedValue
	protected int accId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pId")
	protected Person person;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bId")
	protected Bank bank;
	
	@Basic
	protected int accNo;
	
	protected long balance;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}
	
}
