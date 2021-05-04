package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 5. Вычислить значение функции F(x) = ... .
 */

public class BranchingTask05 {

	public static void main(String[] args) {

		double x;
		double f;

		x = inputDouble("Введите x >> ");

		if (x <= 3) {

			f = x * x - 3 * x + 9;

		} else {

			f = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("F(x) = " + f);

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
