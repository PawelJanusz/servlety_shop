package com.sda.shop.repository;


import com.sda.shop.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private static ProductRepository productRepository;

    public static ProductRepository getInstance(){
        if (productRepository == null){
            productRepository = new ProductRepository();
        }
        return productRepository;
    }

    private List<Product> products;

    private ProductRepository() {
        products = new ArrayList<>();
    }

    public void save (Product product){
        product.setId(products.size() + 1);
        products.add(product);
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(products);
    }

    public void deleteProduct(Integer id){
        Optional<Product> product = products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        product.ifPresent(value -> products.remove(value));
    }
    public Optional<Product> findProductById (Integer id){
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

}
