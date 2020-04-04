package cn.entity;

public class BaseInfo {
	int id;
	String userid;
	String name;
	String phone;
	String xueyuan;
	String sushe;
	String photo;
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getXueyuan() {
		return xueyuan;
	}
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	public String getSushe() {
		return sushe;
	}
	public void setSushe(String sushe) {
		this.sushe = sushe;
	}
	@Override
	public String toString() {
		return "BaseInfo [id=" + id + ", userid=" + userid + ", name=" + name + ", phone=" + phone + ", xueyuan="
				+ xueyuan + ", sushe=" + sushe + "]";
	}
}
