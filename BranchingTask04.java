package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 4. Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class BranchingTask04 {

	public static void main(String[] args) {

		double a;
		double b;

		double x;
		double y;
		double z;

		boolean p;

		do {
			a = inputDouble("Размер отверстия а >> ");
		} while (a <= 0);

		do {
			b = inputDouble("Размер отверстия b >> ");
		} while (b <= 0);

		do {
			x = inputDouble("Размер кирпича x >> ");
		} while (x <= 0);

		do {
			y = inputDouble("Размер кирпича y >> ");
		} while (y <= 0);

		do {
			z = inputDouble("Размер кирпича z >> ");
		} while (z <= 0);

		/*
		 * пробуем три стороны кирпича + поворот 90 градусов
		 */

		if (x <= a & y <= b | x <= b & y <= a) {
			p = true;

		} else if (x <= a & z <= b | x <= b & z <= a) {
			p = true;

		} else if (y <= a & z <= b | y <= b & z <= a) {
			p = true;

		} else {
			p = false;
		}

		if (p == true) {
			System.out.println("Кирпич прошел");

		} else {
			System.out.println("Не лезет ...");
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
