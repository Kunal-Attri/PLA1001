package pla;

import java.util.ArrayList;
import java.util.Scanner;

public class EratosthenesSieveAlorithmPrimeNo {
	
	public static boolean isprime(int num) {
		int[] basic_prime = {3, 5, 7, 11, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		boolean prime = true;
		
		if (num % 2 == 0 && num / 2 != 1) {
			prime = false;
		}
		else {
			for (int i: basic_prime) {
				if (num % i == 0 && num / i == 1) {
					break;
				}
				else if (num % i == 0 && num / i != 1) {
					prime = false;
				}
			}
			if (prime) {
				for (int i = 101; i < Math.sqrt(num); i+= 2) {
					if (num % i == 0) {
						prime = false;
						break;
					}
				}
			}
		}
		return prime;
	}
	
	
	public static ArrayList<Integer> prime_eratosthenes_sieve(int endNum) {
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i  = 2; i <= endNum; i++) {
			nums.add(i);
		}
		for (int i = 2; i <= (int) Math.sqrt(endNum); i++) {
			int temp = 2;
			int a = i * temp;
			while ( a <= endNum) {
				if (nums.contains(a)) {
					nums.remove(nums.indexOf(a));
				}
				temp++;
				a = i * temp;
			}
		}
		return nums;
	}
	
	
	
	public static void main (String[] args) {
		int start, end, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Start no: ");
		start = sc.nextInt();
		System.out.print("End no: ");
		end = sc.nextInt();
		sc.close();
		
		double a = System.currentTimeMillis();
		
		System.out.println("My method - Prime no.s:-");
		for (int i = start; i <= end; i++) {
			if (isprime(i) && i != 1) {
//				System.out.println(i);
				total++;
			}
		}
		System.out.println("Total prime no.s: " + total);
		
		double b = System.currentTimeMillis();
		System.out.println("Time: " + ((b-a)/1000));
		
		
//		System.out.println("\nEratostenes Sieve method - Primt no.s:-");
//		ArrayList<Integer> primes = prime_eratosthenes_sieve(end);
//		System.out.println("Total prime no.s: " + primes.size());
//		System.out.println(primes.toString());
	}

}
