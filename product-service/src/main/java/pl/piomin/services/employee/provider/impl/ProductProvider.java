package pl.piomin.services.employee.provider.impl;

import org.springframework.stereotype.Service;
import pl.piomin.services.employee.dao.IProductDao;
import pl.piomin.services.employee.model.ProductModel;
import pl.piomin.services.employee.provider.IProductProvider;

import java.math.BigInteger;
import java.util.*;

@Service
public class ProductProvider implements IProductProvider {
    private final IProductDao productDao;

    public ProductProvider(IProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return productDao.findAll();
    }

    @Override
    public List<ProductModel> findProductsByUploadedDate(Date date) {
        return productDao.findAllByCreatedDate(date);
    }

    @Override
    public List<ProductModel> getLastProducts() {
        return productDao.getLastProducts();
    }

    @Override
    public ProductModel findProductByAriaIdAndDate(Long ariaId, Date createdDate) {
        return productDao.findFirstByAriaIdAndCreatedDate(ariaId, createdDate);
    }

    @Override
    public ProductModel findLastProductByAriaId(Long ariaId) {
        return productDao.findFirstByAriaIdOrderByCreatedDateDesc(ariaId);
    }

    @Override
    public ProductModel findByName(String productName) {
        return productDao.findByName(productName);
    }

    public IProductDao getProductDao() {
        return productDao;
    }

    @Override
    public ProductModel saveModel(ProductModel productModel) {
        return productDao.save(productModel);
    }

    @Override
    public ProductModel findById(Long productId) {
        Optional<ProductModel> optionalItem = productDao.findById(productId);
        return optionalItem.isPresent() ? optionalItem.get() : null;
    }

    @Override
    public List<Long> findProductsByProductsIdAndProductName(List<Long> productsId, String productName) {
        return productDao.findProductsAdvanceSearch(productsId, productName);
    }

    @Override
    public List<Long> findAllByNameLike(String productName) {
        return productDao.findAllByNameLike(productName);
    }

    @Override
    public List<ProductModel> findByNameIn(List<String> productName) {
        return productDao.findByNameIn(productName);
    }

    @Override
    public BigInteger existProduct(Long productId) {
        return productDao.existProduct(productId);
    }
}
