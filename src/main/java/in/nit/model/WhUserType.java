package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Whtab")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name="wid")
	private Integer wid;
	
	@Column(name="whutype")
	private String userType;
	@Column(name="whucode")
	private String wuserCode;
	@Column(name="whu")
	private String whuser;
	@Column(name="email")
	private String email;
	@Column(name="contact")
	private String contact;
	@Column(name="whuid")
	private String whuseridtype;
	@Column(name="other")
	private String other;
	@Column(name="whin")
	private String whidnumber;
	public WhUserType() {
		super();
	}
	public Integer getWid() {
		return wid;
	}
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getWuserCode() {
		return wuserCode;
	}
	public void setWuserCode(String wuserCode) {
		this.wuserCode = wuserCode;
	}
	public String getWhuser() {
		return whuser;
	}
	public void setWhuser(String whuser) {
		this.whuser = whuser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getWhuseridtype() {
		return whuseridtype;
	}
	public void setWhuseridtype(String whuseridtype) {
		this.whuseridtype = whuseridtype;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getWhidnumber() {
		return whidnumber;
	}
	public void setWhidnumber(String whidnumber) {
		this.whidnumber = whidnumber;
	}
	@Override
	public String toString() {
		return "WhUserType [wid=" + wid + ", userType=" + userType + ", wuserCode=" + wuserCode + ", whuser=" + whuser
				+ ", email=" + email + ", contact=" + contact + ", whuseridtype=" + whuseridtype + ", other=" + other
				+ ", whidnumber=" + whidnumber + "]";
	}
	
}
