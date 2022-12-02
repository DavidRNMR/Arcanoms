package pl.piomin.services.employee.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.piomin.services.employee.model.Product;
import pl.piomin.services.employee.model.ProductList;
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
