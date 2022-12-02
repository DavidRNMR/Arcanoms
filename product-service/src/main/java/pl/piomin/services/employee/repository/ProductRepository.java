package pl.piomin.services.employee.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.piomin.services.employee.model.Product;
import pl.piomin.services.employee.model.ProductList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ProductRepository {

	Gson gson = new GsonBuilder()
			.excludeFieldsWithoutExposeAnnotation()
			.setPrettyPrinting()
			.create();

	private ProductList products = gson.fromJson(Files.readString(Path.of("product-service/src/main/resources/departments.json")),ProductList.class);

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
