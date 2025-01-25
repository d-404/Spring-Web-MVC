package com.springmvc.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.springmvc.lc.api.PhoneDTO;

public class PhoneNumberFormatter implements Formatter<PhoneDTO> {

	@Override
	public String print(PhoneDTO object, Locale locale) {
		return null;
	}

	@Override
	public PhoneDTO parse(String completePhoneNumber, Locale locale) throws ParseException {
		int index = completePhoneNumber.indexOf('-');
		PhoneDTO phone = new PhoneDTO();
		String phoneNumberArray[] = completePhoneNumber.split("-");
		if (index == -1 || completePhoneNumber.startsWith("-")) {
			phone.setCountryCode("91");
			if (completePhoneNumber.startsWith("-"))
				phone.setCountryCode(phoneNumberArray[1]);
			else
				phone.setCountryCode(phoneNumberArray[0]);

		} else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}
		return phone;
	}

}
