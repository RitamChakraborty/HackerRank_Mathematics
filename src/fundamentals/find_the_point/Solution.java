// https://www.hackerrank.com/challenges/find-point/problem

package fundamentals.find_the_point;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			
			int x3 = (x2 + (x2 - x1));
			int y3 = (y2 + (y2 - y1));
			
			System.out.println(x3 + " " + y3);
		}
	}
}
