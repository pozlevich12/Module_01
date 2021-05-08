package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 7. Для каждого натурального числа в промежутке от m до n вывести все
 * делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class CycleTask07 {

	public static void main(String[] args) {

		int m;
		int n;

		do {
			m = inputInt("Введите диапазон натурального ряда чисел [m, n]:\nm >> ");
			n = inputInt("n >> ");
		} while (m > n | m <= 0);

		while (m <= n) {

			System.out.print("\nДелители числа " + m + ":\t");
			for (int i = 2; i < m; i++) {

				if (m % i == 0) {
					System.out.print(i + "\t");
				}
			}
			m++;
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
