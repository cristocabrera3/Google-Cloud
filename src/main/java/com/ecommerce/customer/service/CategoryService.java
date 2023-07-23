package com.ecommerce.customer.service;

import com.ecommerce.customer.dto.CategoryDto;
import com.ecommerce.customer.model.Category;
import com.ecommerce.customer.model.Product;

import java.util.List;

public interface CategoryService {
    /*Admin*/
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();

    /*Customer*/
    List<CategoryDto> getCategoryAndProduct();


}
