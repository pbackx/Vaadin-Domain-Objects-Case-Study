package com.streamhead.vaadindomainobjects;

import com.streamhead.vaadindomainobjects.form.PersonForm;
import com.streamhead.vaadindomainobjects.model.Person;
import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinApplication extends Application
{
    private Window window;
    private Person person;
    private PersonForm personForm;
    
    @Override
    public void init()
    {
        window = new Window("My Vaadin Application");
        setMainWindow(window);
        
        person     = new Person();
        personForm = new PersonForm(person);
        window.addComponent(personForm);
    }
    
}
