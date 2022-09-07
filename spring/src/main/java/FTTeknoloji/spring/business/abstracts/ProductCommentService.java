package FTTeknoloji.spring.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.core.utilities.results.Result;
import FTTeknoloji.spring.entities.concretes.ProductComment;

public interface ProductCommentService {

	DataResult<List<ProductComment>> getAll();
	Result add(ProductComment productComment);
	
	
	DataResult<List<ProductComment>>  getByCommentProductId(int productId);
	DataResult<List<ProductComment>>  getByCommentUserId(int userId);
	DataResult<List<ProductComment>>  getByUserIdAndCommentDateBetween(int userId, LocalDate d1, LocalDate d2);
	DataResult<List<ProductComment>>  getByProductIdAndCommentDateBetween(int productId, LocalDate d1, LocalDate d2);
}
