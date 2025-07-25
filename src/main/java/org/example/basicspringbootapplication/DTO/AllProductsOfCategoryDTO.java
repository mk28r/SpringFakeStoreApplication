package org.example.basicspringbootapplication.DTO;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllProductsOfCategoryDTO {
    private Long categoryId;
    private String name;
    private List<ProductDTO> products;
}