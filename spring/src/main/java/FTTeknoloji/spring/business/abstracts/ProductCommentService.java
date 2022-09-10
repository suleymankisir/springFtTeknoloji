package FTTeknoloji.spring.business.abstracts;


import java.util.List;

import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.core.utilities.results.Result;
import FTTeknoloji.spring.entities.concretes.Product;
import FTTeknoloji.spring.entities.concretes.ProductComment;
import FTTeknoloji.spring.entities.concretes.User;

public interface ProductCommentService {

	DataResult<List<ProductComment>> getAll();
	Result add(ProductComment productComment);
	
	
	DataResult<List<ProductComment>>  getByCommentProductId(Product productId);
	DataResult<List<ProductComment>>  getByCommentUserId(User userId);
	DataResult<List<ProductComment>>  getByUserIdAndCommentDateBetween(User userId, String d1, String d2);
	DataResult<List<ProductComment>>  getByProductIdAndCommentDateBetween(Product productId, String d1, String d2);
}
