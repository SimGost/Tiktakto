public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    public static void main(String[] args) {
        boolean flag = true;
        Board board = new Board();

        
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        int counter = 0;
        int symbol;

        while (flag){
            System.out.println(board);
            // set turn
            symbol = 1;
            if(counter % 2 != 0)
                symbol = 2;

            counter++;

            String row = player1.getUserInput(1); // get row from user 
            String col = player1.getUserInput(2); // get col from user
            
            int rowInt = Integer.parseInt(row);
            int colInt = Integer.parseInt(col);
            board.setCoordinate(rowInt,colInt,symbol);
        }
        board.setCoordinate(1,1,1);
        System.out.println(board);


        
    }
}
