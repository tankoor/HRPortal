package main.java.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.connection.ConnectionHelper;


import org.springframework.stereotype.Service;


@Service
public class UserService {

	
	public void addUser(User user) throws SQLException {
		Connection con= null;
		java.sql.Statement st = null;
		String usr_insert = null;
		int result=0;
		
		con = (Connection) ConnectionHelper.getConnection();
		st = con.createStatement();
		usr_insert= "insert into pyxiis.user(name,email,password,user_id,userType,username,Contact_No) values ('"+user.getName()+"','"+user.getEmail()+"','"+PasswordHashingService.generateHash(user.getPassword())+"','"+user.getUser_id()+"','E','"+user.getUsername()+"','"+user.getContact_No()+"')";
		result=st.executeUpdate(usr_insert);
		//users.add(user);
	}
	public List<User> getAllUser() throws SQLException{
		Connection con= null;
		java.sql.Statement st = null;
		String usr_data = null;
		con = (Connection) ConnectionHelper.getConnection();
		usr_data="select * from pyxiis.user";
		st = con.createStatement();
		ResultSet rs = st.executeQuery(usr_data);
		rs.last(); 
        int count_items	=	rs.getRow();
        rs.first();
        List <User> users = new ArrayList<>(count_items);
			for (int i = 0; i < count_items; i++) {
				User u = new User();
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				users.add(i, u);
				rs.next();
			}	
		return users;
	}

}
