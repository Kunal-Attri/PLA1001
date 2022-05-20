package pla;

import java.util.Scanner;

public class AliceAppleTree {
	
	public static int minApples(int k, int m, int n, int s, int w, int e) {
		if (m <= k * s) {
			return m;
		} else if (m <= s * k + e + w) {
			return (s * k + (m - s * k) + k);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("K M: ");
		int k = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.print("N S W E: ");
		int n = sc.nextInt();
		int s = sc.nextInt();
		int w = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println("Min apples required: " + minApples(k, m, n, s, w, e));
		
		sc.close();
	}

}
