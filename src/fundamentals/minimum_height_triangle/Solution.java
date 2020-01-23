// https://www.hackerrank.com/challenges/lowest-triangle/problem

package fundamentals.minimum_height_triangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double b = scanner.nextInt();
		double a = scanner.nextInt();
		int h = (int) Math.round(2.0 * a / b);
		
		double area = (double) h * b / 2.0;
		
		if (area < a) {
			++h;
		}
		
		System.out.println(h);
	}
}
