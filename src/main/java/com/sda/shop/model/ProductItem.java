package com.sda.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {

    private Product product;
    private int quantity;

    public void increaseQuantity(int q){
        quantity = quantity + q;
    }
}
