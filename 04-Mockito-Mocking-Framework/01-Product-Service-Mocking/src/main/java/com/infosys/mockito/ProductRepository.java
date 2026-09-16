package com.infosys.mockito;



import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public Product findById(int id) {

        return new Product(1, "Laptop", 50000);

    }

}