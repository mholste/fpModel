package de.mho.finpim.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CustomerRelation 
{
	@Id
	@GeneratedValue
	protected int rId;
	
	@OneToOne
	@JoinColumn(name="BANK", referencedColumnName="BIC")
	protected Bank bank;
	
	@ManyToOne
	@JoinColumn(name="PERSON", referencedColumnName="pId")
	protected Person person;
	
	@Basic
	protected String customerId;
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) 
	{
		this.customerId = customerId;
	}
	
	/**
	 * Zugangscode für die Online-Verbindung
	 */
	@Basic
	protected String accessCode;
	
	/**
	 * PIN für die Online-Verbindung
	 */
	@Basic
	protected String PIN;

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) 
	{
		this.person = person;
		if (!person.getCustomerRelations().contains(this))
		{
			person.addCustomerRelation(this);
		}
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public int getrId() {
		return rId;
	}
}
