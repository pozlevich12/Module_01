package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 */

public class BranchingTask01 {

	public static void main(String[] args) {

		double a;
		double b;

		a = inputDouble("Введите угол a (град) >> ");
		b = inputDouble("Введите угол b (град) >> ");

		if (a > 0 & b > 0 & a + b < 180) {

			if (a == 90 | b == 90 | 180 - a - b == 90) {

				System.out.println("Существование треугольника возможно, он будет прямоугольным");

			} else {

				System.out.println("Существование треугольника возможно, он не будет прямоугольным");

			}
		} else {

			System.out.println("Существования треугольника невозможно");

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
