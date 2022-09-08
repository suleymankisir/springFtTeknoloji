package FTTeknoloji.spring.api;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import FTTeknoloji.spring.business.abstracts.ProductService;
import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.entities.concretes.Product;



@RestController
@RequestMapping("api/products")
public class ProductController {
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@PostMapping("/add")
	public Product add(@RequestBody Product product) {
		return this.productService.add(product); 
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
	 
		return this.productService.getAll();
	}
	
	@GetMapping("/getByProductDateBefore")
	public DataResult<List<Product>> getByProductDateBefore(){
		return this.productService.getByProductDateBefore();
	}
	
	@GetMapping("/getByProductDateAfter")
	public DataResult<List<Product>> getByProductDateAfter(){
		return this.productService.getByProductDateAfter();
	}
	

	
	

}
