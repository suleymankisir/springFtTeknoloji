package FTTeknoloji.spring.business.concretes;



import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FTTeknoloji.spring.business.abstracts.ProductService;
import FTTeknoloji.spring.core.utilities.results.DataResult;

import FTTeknoloji.spring.core.utilities.results.SuccessDataResult;

import FTTeknoloji.spring.dataAccess.abstracts.ProductDao;
import FTTeknoloji.spring.entities.concretes.Product;


@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
		
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		
		return new SuccessDataResult<List<Product>>(
				this.productDao.findAll(),"Product Data listelendi ") ;
	}

	
	@Override
	public Product add(Product product) {
		
		
		return this.productDao.save(product);
	}

	
	@Override
	public DataResult<List<Product>> getByProductDateBefore() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductDateBefore(LocalDate.now()),"Data listelendi");
	}

	
	@Override
	public DataResult<List<Product>> getByProductDateAfter() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductDateAfter(), "Data listelendi");
	}





	

	
	
}
