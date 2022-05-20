package pla;

public class Basic_Functions {
	
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

}
