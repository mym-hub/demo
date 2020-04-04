package cn.entity;

import java.sql.Timestamp;

public class User {
	int UserID;
	String NickName;
	String avatarUrl;
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	String WxCodeUrl;
	String Address;
	String Phone;
	String Sex;
	String WxOpenID;
	String IsDeleted;
	Timestamp AddTime;
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	public String getWxCodeUrl() {
		return WxCodeUrl;
	}
	public void setWxCodeUrl(String wxCodeUrl) {
		WxCodeUrl = wxCodeUrl;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getWxOpenID() {
		return WxOpenID;
	}
	public void setWxOpenID(String wxOpenID) {
		WxOpenID = wxOpenID;
	}
	public String getIsDeleted() {
		return IsDeleted;
	}
	public void setIsDeleted(String isDeleted) {
		IsDeleted = isDeleted;
	}
	public Timestamp getAddTime() {
		return AddTime;
	}
	public void setAddTime(Timestamp timestamp) {
		AddTime = timestamp;
	}
	@Override
	public String toString() {
		return "User [UserID=" + UserID + ", NickName=" + NickName + ", avatarUrl=" + avatarUrl + ", WxCodeUrl="
				+ WxCodeUrl + ", "+ ", Address=" + Address + ", Phone=" + Phone + ", Sex=" + Sex
				+ ", WxOpenID=" + WxOpenID + ", IsDeleted=" + IsDeleted + ", AddTime=" + AddTime + "]";
	}

}
