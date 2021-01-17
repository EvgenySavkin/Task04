package by.it.task04.Savkin;

public class Task04 {
	public static int[][] Rt(int n) {
		int[][] mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					mas[i][j] = j;
				}
			} 
			
			else {
				for (int j = 0; j < n; j++) {
					mas[i][j] = n - j;

				}
			}
		}
return mas;
	}
}
