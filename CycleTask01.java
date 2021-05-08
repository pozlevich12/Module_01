package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 1. Напишите программу, где пользователь вводит любое целое положительное
 * число. А программа суммирует все числа от 1 до введенного пользователем
 * числа.
 */

public class CycleTask01 {

	public static void main(String[] args) {
		
		int a;
		int sum;

		sum = 0;
		
		do {
			a = inputInt("Введите положительное целое число >> ");
			
		} while (a <= 0);

		for (int i = 1; i <= a; i++) {
			
			sum += i;
		}

		System.out.println("result: " + sum);
	}
	
	public static int inputInt(String a) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		while (!sc.hasNextInt()) {
			System.out.println(">>");
			sc.nextLine();
		}

		return sc.nextInt();
	}
}
