package by.it.task04.Savkin;

public class Task11 {
	 public static void sl() {              // вывод строк в которых есть больше трех пятерок
         int n = 10;                        // массив формируется внутри метода случайными числами
         int m = 20;
         int s = 0;
         int k = 0;
        
         int[] rez;
         rez = new int[n];
         int[][] mass = new int[n][m];
         for (int i = 0; i < mass.length; i++) {
             for (int j = 0; j < mass[i].length; j++) {
                 mass[i][j] = (int) (Math.random() * 10);
                 System.out.print(" " + mass[i][j]);
                 if (mass[i][j] == 5)
                     s = s + 1;
                 if (s >= 3)
                     rez[k] = i + 1;
             }
             s = 0;
             System.out.println();
             k = k + 1;
         }
         System.out.println();
         for (int i = 0; i < mass.length; i++) {

             if (rez[i] > 0) {
                 for (int j = 0; j < mass[i].length; j++) {
                     System.out.print(" " + mass[i][j]);
                 }
                 System.out.println();

             }
         }
     }
}
