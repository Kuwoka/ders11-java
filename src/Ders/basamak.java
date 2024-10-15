package Ders;
import java.util.Scanner;

public class basamak {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi;
		int basamak5;
		int basamak4;
		int basamak3;
		int basamak2;
		int basamak1;
		System.out.print("5 basamaklı bir sayi girin: ");
		sayi = input.nextInt();
		basamak1 = sayi%10;
		sayi = sayi/10;
		basamak2 = sayi%10;
		sayi = sayi/10;
		basamak3 = sayi%10;
		sayi = sayi/10;
		basamak4 = sayi%10;
		sayi = sayi/10;
		
		
		System.out.printf("1. basamak : %d\n", basamak1);
		System.out.printf("2. basamak : %d\n", basamak2);
		System.out.printf("3. basamak : %d\n", basamak3);
		System.out.printf("4. basamak : %d\n", basamak4);
		System.out.printf("5. basamak : %d", sayi);
		
	}
}
