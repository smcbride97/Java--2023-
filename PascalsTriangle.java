public class PascalsTriangle {
    public static void main(String[] args) {
        int[][] triangle = generateTriangle(8);
        draw(triangle);
    }

    public static int[][] generateTriangle(int n) {
        int [][] triangle = new int[n][];

        for(int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; 
            triangle[i][i] = 1;

            for(int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }

    public static void draw(int[][] triangle) {
        //print out triangle
        for(int i = 0; i < triangle.length; i++) {
            for(int k = triangle.length - i; k > 1; k--)
                System.out.print(" ");
            for(int j = 0; j < triangle[i].length; j++)
                System.out.print(triangle[i][j] + " ");
            System.out.println();
        }        
    }
}
