package FTTeknoloji.spring.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import FTTeknoloji.spring.business.abstracts.ProductCommentService;
import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.entities.concretes.Product;
import FTTeknoloji.spring.entities.concretes.ProductComment;
import FTTeknoloji.spring.entities.concretes.User;

@RestController
@RequestMapping("/api/productCommentController")
public class ProductCommentController {

	private ProductCommentService productCommentService;

	@Autowired
	public ProductCommentController(ProductCommentService productCommentService) {
		super();
		this.productCommentService = productCommentService;
	}
	
	 //Bir ürüne ait yorumları getirir
	@GetMapping("/getByCommentProductId")
	public DataResult<List<ProductComment>> getByCommentProductId(@RequestParam Product productId){
		return this.productCommentService.getByCommentProductId(productId);
		
		
	}
	 //Bir kullanıcı ait yorumları getirir
	@GetMapping("/getByCommentUserId")
	public DataResult<List<ProductComment>> getByCommentUserId(@RequestParam User userId){
		return this.productCommentService.getByCommentUserId(userId);
		
		
	}
	//Bir kullanıcı ve iki tarih arasındaki yorumları getirir.
	@GetMapping("/getByUserIdAndCommentDateBetween")
	public DataResult<List<ProductComment>> getByUserIdAndCommentDateBetween(@RequestParam User userId, String d1, String d2){
		
		return this.productCommentService.getByUserIdAndCommentDateBetween(userId,d1,d2);
	}
	//Bir ürüne ve iki tarih arasındaki yorumları getirir.
	@GetMapping("/getByProductIdAndCommentDateBetween")
	public DataResult<List<ProductComment>> getByProductIdAndCommentDateBetween(@RequestParam Product productId, String d1, String d2){
		
		return this.productCommentService.getByProductIdAndCommentDateBetween(productId, d1, d2);
	}
	
}