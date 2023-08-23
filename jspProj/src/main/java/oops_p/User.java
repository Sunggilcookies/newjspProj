package oops_p;

public class User {
	String id, name, pw;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String id, String name, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pw=" + pw + "]";
	}

	
	
}
