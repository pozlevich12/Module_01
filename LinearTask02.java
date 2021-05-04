package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 2. Вычислить значение выражения по формуле(все переменные принимают
 * действительные значения).
 */

public class LinearTask02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double sqrt;
		double result;

		do {
			a = inputDouble("Введите а (!=0) >> ");
		} while (a == 0);

		do {
			b = inputDouble("Введите b (!=0) >> ");
		} while (b == 0);

		c = inputDouble("Введите c >> ");

		sqrt = Math.pow(b, 2) + 4 * a * c;

		if (sqrt < 0) {

			System.out.println("Решение с заданными входными значениями невозможно.");

		} else {

			result = (b + Math.sqrt(sqrt)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("result = " + result);

		}
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
