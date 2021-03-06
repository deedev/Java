package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

import java.util.*;
@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(value="/all")
	public List<Product> getAll(){
		return service.getAll();
	}
}
