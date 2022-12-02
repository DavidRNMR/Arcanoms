package pl.piomin.services.employee.service;



import pl.piomin.services.employee.model.dto.ProductDto;

import java.util.Date;
import java.util.List;

public interface IProductService {
    List<ProductDto> getAllProducts();

    List<ProductDto> findProductsByUploadedDate(Date date);

    List<ProductDto> getLastProducts();

    void reloadLastProducts();

    ProductDto findLastProductByAriaId(Long ariaId);

    ProductDto findByName(String productName);

    ProductDto findById(Long productId);

    Boolean existProduct(Long productId);
}