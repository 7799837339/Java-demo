package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import com.example.demo.vo.Products;
import com.example.demo.vo.User;

@RestController
@RequestMapping("/api/")
public class DemoController {
	
	@Autowired
	UserService  userService ;
	@Autowired
	ProductService productService;

	@GetMapping("/heartbeat")
	public String heartBeat() {
		return "application is running";
	}
	
	@GetMapping("/getProducts")
	public List<Products>  getProducts() {
		return null;
	}
	
	@PostMapping("/addUser")
	public User  addUser(User user) {
	 return userService.addUser(user);
	}
	
	@PutMapping("/updateUser")
	public User  updateUser(User user) {
	 return userService.updateUser(user);
	}
	@DeleteMapping("/deleteUser")
	public void deleteUser(User user) {
	  userService.deleteUser(user);
	}
	@PostMapping("/addProdcut")
	public Products addProdcut(Products user) {
	 return productService.addProduct(user);
	}
	
	@PutMapping("/updateProdcut")
	public Products  updateProduct(Products product) {
	 return  productService.updateProduct(product);
	}
	@DeleteMapping("/deleteProduct")
	public void deleteProdcut(Products product) {
		 productService.deleteProduct(product);
	}
}
