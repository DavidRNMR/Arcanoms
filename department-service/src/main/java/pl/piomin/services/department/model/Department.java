package pl.piomin.services.department.model;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Department {

			private Long ariaId;
			private String isin;
			private String name;
			private String bbgTicker;
			private Currency currency;

			public Department() {

			}

			public Department(Long ariaId, String isin, String name, String bbgTicker, Currency currency) {
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


