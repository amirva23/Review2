package com.productData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.productData.dao.ProductRepository;
import com.productData.model.Product;

@Service
public class ProductDataService {
@Autowired
    ProductRepository repo;
	public List<Product>getAllProduct()
	{
		List<Product> proList=repo.findAll();
		return proList;
	}
	public Product saveProduct(Product p)
	{
		Product obj = repo.save(p);
		return obj;
	}
	public Product updateProduct(Product p)
	{
		Product obj = repo.save(p);
		return obj;
	}
	public void deleteProduct(int id)
	{
		repo.deleteById(id);
	}
	public Optional<Product> getProductbyId(int id)
	{
		return repo.findById(id);
	}
	public List<Product>sortProduct(String field)
	{
		return repo.findAll(Sort.by(field));
	}
	public List<Product>pagingProduct(int offset,int pagesize)
	{
		PageRequest paging =PageRequest.of(offset, pagesize);
		Page<Product>proData=repo.findAll(paging);
		List<Product>proList=proData.getContent();
		return proList;
	}
	public List<Product>pagingAndSortingProduct(int offset,int pagesize,String field)
	{
	Pageable paging=PageRequest.of(offset, pagesize).withSort(Sort.by(field));
		Page<Product>pro=repo.findAll(paging);
		return pro.getContent();
	}
}