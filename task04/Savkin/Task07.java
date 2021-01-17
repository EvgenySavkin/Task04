package by.it.task04.Savkin;

public class Task07 {
	public static void min(int n) { // решение задачи №7. Формирует матрицу с нулями в конце строк

		int[][] mas4 = new int[n][n];
		for (int i = 0; i < mas4.length; i++) {
			for (int j = 0; j < mas4.length; j++) {
				if ((i + j) > mas4.length - 1)
					mas4[i][j] = 0;
				else
					mas4[i][j] = i + 1;
				System.out.print(" " + mas4[i][j]);
			}
			System.out.println();

		}
	}
}