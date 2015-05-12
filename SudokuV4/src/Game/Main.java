

package Game;


public class Main {
    public static void main(String[] args) {
        generateGameBoard();
    }
    
    public static void generateGameBoard(){
        int sudokuCompletePuzzle [][];
        sudokuCompletePuzzle = new int [9][9];
         sudokuCode puzzleGenerator = new sudokuCode();
         sudokuCompletePuzzle=puzzleGenerator.sudoku(sudokuCompletePuzzle);
        
        //test print of completed sudoku game board
         for(int r=0;r<9;r++){
                if(r==0){
                    for(int i=0;i<25;i++){
                            System.out.print("-");
                       }
                }
                for(int i=0;i<9;i++){
                    System.out.print("");
                }
                System.out.println();
                for(int c=0;c<9;c++){
                    if(c==0){
                        System.out.print("|");
                    }
                    if(sudokuCompletePuzzle[r][c] != 0){
                        System.out.print(" "+sudokuCompletePuzzle[r][c]);
                    }else{
                        System.out.print("  ");
                    }
                    if((c+1)%3==0){
                        System.out.print(" |");
                }
                }
                if((r+1)%3==0){
                    System.out.print("\n");
                    for(int i=0;i<25;i++){
                        System.out.print("-");
                    }
                }
                
            }
         System.out.println("\n");
         //test making random board template
         int rNumber ;
         int sudokuUserPuzzle [][];
           sudokuUserPuzzle = new int [9][9];
        
           for(int column = 0; column <9;column++){
               for(int row =0; row < 9;row++){
                   rNumber = (int)(2*Math.random());
                   sudokuUserPuzzle [column][row]=rNumber;
               }
           }
           for(int r=0;r<9;r++){
                if(r==0){
                    for(int i=0;i<25;i++){
                            System.out.print("-");
                       }
                }
                for(int i=0;i<9;i++){
                    System.out.print("");
                }
                System.out.println();
                for(int c=0;c<9;c++){
                    if(c==0){
                        System.out.print("|");
                    }
                    if(sudokuUserPuzzle[r][c] != 0){
                        System.out.print(" "+sudokuUserPuzzle[r][c]);
                    }else{
                        System.out.print("  ");
                    }
                    if((c+1)%3==0){
                        System.out.print(" |");
                }
                }
                if((r+1)%3==0){
                    System.out.print("\n");
                    for(int i=0;i<25;i++){
                        System.out.print("-");
                    }
                }
                
            }
           System.out.println("\n");
           //test combining template and completed sudoku board to make users view of game
           for(int column = 0; column <9;column++){
               for(int row =0; row < 9;row++){
                   if(sudokuUserPuzzle[column][row]!=0){
                       sudokuUserPuzzle[column][row] = sudokuCompletePuzzle[column][row];
                   }else{
                       sudokuUserPuzzle[column][row] = 0;
                   }
               }
           }
           for(int r=0;r<9;r++){
                if(r==0){
                    for(int i=0;i<25;i++){
                            System.out.print("-");
                       }
                }
                for(int i=0;i<9;i++){
                    System.out.print("");
                }
                System.out.println();
                for(int c=0;c<9;c++){
                    if(c==0){
                        System.out.print("|");
                    }
                    if(sudokuUserPuzzle[r][c] != 0){
                        System.out.print(" "+sudokuUserPuzzle[r][c]);
                    }else{
                        System.out.print("  ");
                    }
                    if((c+1)%3==0){
                        System.out.print(" |");
                }
                }
                if((r+1)%3==0){
                    System.out.print("\n");
                    for(int i=0;i<25;i++){
                        System.out.print("-");
                    }
                }
    }

    }
}
