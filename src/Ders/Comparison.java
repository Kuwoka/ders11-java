package Ders;
import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kg;
		double boy;
		double bmi;
		double temp;
		System.out.print("Kilonuzu girin: ");
		kg = input.nextDouble();
		System.out.print("Boyunuzu metre cinsinden giriniz: ");
		boy = input.nextDouble();
		temp = (double)boy*boy;
		bmi = (double)kg/temp;
		
		if (bmi <=18.5)
			System.out.print("Zayıf");
		if (18.5<bmi && bmi<24.9)
			System.out.print("Normal");
		if (24.9<bmi && bmi<29.9)
			System.out.print("Şişman");
		if (bmi > 30)
			System.out.print("Obez");
		
	}
}
