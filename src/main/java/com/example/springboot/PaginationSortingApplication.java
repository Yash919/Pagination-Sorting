package com.example.springboot;

import com.example.springboot.dto.APIResponse;
import com.example.springboot.entity.Product;
import com.example.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/products")
public class PaginationSortingApplication {

	@Autowired
	private ProductService productService;

	@GetMapping
	private APIResponse<List<Product>> getProducts(){
		List<Product> allproducts= productService.findAllProducts();
		return new APIResponse<>(allproducts.size(),allproducts);
	}

	// can use getMapping also than there will be no need of @PathVariable
	@PostMapping("/{field}")
	private APIResponse<List<Product>> getProductsWithSort(@PathVariable String field){
		List<Product> sortedProducts= productService.sortedProducts(field);
		return new APIResponse<>(sortedProducts.size(), sortedProducts);
	}

	@PostMapping("/pagination/{offset}/{pageSize}")
	private APIResponse<Page<Product>> getPagination(@PathVariable int offset,@PathVariable int pageSize){
		Page<Product> pagination= productService.pagination(offset,pageSize);
		return new APIResponse<>(pagination.getNumberOfElements(), pagination);
	}

	@PostMapping("/pagination/{offset}/{pageSize}/{field}")
	private APIResponse<Page<Product>> sortedPagination(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
		Page<Product> sortedPagination= productService.paginationWithSort(offset, pageSize, field);
		return new APIResponse<>(sortedPagination.getNumberOfElements(), sortedPagination);
	}

	public static void main(String[] args) {
		SpringApplication.run(PaginationSortingApplication.class, args);
	}

}
