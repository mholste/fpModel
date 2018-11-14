package de.mho.finpim.persistence.model;

import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Das Geschäftsobjekt Account repräsentiert ein Bankkonto mit den dazugehörigen
 * Eigenschaften und Methoden.
 * Alle hier verwendeten Eigenschaften besitzen entsprechende Getter und Setter. 
 * 
 * @author Michael Holste
 * 
 * @version 1.0
 * 
 *dd
 */
@Entity
public class Account 
{
	@Id
	@GeneratedValue
	protected int accId;
	
	/** Kontoführende Bank */
	@OneToOne
	@JoinColumn(name="BANK", referencedColumnName="BIC")
	protected Bank bank;
	
	/** Kontoinhaber*/
	@ManyToOne
	@JoinColumn(name="PERSON", referencedColumnName="pId")
	protected Person person;
	
	/** Kontonummer */
	@Basic(optional=false)
	protected String accNo;
	
	/** Art des Kontos */
	@Basic
	protected String type;
	
	/** IBAN des Kontos */ 
	@Basic
	@Column(nullable=false)
	protected String iban;
	
	/** Währung des Kontos */ 
	@Basic
	protected String currency;
	
	/** Überziehungsgrenze */
	@Basic
	protected String accLimit;
	
	/** BIC des Kontos */
	@Basic
	protected String bic;
	
	/** Bankleitzahl des Kontos */
	@Basic
	protected String blz;
	
	/** Land,in dem das Konto geführt wird*/
	@Basic
	protected String country;
	
	/** Name des Kontos (frei wählbar */
	@Basic
	protected String name;
	
	/** Kontostand */
	@Basic	
	protected String balance;
	
	/** Zeitpunk der letzten Kontoabfrage */
	@Basic
	protected LocalDateTime requestTime;
	
	public Account() { }
	
	public LocalDateTime getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(LocalDateTime requestTime) {
		this.requestTime = requestTime;
	}

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

	public String getAccLimit() {
		return accLimit;
	}

	public void setAccLimit(String accLimit) {
		this.accLimit = accLimit;
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
	
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
