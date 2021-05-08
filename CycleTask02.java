package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 2. Вычислить значения функции на отрезке [a, b] с шагом h: y = x, при x > 2;
 * y = -x, при x <=2.
 */

public class CycleTask02 {

	public static void main(String[] args) {

		double a;
		double b;
		double step;
		double y;

		do {
			System.out.println("Введите [a, b]:");
			a = inputDouble("a >> ");
			b = inputDouble("b >> ");
		} while (a > b);

		do {
			step = inputDouble("Введите шаг h (!=0) >> ");
		} while (step == 0);

		for (double i = a; i <= b & i >= a; i += step) {
			
			if (i > 2) {
				
				y = i;
				System.out.println("y = " + y + " при x = " + i);
				
			} else {
				
				y = -i;
				System.out.println("y = " + y + " при x = " + i);
			}
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
