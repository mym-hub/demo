package cn.entity;

public class login {
	Integer id;
	String uname;
	String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "login [id=" + id + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	
	
}
