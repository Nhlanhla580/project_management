package poisedProject;
import java.util.Date;
import java.util.Scanner;

public class Poised_main {

	public static void main(String[] args) {
		
		Date currentDate = new Date();
		 
		// created new instances of my objects, project, contractor, Customer and Architect
		
		ProjectObject project1 = new ProjectObject("Frist Building",269854,"Hotel",258,"28 Germiston",20000,10000,currentDate,"30-08-2020",false);
		
		project1.projectCaptureDate = currentDate;
		
		Contractor contractor1 = new Contractor("Contractor","Dave","071 256 8974","30 Builing C","info@gmail.com");
		
		Customer customer1 = new Customer(523,"DOM","074 856 9874","80 Builing V","TESTING@gmail.com");
		
		Architect architect1 = new Architect("Architec","Dark","076 589 6541","99 Builing Y","Arch@gmail.com");
		
		
		// call my update project method and print out my details after updating
		project1.updateProject();
		System.out.println(project1.getMoreDetails());
		
		
		// call my update Contractor details method and print out the details after updating
		contractor1.updateContractorContactDetails();
		System.out.println(contractor1.getContractorDetails());
		
		// call my finalize method which will change my boolean variable to true and print Project Finalized
		project1.finalizeProject();
		
		// declared and initialized and assigned value made out of the calculation below, this will be used for my conditional statement when printing invoice 
		int outstanding_amount = project1.amountDue - project1.amountPaid;
		
		
		// if statement which will print customer details and outstanding amount if there is an outstanding amount
		if (project1.finalized == true && outstanding_amount >= 0) {
			
			System.out.println(" ***Customer Invoice*** \n");
			System.out.println(customer1.getCustomerDetails());
			System.out.println("Outstanding Amount: R" + (project1.amountDue - project1.amountPaid));
			System.out.println("Invoice Date: " + currentDate);
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
