package FTTeknoloji.spring.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import FTTeknoloji.spring.entities.concretes.ProductComment;

public interface ProductCommentDao extends JpaRepository<ProductComment, Integer> {
	
	
	
	  @Query("From ProductComment where product.productId=:productId")
	  List<ProductComment> getByCommentProduct(int productId);
	  
	  @Query("From ProductComment where user.userId=:userId") 
	  List<ProductComment> getByCommentUser(int userId);
	  
	  
	  List<ProductComment> getByUserAndCommentDateBetween(int userId, LocalDate
	  d1,LocalDate d2);
	 
	  
	
	  List<ProductComment> getByProductAndCommentDateBetween(int productId,
	  LocalDate d1, LocalDate d2);
	 
	 
}
