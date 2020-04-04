package cn.entity;

public class PtUser {
	int id;
	String job;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	String name;
	String startdata;
	String enddata;
	String selery;
	String addr;
	String test;
	String phone;
	String userid;
	String state;
	String remark;
	String addtime;
	String isdelete;
	
	public String getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}
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
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartdata() {
		return startdata;
	}
	public void setStartdata(String startdata) {
		this.startdata = startdata;
	}
	public String getEnddata() {
		return enddata;
	}
	public void setEnddata(String enddata) {
		this.enddata = enddata;
	}
	public String getSelery() {
		return selery;
	}
	public void setSelery(String selery) {
		this.selery = selery;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "PtUser [id=" + id + ", job=" + job + ", name=" + name + ", startdata=" + startdata + ", enddata="
				+ enddata + ", selery=" + selery + ", addr=" + addr + ", test=" + test + ", phone=" + phone
				+ ", userid=" + userid + ", state=" + state + ", remark=" + remark + ", addtime=" + addtime
				+ ", isdelete=" + isdelete + "]";
	}
	
	
	
}
