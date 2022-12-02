package pl.piomin.services.employee.repository;


import java.io.IOException;


public class ProductRepository {

	public ProductRepository() throws IOException {
	}

	public Product findById(Long id) {
		return products.getProductList().stream()
				.filter(a -> a.getAriaId().equals(id))
				.findFirst()
				.orElseThrow();
	}
	public ProductList findAll() {
		return products;
	}

}
