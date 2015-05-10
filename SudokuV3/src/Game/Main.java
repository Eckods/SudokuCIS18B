

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
         
        //test print
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
    }

}
