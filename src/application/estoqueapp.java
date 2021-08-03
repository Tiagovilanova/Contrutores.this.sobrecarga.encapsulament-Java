package application;

import java.util.Locale;
import java.util.Scanner;

import entities.estoque;

public class estoqueapp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		estoque ex;

		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
	
		
		ex=new estoque(name, price);
		
		System.out.println();
		System.out.println("Product data: " + ex);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		ex.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data:: " + ex);
		
		System.out.println("");
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = sc.nextInt();
		ex.removeProducts(quantity);
		
		System.out.println();

		System.out.println("Update data:: " + ex);

		sc.close();

	}

}
