package loops;
import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a number : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		
		
		for(int i = 2;i*i < n; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(n < 2) {
			isPrime = false;
		}
		if(isPrime) {
			System.out.println("Number is Prime!");
		}
		else {
			System.out.println("Number is not Prime!");
		}
	}
	

}
