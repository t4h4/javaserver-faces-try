package _01.hello.cdi.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class PersonService implements Serializable{

	public String invokeMethod() {
		System.out.println("Service DATA....");
		return "Service Data... ";
	}
}
