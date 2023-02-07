package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.dto.ProductDto;
import com.app.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	//Product save(ProductDto prod);
	
	@Modifying
	@Query("update Product p set p.price=p.price+?1 where p.productName=?2")
	int updateProdPrice(double incre,String prodName);
}
