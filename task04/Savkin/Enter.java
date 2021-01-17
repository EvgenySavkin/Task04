package by.it.task04.Savkin;

public class Enter {

	public static int[][] enter(int n, int m) { // заполнение матрицы размерности n*m, случайными числами

		int[][] mas = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mas[i][j] = -50 + (int) (Math.random() * 100);

				if (mas[i][j] <= -10)                          // для красоты вывода
					System.out.print(" " + mas[i][j]);

				if (mas[i][j] > -10 & mas[i][j] < 0)
					System.out.print("  " + mas[i][j]);

				if (mas[i][j] > -1 & mas[i][j] < 10)
					System.out.print("   " + mas[i][j]);

				if (mas[i][j] >= 10)
					System.out.print("  " + mas[i][j]);
			}
			System.out.println();
		}
		return mas;
	}
}