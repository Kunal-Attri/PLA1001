package pla;

import java.util.HashMap;
import java.util.Scanner;

public class EulerPhiAlgorithm {
	
	public static HashMap<Integer, Integer> get_factors(int num) {
		HashMap<Integer, Integer> factors = new HashMap<>();
		int numSqrt = (int) Math.sqrt(num);
		if (num % 2 == 1) {
			for (int i = 3; i <= numSqrt; i += 2) {
				while (num % i == 0 && Basic_Functions.isprime(i) && num != 1) {
					if (factors.containsKey(i)) {
						factors.replace(i, factors.get(i), factors.get(i) + 1);
					} else {
						factors.put(i, 1);
					}
					num /= i;
				}
			}
		} else {
			for (int i = 2; i <= numSqrt; i++) {
				while (num % i == 0 && Basic_Functions.isprime(i) && num != 1) {
					if (factors.containsKey(i)) {
						factors.replace(i, factors.get(i), factors.get(i) + 1);
					} else {
						factors.put(i, 1);
					}
					num /= i;
				}
			}
		}
		return factors;
	}
	
	
	public static int euler_phi(int num) {
		int phi = 1;
		if (Basic_Functions.isprime(num)) {
			phi = num - 1;
		} else {
			HashMap<Integer, Integer> factors = get_factors(num);
			for (int factor : factors.keySet()) {
				phi *= ((Math.pow(factor, factors.get(factor) - 1)) * (factor - 1));
			}
		}
		return phi;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("Phi value: " + euler_phi(num));
	}

}
