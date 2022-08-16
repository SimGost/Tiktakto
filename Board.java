
public class Board {
    private int[][] board;


    public Board(){
        this.board = new int[4][4];
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                this.board[i][j] = 0;           
            }
        
    }
}

    public void setCoordinate(int x, int y, int value) {
        this.board[x][y] = value;
    }





    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                sb.append("[");
                switch(this.board[i][j]){
                    case 0: sb.append(" ");
                            break;
                    case 1: sb.append("X");
                            break;
                    case 2: sb.append("O");
                            break;
                }

                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }



}