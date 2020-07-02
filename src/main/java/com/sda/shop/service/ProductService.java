package com.sda.shop.service;

import com.sda.shop.model.Product;
import com.sda.shop.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private static ProductService productService;

    public static ProductService getInstance(){
        if (productService == null){
            productService = new ProductService();
        }
        return productService;
    }
    private ProductRepository repository;

    private ProductService() {
        repository = ProductRepository.getInstance();
    }

    public void saveProduct (Product product){
        repository.save(product);
    }
    public List<Product> findAll(){
        return repository.findAll();
    }

    public void deleteProduct(Integer productId){
        repository.deleteProduct(productId);
    }

    public Optional<Product> findProductById(Integer id){
        return repository.findProductById(id);
    }
}
