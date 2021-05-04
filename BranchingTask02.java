package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 2. Найти max{min(a, b), min(c, d)}.
 */

public class BranchingTask02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double max;

		a = inputDouble("Введите а >> ");
		b = inputDouble("Введите b >> ");
		c = inputDouble("Введите c >> ");
		d = inputDouble("Введите d >> ");

		if (a <= b) {

			max = a;

		} else {

			max = b;
		}

		if (c <= d & c > max) {

			max = c;

		} else if (d > max) {

			max = d;
		}

		System.out.println("max{ min(a, b), min(c, d) }: " + max);

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
