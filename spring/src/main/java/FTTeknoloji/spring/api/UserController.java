package FTTeknoloji.spring.api;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FTTeknoloji.spring.business.abstracts.UserService;
import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.core.utilities.results.Result;

import FTTeknoloji.spring.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		
		return this.userService.add(user);
	
}
	@GetMapping("/getAll")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
		
		
	}
	
}
