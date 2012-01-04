package com.streamhead.vaadindomainobjects.form;

import com.streamhead.vaadindomainobjects.model.Person;
import com.vaadin.data.Item.PropertySetChangeEvent;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;

public class PersonForm extends Form {
	
	private static final long serialVersionUID = 1L;
	
	private final Person person;
	private final BeanItem<Person> personItem;
	
	public PersonForm(Person person) {
		this.person     = person;
		this.personItem = new BeanItem<Person>(person);
		
		personItem.addListener(new PropertySetChangeListener() {
			
			public void itemPropertySetChange(PropertySetChangeEvent event) {
				System.out.println("property set change");				
			}
		});
		
		this.setWidth(30, UNITS_EM);
		this.setCaption("Personal details");
		this.setWriteThrough(false);
		
		this.setFormFieldFactory(new PersonFormFieldFactory());
		this.setItemDataSource(personItem);
		this.setVisibleItemProperties(new String[] { "firstName", "lastName", "address" });
		
		final HorizontalLayout buttons = new HorizontalLayout();
		buttons.addComponent(new Button("Ok", this, "commit"));
		buttons.addComponent(new Button("Restore", this, "discard"));
		this.setFooter(buttons);
	}
}
