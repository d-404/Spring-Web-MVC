package com.springmvc.lc.api;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "Your Name cannot be blank.")
	@Size(min = 3, max = 20, message = "Your Name should have between 3 and 30 characters.")
	private String userName;
	private String crushName;
	@AssertTrue(message = "You have to agree to the T&C.")
	private boolean checkBox;

	public boolean isCheckBox() {
		return checkBox;
	}

	public void setCheckBox(boolean checkBox) {
		this.checkBox = checkBox;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}
