package FTTeknoloji.spring.entities.concretes;


import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="productcomments")

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property ="commentId")
public class ProductComment {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="comment_id")
	 private int commentId;
	
	 @Column(name="product_comment")
	 private String productComment;
	
	
	 @Column(name="comment_date")
	 @JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
     private LocalDate commentDate;
	
	 @ManyToOne()
	 @JoinColumn(name="user_id") 
	 private User user;
	  
	  
	 @ManyToOne()
	 @JoinColumn(name= "product_id") 
	 private Product product;
	  
	 
	
}
