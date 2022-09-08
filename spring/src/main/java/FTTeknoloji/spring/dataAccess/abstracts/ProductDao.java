package FTTeknoloji.spring.dataAccess.abstracts;




import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import FTTeknoloji.spring.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	
	
	
    @Query("From Product where productDate > NOW() OR productDate is null")
    List<Product> getByProductDateAfter();

    List<Product> getByProductDateBefore(LocalDate now);
	 
}
