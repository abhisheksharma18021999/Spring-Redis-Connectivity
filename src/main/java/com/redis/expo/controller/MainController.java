package com.redis.expo.controller;

import com.redis.expo.entity.Product;
import com.redis.expo.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class MainController {

	@Autowired
	private ProductDao dao;

	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		return dao.save(product);
	}

	@GetMapping("/get-all-products")
	public List<Product> getAllProducts() {
		return dao.findAll();
	}

	@GetMapping("/find/{id}")
	public Product findProduct(@PathVariable int id) {
		return dao.findProductById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable int id)   {
		return dao.deleteProduct(id);
	}

}


/**
 *{
 *     "id" : 777,
 *     "name" : "iphone_xr",
 *     "qty" : 1,
 *     "price" : 50000
 * }
 *  product json for postman testing
 */