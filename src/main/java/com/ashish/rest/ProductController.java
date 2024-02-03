package com.ashish.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.binding.Product;
import com.ashish.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@PostMapping(value="/saveproduct",consumes={"application/xml","application/json"})
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		Product save = repo.save(product);	
		return new ResponseEntity<>("Product Save Successfully",HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getallproduct",produces={"application/xml","application/json"})
	public ResponseEntity<List<Product>> getAllProduct(){
		 List<Product> findAll = (List<Product>) repo.findAll();
		return new ResponseEntity<>(findAll,HttpStatus.OK);
	}
	
	
	
	
}
