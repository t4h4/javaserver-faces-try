package _01.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import _01.jsf.domain.Person;

@ManagedBean(name="personBean")
@SessionScoped
public class PersonBean {
	
	private Person person;
	public PersonBean() {
		person = new Person();
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
