package com.objectoriented.eclipse;

public class FirstJavaClass {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int num : numbers) {
			sum += num;
			System.out.println(sum);
		}
	}
}
