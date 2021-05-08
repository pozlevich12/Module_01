package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е. Общий член ряда имеет вид: a(n) = 1/(2^n) + 1/(3^n)
 */

public class CycleTask05 {

	public static void main(String[] args) {

		double a;
		double e;
		double n;
		double sum;

		do {
			e = inputDouble("Введите точность e(>0) >> ");
		} while (e <= 0);

		n = 0;
		sum = 0;
		a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);

		while (a >= e) {

			sum += a;
			n++;
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
		}

		System.out.println("Сумма членов ряда: " + sum);
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
