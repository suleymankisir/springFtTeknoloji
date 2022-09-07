package FTTeknoloji.spring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FTTeknoloji.spring.business.abstracts.UserService;
import FTTeknoloji.spring.core.utilities.results.DataResult;
import FTTeknoloji.spring.core.utilities.results.Result;
import FTTeknoloji.spring.core.utilities.results.SuccessDataResult;
import FTTeknoloji.spring.core.utilities.results.SuccessResult;
import FTTeknoloji.spring.dataAccess.abstracts.UserDao;
import FTTeknoloji.spring.entities.concretes.User;


@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public DataResult<List<User>> getAll() {
	
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listelendi");
	}




	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new SuccessResult("user eklendi");
	}

}
