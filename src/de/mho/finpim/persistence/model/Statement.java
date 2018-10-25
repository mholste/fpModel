package de.mho.finpim.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Statement 
{
	@Id
	@GeneratedValue
	protected int stmtId;
	
	/** Konto der Buchung*/
	@OneToOne
	@JoinColumn(name="Account", referencedColumnName="IBAN")
	protected Bank bank;
	
	/** Buchungsdatum */
	@Basic
	protected int Date;
	
	/** Saldo nach Buchung */
	@Basic
	protected String balance;
	
	/**Verwendungszweck */
	@Basic
	protected String usage;
	
	/** Betrag */
	@Basic
	protected String value;
	
	/** Datum der Wertstellung */
	@Basic 
	protected String valuta;
	
	/** Bankgebühren */
	@Basic
	protected String charge;
	
	/** Kundenreferenz */
	@Basic
	protected String customerReference;
	
	/** Refrenz der Bank */
	@Basic 
	protected String instituteReference;

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getDate() {
		return Date;
	}

	public void setDate(int date) {
		Date = date;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}

	public String getInstituteReference() {
		return instituteReference;
	}

	public void setInstituteReference(String instituteReference) {
		this.instituteReference = instituteReference;
	} 
}
