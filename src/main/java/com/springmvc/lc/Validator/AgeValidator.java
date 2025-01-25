package com.springmvc.lc.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int upper;
	private int lower;

	@Override
	public void initialize(Age age) {
		// Post-Construct work
		this.upper = age.upper();
		this.lower = age.lower();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// business logic
		if (age == null)
			return false;
		if (age < lower || age > upper)
			return false;
		return true;
	}

}
