package Exercice3;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//X is the end of interval
		
		System.out.println("Enter an number please !!! ");
		
		int X = sc.nextInt();
		
		
		//generate numbre with random
		
		System.out.println("Enter another number please ");
		
		int nombre = sc.nextInt();
		
		Random rand = new Random();
		
		for(int i=0; i<nombre; i++) {
			int n = rand.nextInt(1, X+1);
			
			System.out.println(n);
		};
		
	}

}
