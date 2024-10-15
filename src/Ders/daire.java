package Ders;
import java.util.Scanner;

public class daire {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double yaricap;
		double alan;
		double cevre;
		double pi;
		pi = 3.141519;
		System.out.print("Yaricapi girin: ");
		yaricap = input.nextDouble();
		cevre = 2*pi*yaricap;
		alan = pi*yaricap*yaricap;	
		
		System.out.println(cevre);
		System.out.println(alan);
	}
}
