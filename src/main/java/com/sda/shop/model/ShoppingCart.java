package com.sda.shop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingCart {

    private List<ProductItem> productItems;
    private Integer totalPrice;

    public ShoppingCart() {
        productItems = new ArrayList<>();
        totalPrice = 0;
    }

    public void addToShoppingCart(Product p, Integer quantity){
        Optional<ProductItem> productItem = productItems.stream()
                .filter(pi -> pi.getProduct().equals(p))
                .findFirst();

        if (productItem.isEmpty()){
            ProductItem item = new ProductItem(p, quantity);
            productItems.add(item);
        }else {
            productItem.get().increaseQuantity(quantity);
        }
        int productCost = p.getPrice() * quantity;
        totalPrice = totalPrice + productCost;

    }

    public void removeFromShoppingCart(Product p){
        productItems.stream()
                .filter(pi->pi.getProduct().equals(p))
                .findFirst()
                .ifPresent(productItem -> productItems.remove(productItem));
    }
}
