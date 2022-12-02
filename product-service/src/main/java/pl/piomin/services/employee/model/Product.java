package pl.piomin.services.employee.model;

import com.google.gson.annotations.Expose;



public class Product {

	@Expose
	private Long ariaId;
	@Expose
	private String isin;
	@Expose
	private String name;
	@Expose
	private String bbgTicker;
	@Expose
	private Currency currency;


	public Product() {

	}

	public Product(Long ariaId, String isin, String name, String bbgTicker, Currency currency) {
		this.ariaId = ariaId;
		this.isin = isin;
		this.name = name;
		this.bbgTicker = bbgTicker;
		this.currency = currency;
	}

	public Long getAriaId() {
		return ariaId;
	}

	public String getIsin() {
		return isin;
	}

	public String getName() {
		return name;
	}

	public String getBbgTicker() {
		return bbgTicker;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setAriaId(Long ariaId) {
		this.ariaId = ariaId;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBbgTicker(String bbgTicker) {
		this.bbgTicker = bbgTicker;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Department{" +
				"ariaId=" + ariaId +
				", isin='" + isin + '\'' +
				", name='" + name + '\'' +
				", bbgTicker='" + bbgTicker + '\'' +
				", currency=" + currency +
				'}';
	}

}
