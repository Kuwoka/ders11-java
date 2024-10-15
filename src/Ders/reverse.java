package Ders;
import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi;
		int basamak1;
		System.out.print("Bir sayi girin: ");
		sayi = input.nextInt();
		while (sayi!=0) {
			basamak1 = sayi%10;
			sayi = sayi/10;
			System.out.print(basamak1);
			}
		}
	}

