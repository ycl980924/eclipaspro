package test.pojo.user;

public class UserPojo {
	private String username;
	private Integer password;
	public UserPojo() {}
	public UserPojo(String username, Integer password) {
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	
	
}
