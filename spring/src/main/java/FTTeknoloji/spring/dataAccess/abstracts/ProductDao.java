package FTTeknoloji.spring.dataAccess.abstracts;




import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import FTTeknoloji.spring.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	
	
	
	  @Query("From Product p where p.productDate >: productDate ") 
	  List<Product> getByProductDateBefore(LocalDate productDate);
	  
	  @Query("From Product p where p.productDate <: productDate ") 
	  List<Product> getByProductDateAfter(LocalDate productDate);
	 
}
