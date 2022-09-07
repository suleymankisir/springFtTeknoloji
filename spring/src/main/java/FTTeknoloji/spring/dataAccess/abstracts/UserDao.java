package FTTeknoloji.spring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import FTTeknoloji.spring.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
