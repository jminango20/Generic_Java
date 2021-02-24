package application;

import java.util.Scanner;

import servicies.PrintServiceString;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		PrintServiceString p = new PrintServiceString();
		
		System.out.print("How many values? ");
		int values = sc.nextInt();
		
		for(int i=0; i<values; i++) {
			String value = sc.next();
			p.addValue(value);
		}
		
		p.print();
		System.out.println();
		System.out.println("First: " + p.first());
		
		
		
		
		sc.close();
		
	}

}
