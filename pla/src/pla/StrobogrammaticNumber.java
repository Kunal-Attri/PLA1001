package pla;

import java.util.HashMap;
import java.util.Scanner;

public class StrobogrammaticNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Character, Character> rotate = new HashMap<>();
		rotate.put('0', '0');
		rotate.put('1', '1');
		rotate.put('6', '9');
		rotate.put('8', '8');
		rotate.put('9', '6');
		
		System.out.print("Value of n: ");
		int n = sc.nextInt();
		
		for (int i = (int) Math.pow(10, n-1); i <= Math.pow(10, n); i++) {
			StringBuilder a = new StringBuilder(String.valueOf(i));
			StringBuilder b = new StringBuilder();
			for (char m : a.reverse().toString().toCharArray()) {
				if (rotate.containsKey(m)) {
					b.append(rotate.get(m));
				} else { 
					b.append('0'); 
				}
			}
			if (Integer.parseInt(b.toString()) == i) {
				System.out.println(b);
			}			
		}
		
		sc.close();
	}
}
