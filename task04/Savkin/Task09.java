package by.it.task04.Savkin;

public class Task09 {
	public static void matrica(int n) { // решение задачи №9
		
		int[] mas = new int[n];
		int[][] matr = new int[n][n];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 100);
			System.out.print(" " + mas[i]);
		}
		System.out.println();
		
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				matr[i][j] = (int) Math.pow(mas[j], i + 1);
				System.out.print(" " + matr[i][j]);
			}
			System.out.println();
		}

	}
}
