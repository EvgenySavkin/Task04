package by.it.task04.Savkin;

public class Task06 {
	public static void on(int n) { // ������� ������ �6. ��������� ������� � 1 �� ����� (������ 0)
		
		int[][] mas3 = new int[n][n];
		
		for (int i = 0; i < mas3.length; i++) {
			for (int j = 0; j < mas3.length; j++) {
				if (i == 0 || j == 0 || i == mas3.length - 1 || j == mas3.length - 1)
					mas3[i][j] = 1;
				else
					mas3[i][j] = 0;
				System.out.print(" " + mas3[i][j]);
			}
			System.out.println();
		}
	}
}
