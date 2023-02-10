package Exercice2;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		//get user values
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisie la premiere valeur");
		double value1 = sc.nextDouble();
		
		System.out.println("Veuillez saisie la deuxieme valeur");
		double value2 = sc.nextDouble();
		
		
		System.out.println("Veuillez saisie la troisieme valeur");
		double value3 = sc.nextDouble();
		

	}
	
	//product method
	
	public static double product(double value1,double value2,double value3){
		
		double	prod = value1*value2*value3;
			
			return prod;
		}
	
    
    //sum method
	
    public static double sum(double value1,double value2,double value3){
		
		
		double sum = Double.sum(Double.sum(value1, value2), value3);
			
			return sum;
		}
    
    
 //average method
	
    public static double average(double value1,double value2,double value3){
		
		
		double average = sum(value1,value2,value3)/3;
			
			return average;
		}
    
    
//max
	
    public static double Max(double value1,double value2,double value3){
		
		double Max = Math.max(Math.max(value1, value2),value3);
			
			return Max;
		}
    
 
//min
	
    public static double Min(double value1,double value2,double value3){
		
		double Min = Math.min(Math.min(value1, value2),value3);
			
			return Min;
		}
}
