package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */

public class LinearTask04 {

	public static void main(String[] args) {

		double r;
		double rAbs;
		double result;
		boolean check;

		check = false;

		do {

			r = inputDouble("Введите число в формате xxx.yyy >> ");
			rAbs = Math.abs(r);

			if (rAbs >= 111 & rAbs < 1000) {
				if ((int)rAbs % 111 == 0) {

					rAbs -= (int) rAbs;
					rAbs = (Math.round(rAbs * 10E6)) / 10E6; // исключаю возможные баги

					if (rAbs*1000 % 111 == 0) {

						check = true;
					}
				}
			}
		} while (!check);

		result = (r * 1000) % 1000 + (int) r / 1000.0;
		System.out.println("result: " + result);

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
