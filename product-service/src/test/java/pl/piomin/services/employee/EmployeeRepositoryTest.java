package pl.piomin.services.employee;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.util.Assert;
import pl.piomin.services.employee.model.Product;
import pl.piomin.services.employee.repository.ProductRepository;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeRepositoryTest {

    private static final ProductRepository repository = new ProductRepository();



    @Test
    @Order(2)
    void testFindAll() {
        List<Product> employees = repository.findAll();
        Assert.isTrue(employees.size() == 1, "Employees size is wrong.");
        Assert.isTrue(employees.get(0).getAriaId() == 1L, "Employee bad id.");
    }





    @Test
    @Order(5)
    void testFindById() {
        Product employee = repository.findById(1L);
        Assert.notNull(employee, "Employee not found.");
        Assert.isTrue(employee.getAriaId() == 1L, "Employee bad id.");
    }

}
