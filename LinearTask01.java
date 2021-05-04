package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 */

public class LinearTask01 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		a = inputDouble("Введите а >> ");
		b = inputDouble("Введите b >> ");
		c = inputDouble("Введите c >> ");

		z = ((a - 3) * b / 2.0) + c;
		System.out.println("z = " + z);
	}

	public static double inputDouble(String a) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		while (!sc.hasNextDouble()) {
			System.out.println(">>");
			sc.nextLine();
		}

		return sc.nextDouble();
	}

}
