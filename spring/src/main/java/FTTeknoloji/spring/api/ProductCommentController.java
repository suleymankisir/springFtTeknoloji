package FTTeknoloji.spring.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FTTeknoloji.spring.business.abstracts.ProductCommentService;
import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.entities.concretes.ProductComment;

@RestController
@RequestMapping("/api/productCommentController")
public class ProductCommentController {

	private ProductCommentService productCommentService;

	@Autowired
	public ProductCommentController(ProductCommentService productCommentService) {
		super();
		this.productCommentService = productCommentService;
	}
	
	@GetMapping("/getByCommnetProductId")
	public DataResult<List<ProductComment>> getByCommnetProductId(@RequestParam int productId){
		return this.productCommentService.getByCommentProductId(productId);
		
		
	}
	
	@GetMapping("/getByCommnetUserId")
	public DataResult<List<ProductComment>> getByCommnetUserId(@RequestParam int userId){
		return this.productCommentService.getByCommentUserId(userId);
		
		
	}
	
	@GetMapping("/getByUserIdAndCommentDateBetween")
	public DataResult<List<ProductComment>> getByUserIdAndCommentDateBetween(@RequestParam int userId,@RequestParam LocalDate d1,@RequestParam LocalDate d2){
		return this.productCommentService.getByUserIdAndCommentDateBetween(userId, d1, d2);
		
		
	}
	
	@GetMapping("/getByProductIdAndCommentDateBetween")
	public DataResult<List<ProductComment>> getByProductIdAndCommentDateBetween(@RequestParam int productId,@RequestParam LocalDate d1,@RequestParam LocalDate d2){
		return this.productCommentService.getByProductIdAndCommentDateBetween(productId, d1, d2);
		
		
	}
	
	
	
	
	
	
	
}
