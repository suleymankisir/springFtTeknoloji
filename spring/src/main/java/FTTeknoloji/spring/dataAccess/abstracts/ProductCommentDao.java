package FTTeknoloji.spring.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import FTTeknoloji.spring.entities.concretes.Product;
import FTTeknoloji.spring.entities.concretes.ProductComment;

public interface ProductCommentDao extends JpaRepository<ProductComment, Integer> {
	
	
	
	  //@Query("From ProductComment where product.productId=:productId")
	  List<ProductComment> findByProduct(Product productId);
	  
	  @Query("From ProductComment where user.userId=:userId") 
	  List<ProductComment> getByCommentUser(int userId);
	  
	  @Query("FROM ProductComment WHERE userId =:userId and commentDate between :d1 and :d2")
	  List<ProductComment> findAllByUserAndCommentDateBetween(int userId, String d1, String d2);
	 
	  List<ProductComment> findAllByProductAndCommentDateBetween(int productId, LocalDate d1, LocalDate d2);
}
