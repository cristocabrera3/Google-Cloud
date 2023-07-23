package com.ecommerce.customer.service;

import com.ecommerce.customer.model.Customer;
import com.ecommerce.customer.model.Product;
import com.ecommerce.customer.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);

    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);

    ShoppingCart deleteItemFromCart(Product product, Customer customer);

}
