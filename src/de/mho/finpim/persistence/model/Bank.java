package de.mho.finpim.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Das Geschäftsobjekt Bank repräsentiert eine Bank an einem entsprechendem Ort. 
 * Hier wird dieses Objekt mit den entsprechenden, die Bank repräsentierenden 
 * Eigenschaften geführt, zusätzlich werden die Eigenschaften für den Onlinezugang
 * gehalten. 
 * 
 * Alle hier verwendeten Eigenschaften besitzen entsprechende Getter und Setter. 
 * 
 * @author Michael Holste
 * 
 * @version 1.0
 * 
 *
 */
@Entity
public class Bank 
{
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
	 * Kunden-Id des Nutzers bei der Bank
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
}
