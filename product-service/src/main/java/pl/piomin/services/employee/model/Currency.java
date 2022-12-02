package pl.piomin.services.employee.model;

import com.google.gson.annotations.Expose;

public class Currency {
    @Expose
    private Long code;
    @Expose
    private String name;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency() {

    }

    public Currency(Long code, String name) {
        this.code = code;
        this.name = name;
    }

}
