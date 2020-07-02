package com.sda.shop.model;

import lombok.*;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Product {

    @Setter
    private Integer id;
    private String name;
    private Integer price;
    private String description;
    private Category category;
    private Integer quantity;

}
