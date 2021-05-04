package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 5. Дано натуральное число T, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: HHч MMмин SSс.
 */

public class LinearTask05 {

	public static void main(String[] args) {

		int t;
		int hours;
		int minutes;
		int seconds;

		do {
			t = inputInt("Введите натуральное число T(сек): ");
		} while (t <= 0);

		hours = t / 3600;
		minutes = t % 3600 / 60;
		seconds = t % 3600 - minutes * 60;
		System.out.println("result: " + hours + "ч " + minutes + "мин " + seconds + "с");

	}

	public static int inputInt(String a) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		while (!sc.hasNextInt()) {
			System.out.println(">>");
			sc.nextLine();
		}

		return sc.nextInt();
	}

}
