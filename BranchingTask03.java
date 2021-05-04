package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 3. Даны три точки A(x1, y1), B(x2, y2), C(x3, y3). Определить, будут ли они
 * расположены на одной прямой.
 */

public class BranchingTask03 {

	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double f;

		x1 = inputDouble("Введите x1 >> ");
		y1 = inputDouble("Введите y1 >> ");
		x2 = inputDouble("Введите x2 >> ");
		y2 = inputDouble("Введите y2 >> ");
		x3 = inputDouble("Введите x3 >> ");
		y3 = inputDouble("Введите y3 >> ");

		f = (x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1);
		f = Math.round(f * 10E6) / 10E6;

		if (f == 0) {

			System.out.println("Точки расположены на одной прямой");
		}

		else {
			System.out.println("Точки не расположены на одной прямой");
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
