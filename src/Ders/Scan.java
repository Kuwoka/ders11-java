package Ders;
import java.util.Scanner;


public class Scan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		int extract;
		int bolum;
		int carpim;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		sum = number1+number2;
		extract = number1-number2;
		bolum = number1/number2;
		carpim = number1*number2;
		
		System.out.printf("Sum is : %d%n", sum);
		System.out.printf("Extract is : %d%n", extract);
		System.out.printf("Bolum is : %d%n", bolum);
		System.out.printf("Carpim is : %d%n", carpim);
		
	}
}
