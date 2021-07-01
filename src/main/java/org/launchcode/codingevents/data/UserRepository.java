package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.User;
import org.springframework.data.repository.CrudRepository;

import javax.servlet.http.HttpSession;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByUsername(String username);

}
