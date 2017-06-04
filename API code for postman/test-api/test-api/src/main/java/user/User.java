package main.java.user;

public class User {

	private String Name;
	private String Email;
	private String Password;
	private String Username;
	private String User_id;
	private String Contact_No;
	
	public String getContact_No() {
		return Contact_No;
	}

	public void setContact_No(String contact_No) {
		Contact_No = contact_No;
	}

	public User() {
	}
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getUser_id() {
		return User_id;
	}

	public void setUser_id(String user_id) {
		User_id = user_id;
	}


	public User(String name, String email, String password, String username,
			String user_id, String contact_No) {
		super();
		Name = name;
		Email = email;
		Password = password;
		Username = username;
		User_id = user_id;
		Contact_No = contact_No;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
