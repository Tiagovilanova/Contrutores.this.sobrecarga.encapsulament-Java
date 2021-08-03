package application;

import java.util.Locale;
import java.util.Scanner;

import entities.exfix;

public class exfiapp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		exfix ex = new exfix();

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);

		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			ex = new exfix(number, holder, initialDeposit);
		} else {
			ex = new exfix(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(ex);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue =sc.nextDouble();
		ex.deposit(depositValue);
		System.out.println(ex);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraVAlue =sc.nextDouble();
		ex.withdraw(withdraVAlue);
		System.out.println(ex);
		sc.close();
	}

}
