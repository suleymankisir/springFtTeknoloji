package FTTeknoloji.spring.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FTTeknoloji.spring.business.abstracts.ProductCommentService;
import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.core.utilities.results.Result;
import FTTeknoloji.spring.core.utilities.results.SuccessDataResult;
import FTTeknoloji.spring.core.utilities.results.SuccessResult;
import FTTeknoloji.spring.dataAccess.abstracts.ProductCommentDao;
import FTTeknoloji.spring.entities.concretes.Product;
import FTTeknoloji.spring.entities.concretes.ProductComment;
import FTTeknoloji.spring.entities.concretes.User;

@Service
public class ProductCommentManager implements ProductCommentService {
	
	
	private ProductCommentDao productCommentDao;
	
	@Autowired
	public ProductCommentManager(ProductCommentDao productCommentDao) {
		this.productCommentDao = productCommentDao;
	}

	
	@Override
	public DataResult<List<ProductComment>> getAll() {
		
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.findAll());
	}

	
	@Override
	public Result add(ProductComment productComment) {
		
		this.productCommentDao.save(productComment);
		
		return new SuccessResult("Yorum eklendi");
	}

	
	@Override
	public DataResult<List<ProductComment>> getByCommentProductId(Product productId) {
		
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.findByProduct(productId));
	}

	
	@Override
	public DataResult<List<ProductComment>> getByCommentUserId(User userId) {
		
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.findByUser(userId));
	}

	
	@Override
	public DataResult<List<ProductComment>> getByUserIdAndCommentDateBetween(User userId, String d1, String d2) {
		
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.findAllByUserAndCommentDateBetween(userId, LocalDate.parse(d1), LocalDate.parse(d2)), "Data listelendi");
	}

	
	@Override
	public DataResult<List<ProductComment>> getByProductIdAndCommentDateBetween(Product productId, String d1,String d2) {
		
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.findAllByProductAndCommentDateBetween(productId, LocalDate.parse(d1), LocalDate.parse(d2)), "Data listelendi");
	}

	
}
