package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		
		System.out.println("Enter the number of customers:");
		int customernum = scan.nextInt();
		
		//String[] data = new String[customernum];
		//for (int f=0; f<customernum; f++) {
			
		for (int i = 0; i<customernum; i++) {
			
			//String[] values = new String[2];
				
				System.out.println("Enter First Name:");
				String first = scan.next();
				
				System.out.println("Enter Last Name:");
				String last = scan.next();
				
				
				System.out.println("Enter Total Number of Items Purchased:");
				int quantity = scan.nextInt();
				
				double total = 0;
			
				for(int z=0; z<quantity; z++) {
				
					System.out.println("Enter quantity of item:");
					int itemquantity = scan.nextInt();
					
					System.out.println("Enter item name:");
					String itemname = scan.next();
					
					System.out.println("Enter item price");
					double itemprice = scan.nextDouble();
					
					total = total + itemprice*itemquantity;
				};
				System.out.println(first.charAt(0) + ". " + last +  ": " + total);
				//data[i] = first.charAt(0) + ". " + last +  ": " + total;
			}
		
		//for (int i=0;i<data.length;i++) {
			//System.out.println(data[i]);
		//}
	scan.close();
	}
}
