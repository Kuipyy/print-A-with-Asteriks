
public class Main {
    public static void main(String[] args) {

        String[][] matrix = new String[6][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i == 0 || i == 2) || (j == 0 || j == 3)) {
                    matrix[i][j] = " * ";
                } else {
                    matrix[i][j] = "   ";
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}