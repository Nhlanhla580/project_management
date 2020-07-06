package poisedProject;

// this is my super class which will server as a template for my subclasses 
public class Person {
	
	String name;
	String telephoneNumber;
	String physicalAddress;
	String emailAddress;
	
	public Person(String name, String telephoneNumber, String physicalAddress, String emailAddress) {
		
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.physicalAddress = physicalAddress;
		this.emailAddress = emailAddress;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	
	public String getemailAddress() {
		return emailAddress;
	}
	

}
