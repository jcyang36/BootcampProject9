package taxes;

import java.util.Scanner;

public class FridayProject
{
    public static void main( String[] args)
   {
   int cID=0;
   float amount=0;
   String taxCode="";
   float taxAdded=0;
   String repeatSwitch="";
   float percent=0;
   do{
	   Scanner scannerInput= new Scanner (System.in);
	   		do{
				 System.out.println("Enter Customer ID: ");
				 scannerInput=new Scanner(System.in);
			 }while (!scannerInput.hasNextInt());  
			 cID=scannerInput.nextInt();
	
			do{
				System.out.println("Customer Name: ");
				scannerInput=new Scanner(System.in);
			}while(!scannerInput.hasNext());
			
			String cName=scannerInput.next();
			
			
			do{
				System.out.println("Sales Amount: $");
				scannerInput=new Scanner(System.in);
			}while( !scannerInput.hasNextFloat());
			amount=scannerInput.nextFloat();
			do{
				System.out.println("Tax Code: ");
				scannerInput=new Scanner(System.in);
				}while(!scannerInput.hasNext());
				taxCode=scannerInput.next();
			
			if (taxCode.equalsIgnoreCase("NPF")) {
			taxAdded=0;
			}else if(taxCode.equalsIgnoreCase("BIZ")){
			taxAdded=0.045f*amount;
			}
			else if(taxCode.equalsIgnoreCase("NRM")){
			taxAdded=0.06f*amount;
			}
			else{
			System.out.println("Please enter a tax code: ");
			}
			float total=amount+taxAdded;
			//taxCode print statement
			if (taxCode.equalsIgnoreCase("NPF")) {
			taxAdded=0;
			}else if(taxCode.equalsIgnoreCase("BIZ")){
			percent=4.5f;
			}
			else if(taxCode.equalsIgnoreCase("NRM")){
			percent=6f;
			}
			//end of taxCode print statement
			System.out.println("Tax rate: "+percent+" percent");
			System.out.println("Tax: $"+taxAdded);
			System.out.println("Total owed: $" + total);


			
		System.out.println("Would you like to enter a new record? Enter 'Y' for yes or 'N' for no ");
		repeatSwitch = scannerInput.next();
		if (repeatSwitch.equalsIgnoreCase("N")){
			break;
		}
		}while(repeatSwitch.equalsIgnoreCase("Y"));
		System.out.println("Thank you for using the tax calculator!");
       
		
    }
}
