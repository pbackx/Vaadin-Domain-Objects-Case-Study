package com.streamhead.vaadindomainobjects.form;

import com.streamhead.vaadindomainobjects.model.Address;
import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

public class PersonFormFieldFactory extends DefaultFieldFactory {

	private static final long serialVersionUID = 1L;

	@Override
	public Field createField(Item item, Object propertyId, Component uiContext) {
		if("firstName".equals(propertyId)) {
			final TextField firstNameField = new TextField("First Name");
			firstNameField.setInputPrompt("name");
			firstNameField.setWidth("100%"); // this makes sure that the field uses all available width and nicely fills the form space
			return firstNameField;
		} else if("lastName".equals(propertyId)) {
			final TextField lastNameField = new TextField("Last Name");
			lastNameField.setInputPrompt("name");
			lastNameField.setWidth("100%");
			lastNameField.setRequired(true);
			return lastNameField;			
		} else if("address".equals(propertyId)) {
			return new AddressField((Address)item.getItemProperty(propertyId).getValue());
		}
		return super.createField(item, propertyId, uiContext);
	}

	
}
