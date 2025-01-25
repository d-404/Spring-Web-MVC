package com.springmvc.lc.api;

import java.util.Arrays;

import com.springmvc.lc.Validator.Age;

import jakarta.validation.constraints.NotEmpty;

public class UserRegistrationDTO {

	@NotEmpty(message = "{string.notEmpty}")
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobby;
	private String gender;
	@Age(lower = 30, upper = 45, message = "Please enter age between 30 and 45")
	private Integer age;

	private CommunicationDTO communicationDTO;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserRegistrationDTO [name=" + name + ", userName=" + userName + ", password="
				+ Arrays.toString(password) + ", country=" + country + ", hobby=" + Arrays.toString(hobby) + ", gender="
				+ gender + "]";
	}

}
