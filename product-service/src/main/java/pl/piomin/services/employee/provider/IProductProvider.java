package pl.piomin.services.employee.provider;



import pl.piomin.services.employee.model.ProductModel;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IProductProvider {
    List<ProductModel> getAllProducts();

    List<ProductModel> findProductsByUploadedDate(Date date);

    List<ProductModel> getLastProducts();

    ProductModel findProductByAriaIdAndDate(Long ariaId, Date createdDate);

    ProductModel findLastProductByAriaId(Long ariaId);

    ProductModel findByName(String productName);

    ProductModel saveModel(ProductModel productModel);

    ProductModel findById(Long productId);

    List<Long> findProductsByProductsIdAndProductName(List<Long> productsId, String productName);

    List<Long> findAllByNameLike(String productName);

    List<ProductModel> findByNameIn(List<String> productName);

    BigInteger existProduct(Long productId);
}
