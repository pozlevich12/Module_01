package by.epam.jonline.mod01;

import java.util.Scanner;

/*
 * 6. Вывести на экран соответствие между символами и их численными
 * обозначениями в памяти компьютера.
 */

public class CycleTask06 {

	public static void main(String[] args) {

		int b;
		char a;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите символ (будет прочитан только первый) >> ");
		a = sc.next().charAt(0);

		b = (int) a;
		System.out.println("Код(dec) введенного символа в таблице Unicode: " + b);

		do {
			b = inputInt("Введите код(dec) символа Unicode, от 0 до 65535 (UTF-8) >> ");
		} while (b < 0 & b > 65535);

		System.out.println("Вы ввели код символа: " + (char) b);
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
