package chap98_homework.nc230327;

import java.util.Arrays;

public class PhoneInfo {
	private String name;
	private String phoneNum;
	
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "핸드폰 이름: " + name + "\t핸드폰 번호: " + phoneNum;
	}

	


}
