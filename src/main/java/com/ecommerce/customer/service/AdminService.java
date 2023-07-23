package com.ecommerce.customer.service;

import com.ecommerce.customer.dto.AdminDto;
import com.ecommerce.customer.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
