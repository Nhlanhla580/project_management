package poisedProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class ProjectObject {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	// Attributes 
	String projectName;
	int projectNumber;
	String buildingType;
	int erfNumber;
	String physicalAddress;
	int amountDue;
	int amountPaid;
	Date projectCaptureDate;
	String projectDeadline;
	
	boolean finalized;// = false;
	
	// constructor method which will initialize my attributes(variables)
	public ProjectObject(String projectName, int projectNumber,String buildingType, int erfNumber,String physicalAddress,
			int amountDue,int amountPaid, Date projectCaptureDate, String projectDeadline, boolean finalized) {
		this.projectName = projectName;
		this.projectNumber = projectNumber;
		this.buildingType = buildingType;
		this.erfNumber = erfNumber;
		this.physicalAddress = physicalAddress;
		this.amountDue = amountDue;
		this.amountPaid = amountPaid;
		this.projectCaptureDate = projectCaptureDate;
		this.projectDeadline = projectDeadline;
		this.finalized = finalized;
			
		
	}
	
	// get Methods
	public String getProjectName() {
	      return projectName;
	   }
	
	public int getProjectNumber() {
		return projectNumber;
	}
	
	public String getProjectDeadline() {
		return projectDeadline;
	}
	
	// this methods will get more details and print them out when called
	public String getMoreDetails() {
		String output = "Project Name: " + projectName;
	      output += "\nProject Number:" + projectNumber;
	      output += "\nBuilding Type:" + buildingType;
	      output += "\nERF Number:" + erfNumber;
	      output += "\nPhysical Address:" + physicalAddress;
	      output += "\nAmount Due:" + amountDue;
	      output += "\nAmount Paid:" + amountPaid;
	      output += "\nProject Capture Date:" + projectCaptureDate;
	      output += "\nProject Deadline:" + projectDeadline;
	   
	      return output;
		
	}
	
	// this method will allow for updating of project information when called, if statement will control what is updated
public void updateProject() {
		System.out.println("To Update the amount paid, type 1.");
		System.out.println("To Update the Deadline, type 2.");
		System.out.println("To Update both the amount paid and deadline, type 3.");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		
		
		if ("1".equals(userInput)) {
			System.out.println(userInput);
			System.out.println("Please enter new amount Paid");
			Scanner input1 = new Scanner(System.in);
			int newAmountPaid = input1.nextInt();
			amountPaid = newAmountPaid;
			System.out.println("Test1");

			
		} if("2".equals(userInput)) {
			System.out.println("Please enter new Deadline e.g 'dd-MM-yyyy' format");
			Scanner input2 = new Scanner(System.in);
			String newDeadline = input2.nextLine();
			projectDeadline = newDeadline;
			
		} if ("3".equals(userInput)){
			System.out.println("Please enter new amount Paid");
			Scanner input1 = new Scanner(System.in);
			int newAmountPaid = input1.nextInt();
			amountPaid = newAmountPaid;
			
			System.out.println("Please enter new Deadline e.g 'dd-MM-yyyy' format");
			Scanner input2 = new Scanner(System.in);
			String newDeadline = input2.nextLine();
			projectDeadline = newDeadline;
			
			
		}
		

	}

	
	// finalize method will change my boolean variable to true when call and Print Project Finalized
	public void finalizeProject() {
		finalized = true;
		System.out.println("Project Finalized!\n");
		
		
	}
	
}