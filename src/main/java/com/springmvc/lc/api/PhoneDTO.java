package com.springmvc.lc.api;

public class PhoneDTO {

	private String countryCode;
	private String userNumber;

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return countryCode + "-" + userNumber;
	}

}
