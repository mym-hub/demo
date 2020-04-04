package cn.entity;

import java.sql.Timestamp;

public class Club {
	int id;
	String minister;
	String cname;
	String depart;
	Timestamp pubdata;
	String enddata;
	String test;
	String userid;
	String state;
	String remark;
	String isdelete;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMinister() {
		return minister;
	}
	public void setMinister(String minister) {
		this.minister = minister;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public Timestamp getPubdata() {
		return pubdata;
	}
	public void setPubdata(Timestamp timestamp) {
		this.pubdata = timestamp;
	}
	public String getEnddata() {
		return enddata;
	}
	public void setEnddata(String enddata) {
		this.enddata = enddata;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Club [id=" + id + ", minister=" + minister + ", cname=" + cname + ", depart=" + depart + ", pubdata="
				+ pubdata + ", enddata=" + enddata + ", test=" + test + ", userid=" + userid + "]";
	}
	
}
