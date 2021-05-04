package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 6. Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (x, y) принадлежит закрашенной области, и false - в
 * противном случае.
 */

public class LinearTask06 {

	public static void main(String[] args) {

		double x;
		double y;
		boolean result;

		x = inputDouble("Введите x >>");
		y = inputDouble("Введите y >>");

		result = (x >= (-2) & x <= 2 & y >= 0 & y <= 4) | (x >= (-4) & x <= 4 & y >= (-3) & y <= 0);
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
