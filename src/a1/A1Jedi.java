package a1;

import java.util.Scanner;

public class A1Jedi {
//Worked with Fayyaz & TAs on bugs and conceptual issues
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//Store Inventory
		
		int storeItems = scan.nextInt();
		
		String[] itemNameData = new String[storeItems];
		
		double[] itemPriceData = new double[storeItems];
		
		int[] cusPerItem = new int[storeItems];
		
		int[] itemPurch = new int[storeItems];
		
		int[] count = new int[storeItems];
		
		int[] countAtZero = new int[storeItems];
		
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
							count[j]+=1;
							if(count[j]>1) {
								itemPurch[j] += itemquantity;
							} else {
							cusPerItem[j] += 1;
							itemPurch[j] += itemquantity;
							}
						}		
					}
					PriceData[i] = total;
					
					
					//System.out.println("Customer Info: " + NameOfCustomer[i] + " " + PriceData[i]);
					
				}
				count = new int[storeItems];
			}
			
	for (int i=0; i<storeItems; i++) {
		if (itemPurch[i] > 0) {
			System.out.println(cusPerItem[i] + " customers bought " + itemPurch[i] + " " + itemNameData[i]);
		} else {
			System.out.println("No customers bought " + itemNameData[i]);
		}
	}
	scan.close();
	}
		
}
