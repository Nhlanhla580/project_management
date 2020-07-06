package poisedProject;

import java.util.Scanner;

//created my subclass based on my super class Person object
public class Customer  extends Person{
	
	int customerID;
	
	// constructor method which will initialize my attributes(variables)
	public Customer(int customerID, String name, String telephoneNumber, String physicalAddress, String emailAddress) {
		super(name,telephoneNumber,physicalAddress,emailAddress);
		this.customerID = customerID;
	}
	
	public int getCustomerID() {
		return customerID;
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
	
	
	// this methods will get more details and print them out when called 
	public String getCustomerDetails() {
		String output = "Customer Name: " +name;
	      output += "\nCustomer ID:" + customerID;
	      output += "\nTelephone Number:" + telephoneNumber;
	      output += "\nEmail Address:" + emailAddress;
	      output += "\nPhysical Address:" + physicalAddress;
	   
	      return output;
		
	}
	
	// this method will allow for updating of Customer information when called, if statement will control what is updated
	public void updateCustomerContactDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("To Update the telephone number, type 1.");
		System.out.println("To Update the email address, type 2.");
		System.out.println("To Update both the telephone number and email address, type 3.");
		String userInput = input.nextLine();
		
		if ("1".equals(userInput)) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Please enter new telephone number");
			String newTelephone = input1.nextLine();
			telephoneNumber = newTelephone;
			
		}if ("2".equals(userInput)) {
			Scanner input2 = new Scanner(System.in);
			System.out.println("Please enter new email address");
			String newEmail = input2.nextLine();
			emailAddress = newEmail;
			
		}if ("3".equals(userInput)){
			Scanner input1 = new Scanner(System.in);
			System.out.println("Please enter new telephone number");
			String newTelephone = input1.nextLine();
			telephoneNumber = newTelephone;
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("Please enter new email address");
			String newEmail = input2.nextLine();
			emailAddress = newEmail;
			
			
		}

	}
}
