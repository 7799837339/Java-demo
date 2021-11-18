package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.ProductRepository;
import com.example.demo.vo.Products;

@Service
public class ProductService {
	
	public ProductRepository productRespository;

	public Products addProduct(Products product) {
		return productRespository.save(product);
	}

	public Products updateProduct(Products product) {
		return productRespository.save(product);
	}

	public void deleteProduct(Products product) {
		productRespository.softDelete(product.getProductId());
	}
	

}
