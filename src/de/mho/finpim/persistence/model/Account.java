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
	
	@Basic(optional=false)
	protected String accNo;
	
	@Basic
	protected String type;
	
	@Basic
	protected String iban;
	
	@Basic
	protected String currency;
	
	@Basic
	protected String limit;
	
	@Basic
	protected String bic;
	
	@Basic
	protected String blz;
	
	@Basic
	protected String country;
	
	@Basic
	protected String name;
	
	@Basic	
	protected long balance;
	
	public Account() { }
	
	public Account(String accNo)
	{
		this.accNo = accNo;
	}
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBlz() {
		return blz;
	}

	public void setBlz(String blz) {
		this.blz = blz;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
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
