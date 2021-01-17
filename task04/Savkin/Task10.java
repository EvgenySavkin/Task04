package by.it.task04.Savkin;

public class Task10 {

	public static void polozh(int[][] mas) { // вывод положительных элментов главной диагонали предст. матр

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++)
				if (i == j & mas[i][j] > 0)
					System.out.print(" " + mas[i][j]);
		}
	}
}
