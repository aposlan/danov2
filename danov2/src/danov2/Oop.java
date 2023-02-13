package danov2;

import java.util.*;

public class Oop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input how many numbers you'd like to compare.");
		byte n = sc.nextByte();
		int biggestNum = Integer.MIN_VALUE, smallestNum = Integer.MAX_VALUE, sum = 0;
		int[] Numbers = new int[n];
		for (int i = 0; i < Numbers.length; i++) {
			System.out.print("Input " + (i + 1) + " number:");
			Numbers[i] = sc.nextInt();
		}
		for (int j = 0; j < Numbers.length; j++) {
			if (Numbers[j] > biggestNum) {
				biggestNum = Numbers[j];
			}
			if (Numbers[j] < smallestNum) {
				smallestNum = Numbers[j];
			}
			sum += Numbers[j];
		}
		System.out.println("Biggest number is: " + biggestNum + "\n" + "Smallest number is: " + smallestNum);
		System.out.println("Sum is:" + sum);
	}
}