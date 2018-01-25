package de.mho.finpim.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bank 
{
	/*
	@Id
	@GeneratedValue
	protected int bId;
	*/
	/**
	 * Name der Bank
	 */
	@Column(nullable=false)
	protected String bankName;
	
	/**
	 * Bankleitzahl
	 */
	@Column(nullable=false)
	protected String blz;
	
	/**
	 * BIC der Bank
	 */
	@Id
	@Column(nullable=false)
	protected String bic;
		
	/**
	 * Eigentümer der Bankverbindung
	 */
	/*
	@ManyToOne
	@JoinColumn(name="person", referencedColumnName="pId")
	protected Person person;
	*/
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
	
	/**
	 * Sitz der Bank
	 */
	@Basic
	protected String location;
	
	/**
	 * HBCI-Server der Bank
	 */
	@Basic
	protected String host;
	
	/**
	 * Kunden-Id des Nutzewrs bei der Bank
	 */
	/*
	@Basic
	protected String customerId;
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	*/
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
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
	/*
	public int getBId()
	{
		return bId;
	}
	*/
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBlz() {
		return blz;
	}

	public void setBlz(String blz) {
		this.blz = blz;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	/*
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	*/
}
