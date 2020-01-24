// https://www.hackerrank.com/challenges/game-with-cells/problem

package fundamentals.army_game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int N, M;
		
		if (n % 2 == 0) {
			N = n;
		} else {
			N = n + 1;
		} if (m % 2 == 0) {
			M = m;
		} else {
			M = m + 1;
		}
		
		System.out.println((N * M) / 4);
	}
}
