package com.ashish.repository;

import org.springframework.data.repository.CrudRepository;

import com.ashish.binding.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
