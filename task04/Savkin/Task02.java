package by.it.task04.Savkin;

public class Task02 {
	public static void pk(int[][] mas, int p, int k) { // решение задачи №2 вывод заданной строки и столбца

		for (int j = 0; j < mas[p].length; j++) {
			System.out.print(" " + mas[p][j]);
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) { 
			System.out.println(" " + mas[i][k]);
		}
	} 
}
