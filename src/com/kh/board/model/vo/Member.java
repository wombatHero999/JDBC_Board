package com.kh.board.model.vo;

import java.sql.Date;

/** 
 * Member 테이블의 한행의 정보를 보관할 클래스
 * */
public class Member {
	private String memberId; // MEMBER_ID
	private String memberPwd;// MEMBER_PWD
	private String memberName;// MEMBER_NAME
	private String gender; // GENDER
	private String email; // EMAIL
	private String phone; // PHONE
	private String address; // ADDRESS
	private int age; // AGE
	private Date enrollDate;// ENROLL_DATE

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Member() {

	}

	public Member(String memberId, String memberPwd, String memberName, String gender, String email, String phone,
			String address, int age, Date enrollDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName + ", gender="
				+ gender + ", email=" + email + ", phone=" + phone + ", address=" + address + ", age=" + age
				+ ", enrollDate=" + enrollDate + "]";
	}
}
