package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		
		int customernum = scan.nextInt();
		
		for (int i = 0; i<customernum; i++) {
							
				String first = scan.next();
				
				String last = scan.next();
				
			
				int quantity = scan.nextInt();
				
				double total = 0;
			
				for(int z=0; z<quantity; z++) {
				
					int itemquantity = scan.nextInt();				
					
					String itemname = scan.next();
					
					double itemprice = scan.nextDouble();
					
					total = total + itemprice*itemquantity;
				};
				System.out.println(first.charAt(0) + ". " + last +  ": " + String.format("%.2f", ((double) total)));     
			}
	scan.close();
	}
}
