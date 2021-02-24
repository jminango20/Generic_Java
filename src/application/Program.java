package application;

import java.util.Scanner;

import servicies.PrintService;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		PrintService<String> p = new PrintService<>();
		
		System.out.print("How many values? ");
		int values = sc.nextInt();
		
		//Adicionado
		//p.addValue("Juan");
		
		for(int i=0; i<values; i++) {
			String value = sc.next();
			p.addValue(value);
		}
		
		p.print();
		System.out.println();
		String x = p.first();
		System.out.println("First: " + x);
		
		
		
		
		sc.close();
		
	}

}
