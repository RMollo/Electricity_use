import java.util.Scanner;

 public class electric1 
 {
	public static void main(String[] args) 
 	{
 		int unitcost;
 		int cpuspeed;
 			int size;
 
 				
 		Scanner in = new Scanner(System.in);
 		
 		System.out.println("Purchase price of computer: ");
 		unitcost = in.nextInt();
 		
 		System.out.println("speed of processor (MHz)");
 		cpuspeed = in.nextInt();
 		
		int total1 = unitcost;
		
 		System.out.println("Screen size (in inches) diagonally: ");
 		size = in.nextInt();
 		  
 		int c;
 		  c = 0;
 		  
 		  if (size < 11) {
 		  c = 1;
 		} else if (11<=size && size<15) {
 		  c = 2;
 		} else if (size >= 15) {
 		  c = 3;
 	    }


 		int hours;
 		
 		System.out.println("How many hours per day will you use the computer: ");
 		hours = in.nextInt();
 		
 		int years;
 		System.out.println("How mnay years do you plan on keeping the computer: ");
 		years = in.nextInt();
 		
 		String country;
 		System.out.println("US, UK, EU or CN?");
 		country = in.nextLine();
 			
 		int kwh;
 		
 			if (country.equals("US") {
 			kwh = 0.12
 			}
 		
 	
 		System.out.println("Screen size grouping: "+ c);
 		System.out.println("Cost of computer = $" +total1);
 	}
	
 }