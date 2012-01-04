package com.streamhead.vaadindomainobjects.form;

import org.vaadin.addon.customfield.CustomField;

import com.streamhead.vaadindomainobjects.model.Address;
import com.vaadin.ui.GridLayout;

public class AddressField extends CustomField {

	private static final long serialVersionUID = 1L;

	public AddressField(Address address) {
		this.setValue(address);
		
		this.setCompositionRoot(new GridLayout(2, 3));
	}
	
	@Override
	public Class<?> getType() {
		return Address.class;
	}

}
