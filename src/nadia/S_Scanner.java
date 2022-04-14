package nadia;

import java.util.Scanner;

public class S_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float SalesTax = 0.088f;
		
		System.out.println("Qty of Cucumber");
		int QCucumber = sc.nextInt();
		System.out.println("Price per Cucumber box : ");
		double PCucumber = sc.nextDouble();
		double totalCucumber = QCucumber*PCucumber;
		System.out.println("Price for Cucumber :" + totalCucumber);
		
		System.out.println("Qty of Tomato");
		int QTomato = sc.nextInt();
		System.out.println("Price per Tomato box : ");
		double PTomato =sc.nextDouble();
		double totalTomato = QTomato*PTomato;
		System.out.println("Price for Tomato : "+ totalTomato);
		
		double Subtotal = (totalCucumber + totalTomato );
		double Totaltax = (Subtotal*SalesTax);
		double TotalAfterSalesTax = (Subtotal+Totaltax);
		
		
		sc.close();
		
		
	}
	
}
