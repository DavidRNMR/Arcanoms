package pl.piomin.services.employee.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public
class CurrencyDto implements Serializable {
    @JsonIgnore
    private Long id;
    private Integer code;
    private String name;
    private String bbgTicker;
}
