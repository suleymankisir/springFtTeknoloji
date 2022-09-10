package FTTeknoloji.spring.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import FTTeknoloji.spring.entities.concretes.Product;
import FTTeknoloji.spring.entities.concretes.ProductComment;
import FTTeknoloji.spring.entities.concretes.User;

public interface ProductCommentDao extends JpaRepository<ProductComment, Integer> {
	
	
	
	  //@Query("From ProductComment where product.productId=:productId")
	  List<ProductComment> findByProduct(Product productId);
	  
	  //@Query("From ProductComment where user.userId=:userId") 
	  List<ProductComment> findByUser(User userId);
	  
	  
	  List<ProductComment> findAllByUserAndCommentDateBetween(User userId, LocalDate d1, LocalDate d2);
	 
	  List<ProductComment> findAllByProductAndCommentDateBetween(Product productId, LocalDate d1, LocalDate d2);
}
