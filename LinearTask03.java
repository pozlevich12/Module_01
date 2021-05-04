package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 3. Вычислить значение выражения по формуле(все переменные принимают
 * действительные значения).
 */

public class LinearTask03 {

	public static void main(String[] args) {

		double x;
		double y;
		double x_Rad;
		double y_Rad;
		double xy_Rad;
		double chislitel;
		double znamenatel;
		double result;

		x = inputDouble("Введите угол x (град) >> ");
		y = inputDouble("Введите угол y (град) >> ");

		x_Rad = x * Math.PI / 180;
		y_Rad = y * Math.PI / 180;
		xy_Rad = x * y * Math.PI / 180;

		/*
		 * Так как из-за числа Pi невозможно корректно определить значение выражения в
		 * пограничных значениях тригонометрической окружности, я применил округление.
		 */

		chislitel = Math.round((Math.sin(x_Rad) + Math.cos(y_Rad)) * 1000) / 1000.0;
		znamenatel = Math.round((Math.cos(x_Rad) - Math.sin(y_Rad)) * 1000) / 1000.0;

		if (x * y % 90 == 0 & x * y % 180 != 0 & x * y != 0) {

			System.out.println("Ошибка, tan вне области определения.");

		} else if (znamenatel == 0) {

			System.out.println("Ошибка, знаменатель выражения равен нулю.");

		} else {

			result = chislitel / znamenatel * Math.round((Math.tan(xy_Rad)) * 1000) / 1000.0;
			System.out.println("result: " + result);

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
