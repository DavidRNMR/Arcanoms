package pl.piomin.services.employee.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public
class ProductDto implements Serializable {
    @JsonIgnore
    private Long id;
    private Long ariaId;
    private String isin;
    private String name;
    private String bbgTicker;
    private CurrencyDto currency;
    @JsonIgnore
    private Date uploadedDate;
}
