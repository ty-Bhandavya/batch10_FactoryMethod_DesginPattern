package com.te.factoryMethod.Demo;

import java.util.Scanner;

public class MainGenerateBill {

	public static void main(String[] args) {
		GetPlan gp = new GetPlan();
		System.out.println("Enter the plan which you want the bill be generate:");
		
		Scanner sc = new Scanner(System.in);
		String s = 	sc.nextLine();
		
		System.out.println("Enter the number of units for calculate the bill");
		int units = Integer.parseInt(sc.nextLine());
		
		Plan p =gp.getPlan(s);
		System.out.println("Bill Amount :" +s+ "of" +units+ "units is:");
		p.getRate();
		p.Calculatebill(units);
		

	}

}
