package main.java.user;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;

	@RequestMapping(method=RequestMethod.POST , value="/user")
	public void userRegistration(@RequestBody User user) throws SQLException {
		userservice.addUser(user);
	}
	
	@RequestMapping("/user")
	public List<User> getAllUser() throws SQLException{
		return userservice.getAllUser();
	}
}
