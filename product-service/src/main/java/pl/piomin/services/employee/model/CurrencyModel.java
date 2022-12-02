package pl.piomin.services.employee.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

/**
 * The persistent class for the "Divisas" database table.
 */
@Getter
@Setter
@NoArgsConstructor
public
class CurrencyModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String bbgTicker;
    private int code;
    private String name;
    private Collection<ProductModel> products;
}
