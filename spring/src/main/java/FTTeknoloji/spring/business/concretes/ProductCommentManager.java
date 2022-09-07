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
import FTTeknoloji.spring.entities.concretes.ProductComment;

@Service
public class ProductCommentManager implements ProductCommentService {
	
	
	private ProductCommentDao productCommentDao;
	
	@Autowired
	public ProductCommentManager(ProductCommentDao productCommentDao) {
		this.productCommentDao = productCommentDao;
	}

	@Override
	public DataResult<List<ProductComment>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.findAll());
	}

	@Override
	public Result add(ProductComment productComment) {
		this.productCommentDao.save(productComment);
		
		return new SuccessResult("Yorum eklendi");
	}

	@Override
	public DataResult<List<ProductComment>> getByCommentProductId(int productId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.getByCommentProduct(productId));
	}

	@Override
	public DataResult<List<ProductComment>> getByCommentUserId(int userId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.getByCommentUser(userId));
	}

	@Override
	public DataResult<List<ProductComment>> getByUserIdAndCommentDateBetween(int userId, LocalDate d1, LocalDate d2) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.getByUserAndCommentDateBetween(userId, d1, d2));
	}

	@Override
	public DataResult<List<ProductComment>> getByProductIdAndCommentDateBetween(int productId, LocalDate d1,
			LocalDate d2) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProductComment>>(this.productCommentDao.getByProductAndCommentDateBetween(productId, d1, d2));
	}

}
