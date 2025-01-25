package com.springmvc.lc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String convertedStringValue = text.toUpperCase();
		setValue(convertedStringValue);
	}

}
