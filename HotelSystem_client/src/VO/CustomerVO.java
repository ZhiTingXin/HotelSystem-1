package VO;

import java.util.Date;

import PO.CustomerPO;
import other.memberState;

public class CustomerVO {

	private String id;

	private String userName;
	private String password;

	private int credit;

	private Date birthday;

	private String companyName;

	private int memberGrade;
	private memberState memberState;

	@SuppressWarnings("deprecation")
	public CustomerVO() {
		this.id = "123456";
		this.birthday = new Date(95, 11, 19);
		this.companyName = "NJU";
		this.credit = 100;
		this.userName = "William";
		this.password = "William123456";
		this.memberGrade = 1;
		this.memberState = memberState.NORMAL_MEMBER;
	}

	public CustomerVO(CustomerPO userPO) {
		super();
		this.id = userPO.getId();
		this.userName = userPO.getUserName();
		this.credit = userPO.getCredit();
		this.birthday = userPO.getBirthday();
		this.memberGrade = userPO.getMemberGrade();
	}

	public CustomerVO(String id, String userName, int credit) {

		this.id = id;
		this.userName = userName;
		this.credit = credit;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(int memberGrade) {
		this.memberGrade = memberGrade;
	}

	public memberState getMemberState() {
		return this.memberState;
	}

	public void setMemberState() {
		this.memberState = memberState.NORMAL_MEMBER;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}
}
