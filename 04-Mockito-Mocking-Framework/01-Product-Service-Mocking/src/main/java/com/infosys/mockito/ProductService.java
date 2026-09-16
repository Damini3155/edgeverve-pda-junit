package com.infosys.mockito;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product getProductId(int id) {

        return productRepository.findById(id);

    }

}