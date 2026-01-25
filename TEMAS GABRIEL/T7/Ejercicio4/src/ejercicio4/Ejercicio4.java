package ejercicio4;

/**
 * Ejercicio4
 * @author Gabriel Acaro Sánchez
 * 
 */
public class Ejercicio4 {
    
    private static int ROW = 4;
    private static int COL = 3;
    
    public static boolean isEven(int num) {
        boolean even = false;
        
        if (num % 2 == 0) {
            even = true;
        }
        
        return even;
    }
    
    
    public static void fillArray(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * (200 - 100 + 1)) + 100;
            }
        }
    }
    
    public static void showArray(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            String row = "";
            for (int j = 0; j < array1[i].length; j++) {
                if (isEven(array1[i][j])) {
                    row += "[" + i + j + "]-->" + array1[i][j] + " ";
                } else {
                    row += "[" + i + j + "]-->" + " ! ";
                }
            }
            System.out.println(row);
        }
    }
    public static void main(String[] args) {
        int[][] array1 = new int[ROW][COL];
        
        fillArray(array1);
        showArray(array1);
    }

}
