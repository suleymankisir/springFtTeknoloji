package FTTeknoloji.spring.business.abstracts;



import java.time.LocalDate;

import java.util.List;

import FTTeknoloji.spring.core.utilities.results.DataResult;

import FTTeknoloji.spring.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	Product add(Product product);
	
	DataResult<List<Product>> getByProductDateBefore(LocalDate productDate);
	DataResult<List<Product>> getByProductDateAfter(LocalDate productDate);
}
	


