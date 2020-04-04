package cn.entity;

public class Trove {
	int id;
	String clubid;
	String userid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClubid() {
		return clubid;
	}
	public void setClubid(String clubid) {
		this.clubid = clubid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Trove [id=" + id + ", clubid=" + clubid + ", userid=" + userid + "]";
	}
}
