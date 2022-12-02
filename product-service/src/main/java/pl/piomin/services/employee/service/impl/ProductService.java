package pl.piomin.services.employee.service.impl;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import pl.piomin.services.employee.mapper.IProductMapper;
import pl.piomin.services.employee.model.dto.LastProductDto;
import pl.piomin.services.employee.model.dto.ProductDto;
import pl.piomin.services.employee.provider.IProductProvider;
import pl.piomin.services.employee.service.IProductService;


@Service
public class ProductService implements IProductService {
    private final IProductProvider productProvider;
    private final IProductMapper productMapper;
    private final LastProductDto lastProductDto;

    public ProductService(IProductProvider productProvider, IProductMapper productMapper, LastProductDto lastProductDto) {
        this.productProvider = productProvider;
        this.productMapper = productMapper;
        this.lastProductDto = lastProductDto;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productMapper.mapOutCollection(productProvider.getAllProducts()).stream().collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findProductsByUploadedDate(Date date) {
        return productMapper.mapOutCollection(productProvider.findProductsByUploadedDate(date)).stream().collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getLastProducts() {
        if (lastProductDto.getProducts() == null) {
            reloadLastProducts();
        }
        return lastProductDto.getProducts();
    }

    @Override
    public void reloadLastProducts() {
        List<ProductDto> products = productMapper.mapOutCollection(productProvider.getLastProducts()).stream().collect(Collectors.toList());
        lastProductDto.setProducts(products);
    }

    @Override
    public ProductDto findLastProductByAriaId(Long ariaId) {
        return productMapper.mapOut(productProvider.findLastProductByAriaId(ariaId));
    }

    @Override
    public ProductDto findByName(String productName) {
        return productMapper.mapOut(productProvider.findByName(productName));
    }

    @Override
    public ProductDto findById(Long productId) {
        return productMapper.mapOut(productProvider.findById(productId));
    }

    @Override
    public Boolean existProduct(Long productId) {
        BigInteger id = productProvider.existProduct(productId);
        return id != null;
    }
}
