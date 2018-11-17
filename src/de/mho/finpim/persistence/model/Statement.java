package de.mho.finpim.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import java.util.Date;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(name = "IDENT", columnNames = {"BALANCE","VALUTA","VALUE"}))
public class Statement 
{
	@Id
	@GeneratedValue
	protected int stmtId;
	
	/** Konto der Buchung*/
	@OneToOne
	@JoinColumn(name="Account", referencedColumnName="IBAN")
	protected Account account;
	
	/** Buchungsdatum */
	@Basic
	protected Date date;
	
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
	protected Date valuta;
	
	/** Bankgebühren */
	@Basic
	protected String charge;
	
	/** Kundenreferenz */
	@Basic
	protected String customerReference;
	
	/** Refrenz der Bank */
	@Basic 
	protected String instituteReference;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public Date getValuta() {
		return valuta;
	}

	public void setValuta(Date valuta) {
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
