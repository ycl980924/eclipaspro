package test.pojo.user;

public class UserMessage {
	private Integer userid;
	private String username;
	private String sex;
	private Integer age;
	private String emaile;
	private String vocation;
	
	public UserMessage() {
	}
	
	public UserMessage(Integer userid, String username, String sex, Integer age, String emaile, String vocation) {
		this.userid = userid;
		this.username = username;
		this.sex = sex;
		this.age = age;
		this.emaile = emaile;
		this.vocation = vocation;
	}
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmaile() {
		return emaile;
	}
	public void setEmaile(String emaile) {
		this.emaile = emaile;
	}
	public String getVocation() {
		return vocation;
	}
	public void setVocation(String vocation) {
		this.vocation = vocation;
	}
	
	
}
