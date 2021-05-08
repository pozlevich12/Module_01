package by.epam.jonline.mod01;

/*
 * 3. Найти сумму квадратов первых ста чисел.
 */

public class CycleTask03 {

	public static void main(String[] args) {
		
		int result;
		
		result = 0;

		for (int i = 1; i <= 100; i++) {
			
			result = result + (int) Math.pow(i, 2);
		}

		System.out.println("Сумма квадратов первых ста чисел: " + result);
	}
}
