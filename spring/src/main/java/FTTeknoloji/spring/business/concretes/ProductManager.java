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
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(
				this.productDao.findAll(),"Data Listelendi ") ;
	}

	@Override
	public Product add(Product product) {
		// TODO Auto-generated method stub
		
		return this.productDao.save(product);
	}

	@Override
	public DataResult<List<Product>> getByProductDateBefore() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductDateBefore(LocalDate.now()),"data listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductDateAfter() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductDateAfter(), "Data listelendi");
	}





	

	
	
}
