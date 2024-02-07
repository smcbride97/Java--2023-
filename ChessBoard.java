public class ChessBoard {
    public static void main (String args []) {

        //Chess board
        int n = 8;
        String row;

        for (int i = 0; i < n; i++) {
            row = "";
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) { //even row
                    if (j % 2 == 0)
                        row += " ";
                    else 
                        row += "#";
                } else { //odd row
                    if (j % 2 == 0)
                        row += "#";
                    else 
                        row += " ";
                }  
            }
            System.out.println(row);      
        }
    }
}
