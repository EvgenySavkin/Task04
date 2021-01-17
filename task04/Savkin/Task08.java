package by.it.task04.Savkin;

public class Task08 {
	
	public static void man(int n) { // решение задачи №8
		
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((i + j) > arr.length - 1)
					arr[i][j] = 0;
				else
					arr[i][j] = i + j + 1;
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}
}