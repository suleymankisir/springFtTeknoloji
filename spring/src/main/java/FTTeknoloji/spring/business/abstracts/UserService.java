package FTTeknoloji.spring.business.abstracts;

import java.util.List;

import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.core.utilities.results.Result;
import FTTeknoloji.spring.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	
	Result add(User user);
}
