package com.springapp.mvc.dao.oder.product_order;

import com.springapp.mvc.model.orders.products_order.product_type;
import com.springapp.mvc.model.orders.products_order.products;

import java.util.List;

/**
 * Created by Anton on 05.02.2016.
 */
public interface ProductsDAO {
    products findByType(product_type type);
    products findById(int id_product);
    void save(products product);
    void deleteById(int id_product);
    List<products> findAllProducts();
}
