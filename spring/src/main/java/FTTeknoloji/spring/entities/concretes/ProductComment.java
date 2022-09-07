package FTTeknoloji.spring.entities.concretes;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="productcomments")

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","product"})
public class ProductComment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comment_id")
	private int commentId;
	
	@Column(name="product_comment")
	private String productComment;
	
	@Column(name="comment_date")

	private LocalDateTime commentDate;
	
	
	
	
	  @ManyToOne()
	  @JoinColumn(name="user_id") 
	  private User user;
	  
	  
	  @ManyToOne()
	  @JoinColumn(name= "product_id") 
	  private Product product;
	  
	 
	
}
