package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и
 * второго числа.
 */

public class CycleTask08 {

	public static void main(String[] args) {

		int a;
		int a_check;
		int b;
		int b_check;
		int x;
		int y;
		boolean check;

		a = Math.abs(inputInt("Введите a(int) >> "));
		b = Math.abs(inputInt("Введите b(int) >> "));

		for (int i = 0; i < 10; i++) {

			a_check = a;
			b_check = b;
			check = false;

			do {
				x = a_check % 10; // запоминаем последнюю цифру в числе a
				a_check = (int) a_check / 10; // убираем последнюю цифру с числа

				if (x == i) {
					do {

						y = b_check % 10; // запоминаем последнюю цифру в числе b
						b_check = (int) b_check / 10; // убираем последнюю цифру с числа

						if (x == y) {
							System.out.println("Найдено совпадение по цифре " + i);
							check = true; // нашли совпадение, раньше перейдем к след. i
							break;
						}
					} while (b_check != 0);
				}
			} while (a_check != 0 & !check);
		}
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
