package com.codegym.model.service;

import com.codegym.model.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {

    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iphone 150", 20000, "Apple"));
        products.put(2, new Product(2, "galaxy s30", 25000, "Samsung"));
        products.put(3, new Product(3, "macbook", 10000, "Apple"));
        products.put(4, new Product(4, "Xps", 15000, "Dell"));
        products.put(5, new Product(5, "galaxy fold", 30000, "Samssung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product: products.values()) {
            if (product.getName().toLowerCase().contains(name)) {
                productList.add(product);
            }
        }
        return productList;
    }
}
