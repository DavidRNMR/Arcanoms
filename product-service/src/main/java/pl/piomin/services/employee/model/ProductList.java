package pl.piomin.services.employee.model;

import com.google.gson.annotations.Expose;

import java.util.List;

public class ProductList {
    @Expose
    private List<Product> products;

    public List<Product> getProductList() {
        return products;
    }

    public void setProductList(List<Product> productList) {
        this.products = productList;
    }
    public ProductList() {

    }


}
