package by.it.task04.Savkin;

public class Task05 {
	public static void d(int n) {     // решение задачи №5. Формирует побочную диагональ  остальное заполняем нулями
		
		int[][] mas2 = new int[n][n];
		
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2.length; j++) {
				if ((i + j) == (mas2.length - 1))
					mas2[i][j] = i + 1;
				else
					mas2[i][j] = 0;
				System.out.print(" " + mas2[i][j]);
			}
			System.out.println();
		}
	}
}
