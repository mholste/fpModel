package de.mho.finpim.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank 
{
	@Id
	@GeneratedValue
	protected int bId;
	
	@Column(unique=true, nullable=false)
	protected String bankName;
	
	@Column(unique=true, nullable=false)
	protected String blz;
	
	@Column(unique=true)
	protected String bic;
	
	@Basic
	protected String accessCode;
	
	@Basic
	protected String PIN;
	
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

	public int getBId()
	{
		return bId;
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

	protected String location;
}