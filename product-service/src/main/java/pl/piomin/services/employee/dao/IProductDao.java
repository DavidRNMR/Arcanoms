package pl.piomin.services.employee.dao;

import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import pl.piomin.services.employee.model.ProductModel;

@Repository
public interface IProductDao {
    List<ProductModel> findAllByCreatedDate(Date createdDate);

    List<ProductModel> getLastProducts();

    ProductModel findFirstByAriaIdAndCreatedDate(Long ariaId, Date createdDate);

    ProductModel findFirstByAriaIdOrderByCreatedDateDesc(Long ariaId);

    ProductModel findByName(String productName);

    Optional<ProductModel> findById(Long productId);

    List<Long> findProductsAdvanceSearch(@Param(ProductModel.PRODUCTS_PARAM) List<Long> productsId, @Param(ProductModel.NAME_PARAM) String productName);

    List<Long> findAllByNameLike(String productName);

    List<ProductModel> findByNameIn(List<String> productName);

    @Query(value = "SELECT pm.id FROM ProductModel pm WHERE pm.id = :productId")
    BigInteger existProduct(@Param("productId") Long productId);
}
