package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int storeItems = scan.nextInt();
		String[] itemNameData = new String[storeItems];
		double[] itemPriceData = new double[storeItems];
		for (int i=0; i<storeItems; i++) {
			itemNameData[i] = scan.next();
			itemPriceData[i] = scan.nextDouble();
		}
		int customernum = scan.nextInt();
			double max = 0;
			double min = 100.00;
			String[] firstData = new String[customernum];
			String[] lastData = new String[customernum];
			double[] paidforData = new double[customernum];
			
			for (int i = 0; i<customernum; i++) {
								
				firstData[i] = scan.next();
				
				lastData[i] = scan.next();
				
				int quantity = scan.nextInt();
				
				double total = 0.00;
			
				for(int z=0; z<quantity; z++) {
				
					int itemquantity = scan.nextInt();				
					
					String itemname = scan.next();
					
					for (int j=0; j<itemNameData.length; j++) {
						if(itemname == itemNameData[i]) {
							total = total + itemPriceData[i]*itemquantity;
						}
					}
					paidforData[i] = total;
					
				};
					
			}
			//max
			int o = 0;
			for (int k=0; k < paidforData.length; k++) {
				if (paidforData[k] > max) {
					max = paidforData[k];
					
				}
				o = k;
			}
			System.out.println("Biggest: " + firstData[o] + " " + lastData[o] + " (" + max + ")");
			
			//min
			int l = 0;
			for (int k=0; k < paidforData.length; k++) {
				if (paidforData[k] < min) {
					min = paidforData[k];
					
				}
				l = k;
			}
			System.out.println("Smallest: " + firstData[l] + " " + lastData[l] + " (" + min + ")");
			
			//Average
			double average = 0;
			for (int k=0; k < paidforData.length; k++) {
				average = (average + paidforData[k])/paidforData.length;
			}
			System.out.println("Average: " + average);
			
			
	scan.close();
	}
}
