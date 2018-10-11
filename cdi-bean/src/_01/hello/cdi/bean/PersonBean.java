package _01.hello.cdi.bean;


import java.io.Serializable;

//!!!! import ettigimiz sinifa DIKKAT!
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

import _01.hello.cdi.domain.Person;

@Named
//@RequestScoped
@SessionScoped
// CDI beanler SessionScoped oldugunda Serializable OLMALIDIR!
public class PersonBean implements Serializable{

	@Inject
	private PersonService personService;
	
	private Person person ;
	public PersonBean() {
		person = new Person();
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String callService() {
		return personService.invokeMethod();
	}
	
}
