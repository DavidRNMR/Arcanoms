package pl.piomin.services.employee.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.services.employee.model.Product;
import pl.piomin.services.employee.repository.ProductRepository;

@RestController
public class ProductController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	

	ProductRepository repository = new ProductRepository();

	public ProductController() throws IOException {
	}


	@GetMapping("/{id}")
	public Product findById(@PathVariable("id") Long id) {
		LOGGER.info("Department find: id={}", id);
		return repository.findById(id);
	}

	@GetMapping("/")
	public ProductList findAll() {
		LOGGER.info("Department find");
		return repository.findAll();
	}
	
}
