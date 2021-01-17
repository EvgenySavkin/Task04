package by.it.task04.Savkin;

public class Task03 {

	public static void snaik(int[][] mas) { // вывод массива первая строка справа налево, вторая строка слева направо и
											// тд

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.print(" " + mas[i][j]);
				}
			} else
				for (int j = mas[i].length; j > mas[i].length; j--);
					
		}
	}
}
