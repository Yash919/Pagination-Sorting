package com.example.springboot.service;

import com.example.springboot.entity.Product;
import com.example.springboot.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void initDB(){
        List<Product> products= IntStream.rangeClosed(1,200)
                .mapToObj(i->new Product("product" + i,new Random().nextInt(100),new Random().nextInt(50000)))
                .collect(Collectors.toList());

        productRepository.saveAll(products);
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> sortedProducts(String field){
        return productRepository.findAll(Sort.by(field));
    }

    public Page<Product> pagination(int offset,int pagesize){
        Page<Product> res= productRepository.findAll(PageRequest.of(offset,pagesize));
        return res;
    }

    public Page<Product> paginationWithSort(int offset,int pagesize,String field){
        Page<Product> sorted= productRepository.findAll(PageRequest.of(offset,pagesize).withSort(Sort.by(field)));
        return sorted;
    }

}
