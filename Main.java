import java.util.*;

class Main{
    public static void solveSudoku(char[][] board) {
        check(board);
    }
    public static boolean check(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isOkay(board,i,j,c)){
                            board[i][j]=c;
                            if(check(board)){
                                return true;
                            }
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isOkay(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c) return false;
            if(board[i][col]==c) return false;
        }
        int br=(row/3)*3;
        int bc=(col/3)*3;
        for(int i=br;i<br+3;i++){
            for(int j=bc;j<bc+3;j++){
                if(board[i][j]==c) return false;
            }
        }
        return true;
    }

    public static void Main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[][] board=new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=sc.nextLine().charAt(0);
            }
        }
        sc.close();
        solveSudoku(board);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
}