package pl.piomin.services.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.piomin.services.department.client.ProductService;
import pl.piomin.services.department.model.Department;
import pl.piomin.services.department.repository.DepartmentRepository;

import java.util.List;

@RestController
public class DepartmentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	DepartmentRepository repository;
	ProductService employeeClient;

	public DepartmentController(DepartmentRepository repository, ProductService employeeClient) {
		this.repository = repository;
		this.employeeClient = employeeClient;
	}

	
	@GetMapping("/{id}")
	public Department findById(@PathVariable("id") Long id) {
		LOGGER.info("Department find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/")
	public List<Department> findAll() {
		LOGGER.info("Department find");
		return repository.findAll();
	}
	

	
	/*@GetMapping("/organization/{organizationId}/with-employees")
	public List<Department> findByOrganizationWithEmployees(@PathVariable("organizationId") Long organizationId) {
		LOGGER.info("Department find: organizationId={}", organizationId);
		List<Department> departments = repository.findByOrganization(organizationId);
		departments.forEach(d -> d.setEmployees(employeeClient.findByDepartment(d.getId())));
		return departments;
	}*/
	
}
