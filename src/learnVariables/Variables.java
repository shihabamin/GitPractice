package learnVariables;

import java.util.Scanner;

public class Variables {
	
	
	
	
	
	public static void main(String[] args) {
		
		int a = 10;
		
		
		int b = 15;
		String s = "Mahi";
		a = b;
		a = a+a;
		
		System.out.println("    Hi, What      is your age?      ");
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.println(n+n);
		
	}
	
	

}
