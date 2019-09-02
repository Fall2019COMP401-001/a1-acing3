package a1;

import java.util.Scanner;

public class A1Adept {

//Worked with Fayyaz & TAs' 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		double max = 0;
		
		double min = 100.00;
		
		
		
		//Store Inventory
		
		int storeItems = scan.nextInt();
		
		String[] itemNameData = new String[storeItems];
		
		double[] itemPriceData = new double[storeItems];
		
		for (int i=0; i<storeItems; i++) {
			itemNameData[i] = scan.next();
			itemPriceData[i] = scan.nextDouble();
		}
		
		
		//# of Customers
		int customernum = scan.nextInt();
		
		//Data for each customer
		String[] NameOfCustomer = new String[customernum];
		double[] PriceData = new double[customernum];
		
		//iteration for each customer
			for (int i = 0; i<customernum; i++) {
				double total = 0.00;				
				NameOfCustomer[i] = scan.next() + " " + scan.next();
				
				//items purchased
				int quantity = scan.nextInt();
			
				//iteration for each item
				for(int z=0; z<quantity; z++) {
				
					//Amount of a specific item purchased
					int itemquantity = scan.nextInt();				
					
					//Name of the specific Item
					String itemname = scan.next();
					
					//iteration for the price of the item
					for (int j=0; j<itemNameData.length; j++) {
						if(itemname.equals(itemNameData[j])) {
							total += itemPriceData[j]*itemquantity;
						}
					}
					PriceData[i] = total;
					
					//System.out.println("Customer Info: " + NameOfCustomer[i] + " " + PriceData[i]);
					
				};
				
					
			}
			
			
			
			//max
			int o = 0;
			for (int i=0; i < PriceData.length; i++) {
				if (PriceData[i] > max) {
					max = PriceData[i];
					o = i;
				}
				
			}
			System.out.println("Biggest: " + NameOfCustomer[o] + " (" + String.format("%.2f", ((double) max)) + ")");
			
			//min
			int l = 0;
			for (int i=0; i < PriceData.length; i++) {
				if (PriceData[i] < min) {
					min = PriceData[i];
					l = i;
				}
				
			}
			System.out.println("Smallest: " + NameOfCustomer[l] + " (" + String.format("%.2f", ((double) min)) + ")");
			
			//Average
			double average = 0;
			double totalAverage;
			for (int i=0; i < PriceData.length; i++) {
				average += PriceData[i];
				//average = (average + PriceData[i])/PriceData.length;
			}
			totalAverage = average/PriceData.length;
			System.out.println("Average: " + String.format("%.2f", ((double) totalAverage)));
			
	scan.close();
	}
}

