import java.util.Arrays;

public class Arr2D {
    public static void main(String [] args) {

        //2D array
        int r =8, c= 8;
        String matrix[][] = new String[r][c];

        System.out.println(Arrays.toString(matrix));

        printMatrix(matrix);
        System.out.println();

        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++)
                matrix[i][j] = "(" + i + "," + j + ")";

        printMatrix(matrix);
        System.out.println();

        //reverseRowMatrix
        //reverseRow2(matrix);
        //printMatrix(matrix);
        //System.out.println();

        //reverseColumnMatrix
        //reverseColumn(matrix);
        //printMatrix(matrix);

        //reverseMatrix
        //reverseMatrix(matrix);
        //printMatrix(matrix);
        
        //transposeMatrix(matrix);
        //printMatrix(matrix);

        rotateMatrix(matrix);
        rotateMatrix(matrix);
        rotateMatrix(matrix);
        rotateMatrix(matrix);
        printMatrix(matrix);
        System.out.println();

        Integer[][] matrix1 = {{1,2,3,4,5,6,7},
                               {8,9,10,0,0,0,5},
                               {3,3,3,3,3,3,3}};

        System.out.println(Arrays.toString(sumRows(matrix1)));
        System.out.println();   
        
        Integer[][] matrix2 = {{1,2, null, 4, 5, 6, 7},
                             {null, 2, 3, 4, 5, 6, null},
                             {1,2,3,null,5,6,null}};

        System.out.println(Arrays.toString(sumRows2(matrix2)));
        System.out.println();
    }  

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }

    public static void reverseRow(String[][] matrix) {
        for (int i = 0, j = matrix.length -1; i < j; i++, j--) {
            String[] x = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = x;
        }
    }

    public static void reverseRow2(String[][] matrix) {
        for(int i = 0; i < matrix.length/2 -1; i++) {
            String[] x = matrix[i];
            matrix[i] = matrix[matrix.length -1 -i];
            matrix[matrix.length - 1 - i] = x;
        }
    }
    
    public static void reverseColumn(String[][] matrix) {
        for(int i = 0; i < matrix.length; i++)
            for (int x = 0, y = matrix[i].length -1; x < y; x++, y--) {
                String tmp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = tmp;
        }         
    }
    
    public static void reverseMatrix(String[][] matrix) {
    reverseRow2(matrix);
    reverseColumn(matrix);
    }

    //transpose matrix
    public static void transposeMatrix(String[][] matrix) {
        for(int i = 0; i < matrix.length; i++) 
            for (int j = i; j < matrix[i].length; j ++) 
                if(i != j) {
                    String temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
    }

    public static void rotateMatrix(String[][] matrix) { //transpose and rotate 
        transposeMatrix(matrix);
        reverseColumn(matrix);
    }

    public static Integer[] sumRows(Integer[][] matrix) {
        if (matrix == null)
            return null;
        
            Integer[] result = new Integer [matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for(int num: matrix[i])
                    sum += num;

                result[i] = sum;
            }
            
            return result;
    }

    public static Integer[] sumRows2(Integer[][] matrix) {
        if (matrix == null)
            return null;

            Integer[] result = new Integer [matrix.length];
            for(int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for(int j = 0; j < matrix[i].length; j++)
                if(matrix[i][j] != null)
                sum += matrix[i][j];

                result[i] = sum;
            }

            return result;
    }
}

