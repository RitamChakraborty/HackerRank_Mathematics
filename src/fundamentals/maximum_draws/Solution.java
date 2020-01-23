// https://www.hackerrank.com/challenges/maximum-draws/problem

package fundamentals.maximum_draws;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			int n = scanner.nextInt();
			System.out.println(n + 1);
		}
	}
}
