package by.it.task04.Savkin;

public class Task01 {
	public static void diag(int[][] mas) {   // вывод диагональных элементов переданного в метод массива
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
		
				if ((i == j) || (i + j) == (mas.length - 1))
					System.out.print(" " + mas[i][j]);
				else
					System.out.print("   ");
			}
			
			System.out.println();
		}

	}
}
