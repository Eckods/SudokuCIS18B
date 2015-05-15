

package Game;


public class SudokuCode{
    public int[][] sudoku(int[][] sudoku){
        int w=0; // controls while loop for sudoku
        sudoku=new int[9][9];    //Making a two dimensional array to store Sudoku
        int rNumber;    //rNumber to hold random numbers
        while(w!=1){
            for(int r=0;r<9;r++){ //resets sudoku array to 0s
                for(int t=0;t<9;t++){
                    sudoku[r][t]=0;
                }
            }
            for(int j=0;j<1;j++){
                rNumber=(int)(9*Math.random()+1);
                sudoku[0][0]=rNumber;    //Generates random number for first slot first row
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for second slot first row
                    sudoku[0][1]=rNumber;
                    if(sudoku[0][1]!=sudoku[0][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[0][1]==sudoku[0][0]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for third slot first row
                    sudoku[0][2]=rNumber;
                    if(sudoku[0][2]!=sudoku[0][0]&&
                       sudoku[0][2]!=sudoku[0][1]){//if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[0][2]==sudoku[0][0]||
                   sudoku[0][2]==sudoku[0][1]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot first row
                    sudoku[0][3]=rNumber;
                    if(sudoku[0][3]!=sudoku[0][0]&&
                       sudoku[0][3]!=sudoku[0][1]&&
                       sudoku[0][3]!=sudoku[0][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[0][3]==sudoku[0][0]||
                   sudoku[0][3]==sudoku[0][1]||
                   sudoku[0][3]==sudoku[0][2]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot first row
                    sudoku[0][4]=rNumber;
                    if(sudoku[0][4]!=sudoku[0][0]&&
                       sudoku[0][4]!=sudoku[0][1]&&
                       sudoku[0][4]!=sudoku[0][2]&&
                       sudoku[0][4]!=sudoku[0][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                    }
                }
                if(sudoku[0][4]==sudoku[0][0]||
                   sudoku[0][4]==sudoku[0][1]||
                   sudoku[0][4]==sudoku[0][2]||
                   sudoku[0][4]==sudoku[0][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot first row
                    sudoku[0][5]=rNumber;
                    if(sudoku[0][5]!=sudoku[0][0]&&
                       sudoku[0][5]!=sudoku[0][1]&&
                       sudoku[0][5]!=sudoku[0][2]&&
                       sudoku[0][5]!=sudoku[0][3]&&
                       sudoku[0][5]!=sudoku[0][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[0][5]==sudoku[0][0]||
                   sudoku[0][5]==sudoku[0][1]||
                   sudoku[0][5]==sudoku[0][2]||
                   sudoku[0][5]==sudoku[0][3]||
                   sudoku[0][5]==sudoku[0][4]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot first row
                    sudoku[0][6]=rNumber;
                    if(sudoku[0][6]!=sudoku[0][0]&&
                       sudoku[0][6]!=sudoku[0][1]&&
                       sudoku[0][6]!=sudoku[0][2]&&
                       sudoku[0][6]!=sudoku[0][3]&&
                       sudoku[0][6]!=sudoku[0][4]&&
                       sudoku[0][6]!=sudoku[0][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[0][6]==sudoku[0][0]||
                   sudoku[0][6]==sudoku[0][1]||
                   sudoku[0][6]==sudoku[0][2]||
                   sudoku[0][6]==sudoku[0][3]||
                   sudoku[0][6]==sudoku[0][4]||
                   sudoku[0][6]==sudoku[0][5]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot first row
                    sudoku[0][7]=rNumber;
                    if(sudoku[0][7]!=sudoku[0][0]&&
                       sudoku[0][7]!=sudoku[0][1]&&
                       sudoku[0][7]!=sudoku[0][2]&&
                       sudoku[0][7]!=sudoku[0][3]&&
                       sudoku[0][7]!=sudoku[0][4]&&
                       sudoku[0][7]!=sudoku[0][5]&&
                       sudoku[0][7]!=sudoku[0][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[0][7]==sudoku[0][0]||
                   sudoku[0][7]==sudoku[0][1]||
                   sudoku[0][7]==sudoku[0][2]||
                   sudoku[0][7]==sudoku[0][3]||
                   sudoku[0][7]==sudoku[0][4]||
                   sudoku[0][7]==sudoku[0][5]||
                   sudoku[0][7]==sudoku[0][6]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot first row
                    sudoku[0][8]=rNumber;
                    if(sudoku[0][8]!=sudoku[0][0]&&
                       sudoku[0][8]!=sudoku[0][1]&&
                       sudoku[0][8]!=sudoku[0][2]&&
                       sudoku[0][8]!=sudoku[0][3]&&
                       sudoku[0][8]!=sudoku[0][4]&&
                       sudoku[0][8]!=sudoku[0][5]&&
                       sudoku[0][8]!=sudoku[0][6]&&
                       sudoku[0][8]!=sudoku[0][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[0][8]==sudoku[0][0]||
                   sudoku[0][8]==sudoku[0][1]||
                   sudoku[0][8]==sudoku[0][2]||
                   sudoku[0][8]==sudoku[0][3]||
                   sudoku[0][8]==sudoku[0][4]||
                   sudoku[0][8]==sudoku[0][5]||
                   sudoku[0][8]==sudoku[0][6]||
                   sudoku[0][8]==sudoku[0][7]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for first slot second row
                    sudoku[1][0]=rNumber;
                    if(sudoku[1][0]!=sudoku[0][0]&&
                       sudoku[1][0]!=sudoku[0][1]&&
                       sudoku[1][0]!=sudoku[0][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][0]==sudoku[0][0]||
                   sudoku[1][0]==sudoku[0][1]||
                   sudoku[1][0]==sudoku[0][2]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for second slot second row
                    sudoku[1][1]=rNumber;
                    if(sudoku[1][1]!=sudoku[0][0]&&
                       sudoku[1][1]!=sudoku[0][1]&&
                       sudoku[1][1]!=sudoku[0][2]&&
                       sudoku[1][1]!=sudoku[1][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][1]==sudoku[0][0]||
                   sudoku[1][1]==sudoku[0][1]||
                   sudoku[1][1]==sudoku[0][2]||
                   sudoku[1][1]==sudoku[1][0]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for third slot second row
                    sudoku[1][2]=rNumber;
                    if(sudoku[1][2]!=sudoku[0][0]&&
                       sudoku[1][2]!=sudoku[0][1]&&
                       sudoku[1][2]!=sudoku[0][2]&&
                       sudoku[1][2]!=sudoku[1][0]&&
                       sudoku[1][2]!=sudoku[1][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][2]==sudoku[0][0]||
                   sudoku[1][2]==sudoku[0][1]||
                   sudoku[1][2]==sudoku[0][2]||
                   sudoku[1][2]==sudoku[1][0]||
                   sudoku[1][2]==sudoku[1][1]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot second row
                    sudoku[1][3]=rNumber;
                    if(sudoku[1][3]!=sudoku[0][3]&&
                       sudoku[1][3]!=sudoku[0][4]&&
                       sudoku[1][3]!=sudoku[0][5]&&
                       sudoku[1][3]!=sudoku[1][0]&&
                       sudoku[1][3]!=sudoku[1][1]&&
                       sudoku[1][3]!=sudoku[1][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][3]==sudoku[0][3]||
                   sudoku[1][3]==sudoku[0][4]||
                   sudoku[1][3]==sudoku[0][5]||
                   sudoku[1][3]==sudoku[1][0]||
                   sudoku[1][3]==sudoku[1][1]||
                   sudoku[1][3]==sudoku[1][2]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot second row
                    sudoku[1][4]=rNumber;
                    if(sudoku[1][4]!=sudoku[0][3]&&
                       sudoku[1][4]!=sudoku[0][4]&&
                       sudoku[1][4]!=sudoku[0][5]&&
                       sudoku[1][4]!=sudoku[1][0]&&
                       sudoku[1][4]!=sudoku[1][1]&&
                       sudoku[1][4]!=sudoku[1][2]&&
                       sudoku[1][4]!=sudoku[1][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][4]==sudoku[0][3]||
                   sudoku[1][4]==sudoku[0][4]||
                   sudoku[1][4]==sudoku[0][5]||
                   sudoku[1][4]==sudoku[1][0]||
                   sudoku[1][4]==sudoku[1][1]||
                   sudoku[1][4]==sudoku[1][2]||
                   sudoku[1][4]==sudoku[1][3]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot second row
                    sudoku[1][5]=rNumber;
                    if(sudoku[1][5]!=sudoku[0][3]&&
                       sudoku[1][5]!=sudoku[0][4]&&
                       sudoku[1][5]!=sudoku[0][5]&&
                       sudoku[1][5]!=sudoku[1][0]&&
                       sudoku[1][5]!=sudoku[1][1]&&
                       sudoku[1][5]!=sudoku[1][2]&&
                       sudoku[1][5]!=sudoku[1][3]&&
                       sudoku[1][5]!=sudoku[1][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][5]==sudoku[0][3]||
                   sudoku[1][5]==sudoku[0][4]||
                   sudoku[1][5]==sudoku[0][5]||
                   sudoku[1][5]==sudoku[1][0]||
                   sudoku[1][5]==sudoku[1][1]||
                   sudoku[1][5]==sudoku[1][2]||
                   sudoku[1][5]==sudoku[1][3]||
                   sudoku[1][5]==sudoku[1][4]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot second row
                    sudoku[1][6]=rNumber;
                    if(sudoku[1][6]!=sudoku[0][6]&&
                       sudoku[1][6]!=sudoku[0][7]&&
                       sudoku[1][6]!=sudoku[0][8]&&
                       sudoku[1][6]!=sudoku[1][0]&&
                       sudoku[1][6]!=sudoku[1][1]&&
                       sudoku[1][6]!=sudoku[1][2]&&
                       sudoku[1][6]!=sudoku[1][3]&&
                       sudoku[1][6]!=sudoku[1][4]&&
                       sudoku[1][6]!=sudoku[1][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][6]==sudoku[0][6]||
                   sudoku[1][6]==sudoku[0][7]||
                   sudoku[1][6]==sudoku[0][8]||
                   sudoku[1][6]==sudoku[1][0]||
                   sudoku[1][6]==sudoku[1][1]||
                   sudoku[1][6]==sudoku[1][2]||
                   sudoku[1][6]==sudoku[1][3]||
                   sudoku[1][6]==sudoku[1][4]||
                   sudoku[1][6]==sudoku[1][5]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot second row
                    sudoku[1][7]=rNumber;
                    if(sudoku[1][7]!=sudoku[0][6]&&
                       sudoku[1][7]!=sudoku[0][7]&&
                       sudoku[1][7]!=sudoku[0][8]&&
                       sudoku[1][7]!=sudoku[1][0]&&
                       sudoku[1][7]!=sudoku[1][1]&&
                       sudoku[1][7]!=sudoku[1][2]&&
                       sudoku[1][7]!=sudoku[1][3]&&
                       sudoku[1][7]!=sudoku[1][4]&&
                       sudoku[1][7]!=sudoku[1][5]&&
                       sudoku[1][7]!=sudoku[1][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][7]==sudoku[0][6]||
                   sudoku[1][7]==sudoku[0][7]||
                   sudoku[1][7]==sudoku[0][8]||
                   sudoku[1][7]==sudoku[1][0]||
                   sudoku[1][7]==sudoku[1][1]||
                   sudoku[1][7]==sudoku[1][2]||
                   sudoku[1][7]==sudoku[1][3]||
                   sudoku[1][7]==sudoku[1][4]||
                   sudoku[1][7]==sudoku[1][5]||
                   sudoku[1][7]==sudoku[1][6]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot second row
                    sudoku[1][8]=rNumber;
                    if(sudoku[1][8]!=sudoku[0][6]&&
                       sudoku[1][8]!=sudoku[0][7]&&
                       sudoku[1][8]!=sudoku[0][8]&&
                       sudoku[1][8]!=sudoku[1][0]&&
                       sudoku[1][8]!=sudoku[1][1]&&
                       sudoku[1][8]!=sudoku[1][2]&&
                       sudoku[1][8]!=sudoku[1][3]&&
                       sudoku[1][8]!=sudoku[1][4]&&
                       sudoku[1][8]!=sudoku[1][5]&&
                       sudoku[1][8]!=sudoku[1][6]&&
                       sudoku[1][8]!=sudoku[1][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[1][8]==sudoku[0][6]||
                   sudoku[1][8]==sudoku[0][7]||
                   sudoku[1][8]==sudoku[0][8]||
                   sudoku[1][8]==sudoku[1][0]||
                   sudoku[1][8]==sudoku[1][1]||
                   sudoku[1][8]==sudoku[1][2]||
                   sudoku[1][8]==sudoku[1][3]||
                   sudoku[1][8]==sudoku[1][4]||
                   sudoku[1][8]==sudoku[1][5]||
                   sudoku[1][8]==sudoku[1][6]||
                   sudoku[1][8]==sudoku[1][7]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for first slot third row
                    sudoku[2][0]=rNumber;
                    if(sudoku[2][0]!=sudoku[0][0]&&
                       sudoku[2][0]!=sudoku[0][1]&&
                       sudoku[2][0]!=sudoku[0][2]&&
                       sudoku[2][0]!=sudoku[1][0]&&
                       sudoku[2][0]!=sudoku[1][1]&&
                       sudoku[2][0]!=sudoku[1][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[2][0]==sudoku[0][0]||
                   sudoku[2][0]==sudoku[0][1]||
                   sudoku[2][0]==sudoku[0][2]||
                   sudoku[2][0]==sudoku[1][0]||
                   sudoku[2][0]==sudoku[1][1]||
                   sudoku[2][0]==sudoku[1][2]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for second slot third row
                    sudoku[2][1]=rNumber;
                    if(sudoku[2][1]!=sudoku[0][0]&&
                       sudoku[2][1]!=sudoku[0][1]&&
                       sudoku[2][1]!=sudoku[0][2]&&
                       sudoku[2][1]!=sudoku[1][0]&&
                       sudoku[2][1]!=sudoku[1][1]&&
                       sudoku[2][1]!=sudoku[1][2]&&
                       sudoku[2][1]!=sudoku[2][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[2][1]==sudoku[0][0]||
                   sudoku[2][1]==sudoku[0][1]||
                   sudoku[2][1]==sudoku[0][2]||
                   sudoku[2][1]==sudoku[1][0]||
                   sudoku[2][1]==sudoku[1][1]||
                   sudoku[2][1]==sudoku[1][2]||
                   sudoku[2][1]==sudoku[2][0]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                    rNumber=(int)(9*Math.random()+1); //Generates random number for third slot third row
                    sudoku[2][2]=rNumber;
                    if(sudoku[2][2]!=sudoku[0][0]&&
                       sudoku[2][2]!=sudoku[0][1]&&
                       sudoku[2][2]!=sudoku[0][2]&&
                       sudoku[2][2]!=sudoku[1][0]&&
                       sudoku[2][2]!=sudoku[1][1]&&
                       sudoku[2][2]!=sudoku[1][2]&&
                       sudoku[2][2]!=sudoku[2][0]&&
                       sudoku[2][2]!=sudoku[2][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                        break;
                    }
                }
                if(sudoku[2][2]==sudoku[0][0]||
                   sudoku[2][2]==sudoku[0][1]||
                   sudoku[2][2]==sudoku[0][2]||
                   sudoku[2][2]==sudoku[1][0]||
                   sudoku[2][2]==sudoku[1][1]||
                   sudoku[2][2]==sudoku[1][2]||
                   sudoku[2][2]==sudoku[2][0]||
                   sudoku[2][2]==sudoku[2][1]){
                        break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot third row
                   sudoku[2][3]=rNumber;
                   if(sudoku[2][3]!=sudoku[0][3]&&
                      sudoku[2][3]!=sudoku[0][4]&&
                      sudoku[2][3]!=sudoku[0][5]&&
                      sudoku[2][3]!=sudoku[1][3]&&
                      sudoku[2][3]!=sudoku[1][4]&&
                      sudoku[2][3]!=sudoku[1][5]&&
                      sudoku[2][3]!=sudoku[2][0]&&
                      sudoku[2][3]!=sudoku[2][1]&&
                      sudoku[2][3]!=sudoku[2][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[2][3]==sudoku[0][3]||
                   sudoku[2][3]==sudoku[0][4]||
                   sudoku[2][3]==sudoku[0][5]||
                   sudoku[2][3]==sudoku[1][3]||
                   sudoku[2][3]==sudoku[1][4]||
                   sudoku[2][3]==sudoku[1][5]||
                   sudoku[2][3]==sudoku[2][0]||
                   sudoku[2][3]==sudoku[2][1]||
                   sudoku[2][3]==sudoku[2][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot third row
                   sudoku[2][4]=rNumber;
                   if(sudoku[2][4]!=sudoku[0][3]&&
                      sudoku[2][4]!=sudoku[0][4]&&
                      sudoku[2][4]!=sudoku[0][5]&&
                      sudoku[2][4]!=sudoku[1][3]&&
                      sudoku[2][4]!=sudoku[1][4]&&
                      sudoku[2][4]!=sudoku[1][5]&&
                      sudoku[2][4]!=sudoku[2][0]&&
                      sudoku[2][4]!=sudoku[2][1]&&
                      sudoku[2][4]!=sudoku[2][2]&&
                      sudoku[2][4]!=sudoku[2][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[2][4] == sudoku[0][3]||
                   sudoku[2][4] == sudoku[0][4]||
                   sudoku[2][4] == sudoku[0][5]||
                   sudoku[2][4] == sudoku[1][3]||
                   sudoku[2][4] == sudoku[1][4]||
                   sudoku[2][4] == sudoku[1][5]||
                   sudoku[2][4] == sudoku[2][0]||
                   sudoku[2][4] == sudoku[2][1]||
                   sudoku[2][4] == sudoku[2][2]||
                   sudoku[2][4] == sudoku[2][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot third row
                   sudoku[2][5]=rNumber;
                   if(sudoku[2][5]!=sudoku[0][3]&&
                      sudoku[2][5]!=sudoku[0][4]&&
                      sudoku[2][5]!=sudoku[0][5]&&
                      sudoku[2][5]!=sudoku[1][3]&&
                      sudoku[2][5]!=sudoku[1][4]&&
                      sudoku[2][5]!=sudoku[1][5]&&
                      sudoku[2][5]!=sudoku[2][0]&&
                      sudoku[2][5]!=sudoku[2][1]&&
                      sudoku[2][5]!=sudoku[2][2]&&
                      sudoku[2][5]!=sudoku[2][3]&&
                      sudoku[2][5]!=sudoku[2][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[2][5]==sudoku[0][3]||
                   sudoku[2][5]==sudoku[0][4]||
                   sudoku[2][5]==sudoku[0][5]||
                   sudoku[2][5]==sudoku[1][3]||
                   sudoku[2][5]==sudoku[1][4]||
                   sudoku[2][5]==sudoku[1][5]||
                   sudoku[2][5]==sudoku[2][0]||
                   sudoku[2][5]==sudoku[2][1]||
                   sudoku[2][5]==sudoku[2][2]||
                   sudoku[2][5]==sudoku[2][3]||
                   sudoku[2][5]==sudoku[2][4]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot third row
                   sudoku[2][6]=rNumber;
                   if(sudoku[2][6]!=sudoku[0][6]&&
                      sudoku[2][6]!=sudoku[0][7]&&
                      sudoku[2][6]!=sudoku[0][8]&&
                      sudoku[2][6]!=sudoku[1][6]&&
                      sudoku[2][6]!=sudoku[1][7]&&
                      sudoku[2][6]!=sudoku[1][8]&&
                      sudoku[2][6]!=sudoku[2][0]&&
                      sudoku[2][6]!=sudoku[2][1]&&
                      sudoku[2][6]!=sudoku[2][2]&&
                      sudoku[2][6]!=sudoku[2][3]&&
                      sudoku[2][6]!=sudoku[2][4]&&
                      sudoku[2][6]!=sudoku[2][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[2][6]==sudoku[0][6]||
                   sudoku[2][6]==sudoku[0][7]||
                   sudoku[2][6]==sudoku[0][8]||
                   sudoku[2][6]==sudoku[1][6]||
                   sudoku[2][6]==sudoku[1][7]||
                   sudoku[2][6]==sudoku[1][8]||
                   sudoku[2][6]==sudoku[2][0]||
                   sudoku[2][6]==sudoku[2][1]||
                   sudoku[2][6]==sudoku[2][2]||
                   sudoku[2][6]==sudoku[2][3]||
                   sudoku[2][6]==sudoku[2][4]||
                   sudoku[2][6]==sudoku[2][5]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot third row
                   sudoku[2][7]=rNumber;
                   if(sudoku[2][7]!=sudoku[0][6]&&
                      sudoku[2][7]!=sudoku[0][7]&&
                      sudoku[2][7]!=sudoku[0][8]&&
                      sudoku[2][7]!=sudoku[1][6]&&
                      sudoku[2][7]!=sudoku[1][7]&&
                      sudoku[2][7]!=sudoku[1][8]&&
                      sudoku[2][7]!=sudoku[2][0]&&
                      sudoku[2][7]!=sudoku[2][1]&&
                      sudoku[2][7]!=sudoku[2][2]&&
                      sudoku[2][7]!=sudoku[2][3]&&
                      sudoku[2][7]!=sudoku[2][4]&&
                      sudoku[2][7]!=sudoku[2][5]&&
                      sudoku[2][7]!=sudoku[2][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[2][7]==sudoku[0][6]||
                   sudoku[2][7]==sudoku[0][7]||
                   sudoku[2][7]==sudoku[0][8]||
                   sudoku[2][7]==sudoku[1][6]||
                   sudoku[2][7]==sudoku[1][7]||
                   sudoku[2][7]==sudoku[1][8]||
                   sudoku[2][7]==sudoku[2][0]||
                   sudoku[2][7]==sudoku[2][1]||
                   sudoku[2][7]==sudoku[2][2]||
                   sudoku[2][7]==sudoku[2][3]||
                   sudoku[2][7]==sudoku[2][4]||
                   sudoku[2][7]==sudoku[2][5]||
                   sudoku[2][7]==sudoku[2][6]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot third row
                   sudoku[2][8]=rNumber;
                   if(sudoku[2][8]!=sudoku[0][6]&&
                      sudoku[2][8]!=sudoku[0][7]&&
                      sudoku[2][8]!=sudoku[0][8]&&
                      sudoku[2][8]!=sudoku[1][6]&&
                      sudoku[2][8]!=sudoku[1][7]&&
                      sudoku[2][8]!=sudoku[1][8]&&
                      sudoku[2][8]!=sudoku[2][0]&&
                      sudoku[2][8]!=sudoku[2][1]&&
                      sudoku[2][8]!=sudoku[2][2]&&
                      sudoku[2][8]!=sudoku[2][3]&&
                      sudoku[2][8]!=sudoku[2][4]&&
                      sudoku[2][8]!=sudoku[2][5]&&
                      sudoku[2][8]!=sudoku[2][6]&&
                      sudoku[2][8]!=sudoku[2][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[2][8]==sudoku[0][6]||
                   sudoku[2][8]==sudoku[0][7]||
                   sudoku[2][8]==sudoku[0][8]||
                   sudoku[2][8]==sudoku[1][6]||
                   sudoku[2][8]==sudoku[1][7]||
                   sudoku[2][8]==sudoku[1][8]||
                   sudoku[2][8]==sudoku[2][0]||
                   sudoku[2][8]==sudoku[2][1]||
                   sudoku[2][8]==sudoku[2][2]||
                   sudoku[2][8]==sudoku[2][3]||
                   sudoku[2][8]==sudoku[2][4]||
                   sudoku[2][8]==sudoku[2][5]||
                   sudoku[2][8]==sudoku[2][6]||
                   sudoku[2][8]==sudoku[2][7]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for first slot fourth row
                   sudoku[3][0]=rNumber;
                   if(sudoku[3][0]!=sudoku[0][0]&&
                      sudoku[3][0]!=sudoku[1][0]&&
                      sudoku[3][0]!=sudoku[2][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][0]==sudoku[0][0]||
                   sudoku[3][0]==sudoku[1][0]||
                   sudoku[3][0]==sudoku[2][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for second slot fourth row
                   sudoku[3][1]=rNumber;
                   if(sudoku[3][1]!=sudoku[0][1]&&
                      sudoku[3][1]!=sudoku[1][1]&&
                      sudoku[3][1]!=sudoku[2][1]&&
                      sudoku[3][1]!=sudoku[3][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][1]==sudoku[0][1]||
                   sudoku[3][1]==sudoku[1][1]||
                   sudoku[3][1]==sudoku[2][1]||
                   sudoku[3][1]==sudoku[3][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for third slot fourth row
                   sudoku[3][2]=rNumber;
                   if(sudoku[3][2]!=sudoku[0][2]&&
                      sudoku[3][2]!=sudoku[1][2]&&
                      sudoku[3][2]!=sudoku[2][2]&&
                      sudoku[3][2]!=sudoku[3][0]&&
                      sudoku[3][2]!=sudoku[3][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][2]==sudoku[0][2]||
                   sudoku[3][2]==sudoku[1][2]||
                   sudoku[3][2]==sudoku[2][2]||
                   sudoku[3][2]==sudoku[3][0]||
                   sudoku[3][2]==sudoku[3][1]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot fourth row
                   sudoku[3][3]=rNumber;
                   if(sudoku[3][3]!=sudoku[0][3]&&
                      sudoku[3][3]!=sudoku[1][3]&&
                      sudoku[3][3]!=sudoku[2][3]&&
                      sudoku[3][3]!=sudoku[3][0]&&
                      sudoku[3][3]!=sudoku[3][1]&&
                      sudoku[3][3]!=sudoku[3][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][3]==sudoku[0][3]||
                   sudoku[3][3]==sudoku[1][3]||
                   sudoku[3][3]==sudoku[2][3]||
                   sudoku[3][3]==sudoku[3][0]||
                   sudoku[3][3]==sudoku[3][1]||
                   sudoku[3][3]==sudoku[3][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot fourth row
                   sudoku[3][4]=rNumber;
                   if(sudoku[3][4]!=sudoku[0][4]&&
                      sudoku[3][4]!=sudoku[1][4]&&
                      sudoku[3][4]!=sudoku[2][4]&&
                      sudoku[3][4]!=sudoku[3][0]&&
                      sudoku[3][4]!=sudoku[3][1]&&
                      sudoku[3][4]!=sudoku[3][2]&&
                      sudoku[3][4]!=sudoku[3][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][4]==sudoku[0][4]||
                   sudoku[3][4]==sudoku[1][4]||
                   sudoku[3][4]==sudoku[2][4]||
                   sudoku[3][4]==sudoku[3][0]||
                   sudoku[3][4]==sudoku[3][1]||
                   sudoku[3][4]==sudoku[3][2]||
                   sudoku[3][4]==sudoku[3][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot fourth row
                   sudoku[3][5]=rNumber;
                   if(sudoku[3][5]!=sudoku[0][5]&&
                      sudoku[3][5]!=sudoku[1][5]&&
                      sudoku[3][5]!=sudoku[2][5]&&
                      sudoku[3][5]!=sudoku[3][0]&&
                      sudoku[3][5]!=sudoku[3][1]&&
                      sudoku[3][5]!=sudoku[3][2]&&
                      sudoku[3][5]!=sudoku[3][3]&&
                      sudoku[3][5]!=sudoku[3][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][5]==sudoku[0][5]||
                   sudoku[3][5]==sudoku[1][5]||
                   sudoku[3][5]==sudoku[2][5]||
                   sudoku[3][5]==sudoku[3][0]||
                   sudoku[3][5]==sudoku[3][1]||
                   sudoku[3][5]==sudoku[3][2]||
                   sudoku[3][5]==sudoku[3][3]||
                   sudoku[3][5]==sudoku[3][4]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot fourth row
                   sudoku[3][6]=rNumber;
                   if(sudoku[3][6]!=sudoku[0][6]&&
                      sudoku[3][6]!=sudoku[1][6]&&
                      sudoku[3][6]!=sudoku[2][6]&&
                      sudoku[3][6]!=sudoku[3][0]&&
                      sudoku[3][6]!=sudoku[3][1]&&
                      sudoku[3][6]!=sudoku[3][2]&&
                      sudoku[3][6]!=sudoku[3][3]&&
                      sudoku[3][6]!=sudoku[3][4]&&
                      sudoku[3][6]!=sudoku[3][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][6]==sudoku[0][6]||
                   sudoku[3][6]==sudoku[1][6]||
                   sudoku[3][6]==sudoku[2][6]||
                   sudoku[3][6]==sudoku[3][0]||
                   sudoku[3][6]==sudoku[3][1]||
                   sudoku[3][6]==sudoku[3][2]||
                   sudoku[3][6]==sudoku[3][3]||
                   sudoku[3][6]==sudoku[3][4]||
                   sudoku[3][6]==sudoku[3][5]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot fourth row
                   sudoku[3][7]=rNumber;
                   if(sudoku[3][7]!=sudoku[0][7]&&
                      sudoku[3][7]!=sudoku[1][7]&&
                      sudoku[3][7]!=sudoku[2][7]&&
                      sudoku[3][7]!=sudoku[3][0]&&
                      sudoku[3][7]!=sudoku[3][1]&&
                      sudoku[3][7]!=sudoku[3][2]&&
                      sudoku[3][7]!=sudoku[3][3]&&
                      sudoku[3][7]!=sudoku[3][4]&&
                      sudoku[3][7]!=sudoku[3][5]&&
                      sudoku[3][7]!=sudoku[3][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][7]==sudoku[0][7]||
                   sudoku[3][7]==sudoku[1][7]||
                   sudoku[3][7]==sudoku[2][7]||
                   sudoku[3][7]==sudoku[3][0]||
                   sudoku[3][7]==sudoku[3][1]||
                   sudoku[3][7]==sudoku[3][2]||
                   sudoku[3][7]==sudoku[3][3]||
                   sudoku[3][7]==sudoku[3][4]||
                   sudoku[3][7]==sudoku[3][5]||
                   sudoku[3][7]==sudoku[3][6]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot fourth row
                   sudoku[3][8]=rNumber;
                   if(sudoku[3][8]!=sudoku[0][8]&&
                      sudoku[3][8]!=sudoku[1][8]&&
                      sudoku[3][8]!=sudoku[2][8]&&
                      sudoku[3][8]!=sudoku[3][0]&&
                      sudoku[3][8]!=sudoku[3][1]&&
                      sudoku[3][8]!=sudoku[3][2]&&
                      sudoku[3][8]!=sudoku[3][3]&&
                      sudoku[3][8]!=sudoku[3][4]&&
                      sudoku[3][8]!=sudoku[3][5]&&
                      sudoku[3][8]!=sudoku[3][6]&&
                      sudoku[3][8]!=sudoku[3][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[3][8]==sudoku[0][8]||
                   sudoku[3][8]==sudoku[1][8]||
                   sudoku[3][8]==sudoku[2][8]||
                   sudoku[3][8]==sudoku[3][0]||
                   sudoku[3][8]==sudoku[3][1]||
                   sudoku[3][8]==sudoku[3][2]||
                   sudoku[3][8]==sudoku[3][3]||
                   sudoku[3][8]==sudoku[3][4]||
                   sudoku[3][8]==sudoku[3][5]||
                   sudoku[3][8]==sudoku[3][6]||
                   sudoku[3][8]==sudoku[3][7]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for first slot fifth row
                   sudoku[4][0]=rNumber;
                   if(sudoku[4][0]!=sudoku[0][0]&&
                      sudoku[4][0]!=sudoku[1][0]&&
                      sudoku[4][0]!=sudoku[2][0]&&
                      sudoku[4][0]!=sudoku[3][0]&&
                      sudoku[4][0]!=sudoku[3][1]&&
                      sudoku[4][0]!=sudoku[3][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][0]==sudoku[0][0]||
                   sudoku[4][0]==sudoku[1][0]||
                   sudoku[4][0]==sudoku[2][0]||
                   sudoku[4][0]==sudoku[3][0]||
                   sudoku[4][0]==sudoku[3][1]||
                   sudoku[4][0]==sudoku[3][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for second slot fifth row
                   sudoku[4][1]=rNumber;
                   if(sudoku[4][1]!=sudoku[0][1]&&
                      sudoku[4][1]!=sudoku[1][1]&&
                      sudoku[4][1]!=sudoku[2][1]&&
                      sudoku[4][1]!=sudoku[3][0]&&
                      sudoku[4][1]!=sudoku[3][1]&&
                      sudoku[4][1]!=sudoku[3][2]&&
                      sudoku[4][1]!=sudoku[4][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][1]==sudoku[0][1]||
                   sudoku[4][1]==sudoku[1][1]||
                   sudoku[4][1]==sudoku[2][1]||
                   sudoku[4][1]==sudoku[3][0]||
                   sudoku[4][1]==sudoku[3][1]||
                   sudoku[4][1]==sudoku[3][2]||
                   sudoku[4][1]==sudoku[4][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for third slot fifth row
                   sudoku[4][2]=rNumber;
                   if(sudoku[4][2]!=sudoku[0][2]&&
                      sudoku[4][2]!=sudoku[1][2]&&
                      sudoku[4][2]!=sudoku[2][2]&&
                      sudoku[4][2]!=sudoku[3][0]&&
                      sudoku[4][2]!=sudoku[3][1]&&
                      sudoku[4][2]!=sudoku[3][2]&&
                      sudoku[4][2]!=sudoku[4][0]&&
                      sudoku[4][2]!=sudoku[4][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][2]==sudoku[0][2]||
                   sudoku[4][2]==sudoku[1][2]||
                   sudoku[4][2]==sudoku[2][2]||
                   sudoku[4][2]==sudoku[3][0]||
                   sudoku[4][2]==sudoku[3][1]||
                   sudoku[4][2]==sudoku[3][2]||
                   sudoku[4][2]==sudoku[4][0]||
                   sudoku[4][2]==sudoku[4][1]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot fifth row
                   sudoku[4][3]=rNumber;
                   if(sudoku[4][3]!=sudoku[0][3]&&
                      sudoku[4][3]!=sudoku[1][3]&&
                      sudoku[4][3]!=sudoku[2][3]&&
                      sudoku[4][3]!=sudoku[3][3]&&
                      sudoku[4][3]!=sudoku[3][4]&&
                      sudoku[4][3]!=sudoku[3][5]&&
                      sudoku[4][3]!=sudoku[4][0]&&
                      sudoku[4][3]!=sudoku[4][1]&&
                      sudoku[4][3]!=sudoku[4][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][3]==sudoku[0][3]||
                   sudoku[4][3]==sudoku[1][3]||
                   sudoku[4][3]==sudoku[2][3]||
                   sudoku[4][3]==sudoku[3][3]||
                   sudoku[4][3]==sudoku[3][4]||
                   sudoku[4][3]==sudoku[3][5]||
                   sudoku[4][3]==sudoku[4][0]||
                   sudoku[4][3]==sudoku[4][1]||
                   sudoku[4][3]==sudoku[4][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot fifth row
                   sudoku[4][4]=rNumber;
                   if(sudoku[4][4]!=sudoku[0][4]&&
                      sudoku[4][4]!=sudoku[1][4]&&
                      sudoku[4][4]!=sudoku[2][4]&&
                      sudoku[4][4]!=sudoku[3][3]&&
                      sudoku[4][4]!=sudoku[3][4]&&
                      sudoku[4][4]!=sudoku[3][5]&&
                      sudoku[4][4]!=sudoku[4][0]&&
                      sudoku[4][4]!=sudoku[4][1]&&
                      sudoku[4][4]!=sudoku[4][2]&&
                      sudoku[4][4]!=sudoku[4][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][4]==sudoku[0][2]||
                   sudoku[4][4]==sudoku[1][2]||
                   sudoku[4][4]==sudoku[2][2]||
                   sudoku[4][4]==sudoku[3][3]||
                   sudoku[4][4]==sudoku[3][4]||
                   sudoku[4][4]==sudoku[3][5]||
                   sudoku[4][4]==sudoku[4][0]||
                   sudoku[4][4]==sudoku[4][1]||
                   sudoku[4][4]==sudoku[4][2]||
                   sudoku[4][4]==sudoku[4][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot fifth row
                   sudoku[4][5]=rNumber;
                   if(sudoku[4][5]!=sudoku[0][5]&&
                      sudoku[4][5]!=sudoku[1][5]&&
                      sudoku[4][5]!=sudoku[2][5]&&
                      sudoku[4][5]!=sudoku[3][3]&&
                      sudoku[4][5]!=sudoku[3][4]&&
                      sudoku[4][5]!=sudoku[3][5]&&
                      sudoku[4][5]!=sudoku[4][0]&&
                      sudoku[4][5]!=sudoku[4][1]&&
                      sudoku[4][5]!=sudoku[4][2]&&
                      sudoku[4][5]!=sudoku[4][3]&&
                      sudoku[4][5]!=sudoku[4][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][5]==sudoku[0][5]||
                   sudoku[4][5]==sudoku[1][5]||
                   sudoku[4][5]==sudoku[2][5]||
                   sudoku[4][5]==sudoku[3][3]||
                   sudoku[4][5]==sudoku[3][4]||
                   sudoku[4][5]==sudoku[3][5]||
                   sudoku[4][5]==sudoku[4][0]||
                   sudoku[4][5]==sudoku[4][1]||
                   sudoku[4][5]==sudoku[4][2]||
                   sudoku[4][5]==sudoku[4][3]||
                   sudoku[4][5]==sudoku[4][4]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot fifth row
                   sudoku[4][6]=rNumber;
                   if(sudoku[4][6]!=sudoku[0][6]&&
                      sudoku[4][6]!=sudoku[1][6]&&
                      sudoku[4][6]!=sudoku[2][6]&&
                      sudoku[4][6]!=sudoku[3][6]&&
                      sudoku[4][6]!=sudoku[3][7]&&
                      sudoku[4][6]!=sudoku[3][8]&&
                      sudoku[4][6]!=sudoku[4][0]&&
                      sudoku[4][6]!=sudoku[4][1]&&
                      sudoku[4][6]!=sudoku[4][2]&&
                      sudoku[4][6]!=sudoku[4][3]&&
                      sudoku[4][6]!=sudoku[4][4]&&
                      sudoku[4][6]!=sudoku[4][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][6]==sudoku[0][6]||
                   sudoku[4][6]==sudoku[1][6]||
                   sudoku[4][6]==sudoku[2][6]||
                   sudoku[4][6]==sudoku[3][6]||
                   sudoku[4][6]==sudoku[3][7]||
                   sudoku[4][6]==sudoku[3][8]||
                   sudoku[4][6]==sudoku[4][0]||
                   sudoku[4][6]==sudoku[4][1]||
                   sudoku[4][6]==sudoku[4][2]||
                   sudoku[4][6]==sudoku[4][3]||
                   sudoku[4][6]==sudoku[4][4]||
                   sudoku[4][6]==sudoku[4][5]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot fifth row
                   sudoku[4][7]=rNumber;
                   if(sudoku[4][7]!=sudoku[0][7]&&
                      sudoku[4][7]!=sudoku[1][7]&&
                      sudoku[4][7]!=sudoku[2][7]&&
                      sudoku[4][7]!=sudoku[3][6]&&
                      sudoku[4][7]!=sudoku[3][7]&&
                      sudoku[4][7]!=sudoku[3][8]&&
                      sudoku[4][7]!=sudoku[4][0]&&
                      sudoku[4][7]!=sudoku[4][1]&&
                      sudoku[4][7]!=sudoku[4][2]&&
                      sudoku[4][7]!=sudoku[4][3]&&
                      sudoku[4][7]!=sudoku[4][4]&&
                      sudoku[4][7]!=sudoku[4][5]&&
                      sudoku[4][7]!=sudoku[4][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][7]==sudoku[0][7]||
                   sudoku[4][7]==sudoku[1][7]||
                   sudoku[4][7]==sudoku[2][7]||
                   sudoku[4][7]==sudoku[3][6]||
                   sudoku[4][7]==sudoku[3][7]||
                   sudoku[4][7]==sudoku[3][8]||
                   sudoku[4][7]==sudoku[4][0]||
                   sudoku[4][7]==sudoku[4][1]||
                   sudoku[4][7]==sudoku[4][2]||
                   sudoku[4][7]==sudoku[4][3]||
                   sudoku[4][7]==sudoku[4][4]||
                   sudoku[4][7]==sudoku[4][5]||
                   sudoku[4][7]==sudoku[4][6]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot fifth row
                   sudoku[4][8]=rNumber;
                   if(sudoku[4][8]!=sudoku[0][8]&&
                      sudoku[4][8]!=sudoku[1][8]&&
                      sudoku[4][8]!=sudoku[2][8]&&
                      sudoku[4][8]!=sudoku[3][6]&&
                      sudoku[4][8]!=sudoku[3][7]&&
                      sudoku[4][8]!=sudoku[3][8]&&
                      sudoku[4][8]!=sudoku[4][0]&&
                      sudoku[4][8]!=sudoku[4][1]&&
                      sudoku[4][8]!=sudoku[4][2]&&
                      sudoku[4][8]!=sudoku[4][3]&&
                      sudoku[4][8]!=sudoku[4][4]&&
                      sudoku[4][8]!=sudoku[4][5]&&
                      sudoku[4][8]!=sudoku[4][6]&&
                      sudoku[4][8]!=sudoku[4][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[4][8]==sudoku[0][8]||
                   sudoku[4][8]==sudoku[1][8]||
                   sudoku[4][8]==sudoku[2][8]||
                   sudoku[4][8]==sudoku[3][6]||
                   sudoku[4][8]==sudoku[3][7]||
                   sudoku[4][8]==sudoku[3][8]||
                   sudoku[4][8]==sudoku[4][0]||
                   sudoku[4][8]==sudoku[4][1]||
                   sudoku[4][8]==sudoku[4][2]||
                   sudoku[4][8]==sudoku[4][3]||
                   sudoku[4][8]==sudoku[4][4]||
                   sudoku[4][8]==sudoku[4][5]||
                   sudoku[4][8]==sudoku[4][6]||
                   sudoku[4][8]==sudoku[4][7]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for first slot sixth row
                   sudoku[5][0]=rNumber;
                   if(sudoku[5][0]!=sudoku[0][0]&&
                      sudoku[5][0]!=sudoku[1][0]&&
                      sudoku[5][0]!=sudoku[2][0]&&
                      sudoku[5][0]!=sudoku[3][0]&&
                      sudoku[5][0]!=sudoku[3][1]&&
                      sudoku[5][0]!=sudoku[3][2]&&
                      sudoku[5][0]!=sudoku[4][0]&&
                      sudoku[5][0]!=sudoku[4][1]&&
                      sudoku[5][0]!=sudoku[4][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][0]==sudoku[0][0]||
                   sudoku[5][0]==sudoku[1][0]||
                   sudoku[5][0]==sudoku[2][0]||
                   sudoku[5][0]==sudoku[3][0]||
                   sudoku[5][0]==sudoku[3][1]||
                   sudoku[5][0]==sudoku[3][2]||
                   sudoku[5][0]==sudoku[4][0]||
                   sudoku[5][0]==sudoku[4][1]||
                   sudoku[5][0]==sudoku[4][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for second slot sixth row
                   sudoku[5][1]=rNumber;
                   if(sudoku[5][1]!=sudoku[0][1]&&
                      sudoku[5][1]!=sudoku[1][1]&&
                      sudoku[5][1]!=sudoku[2][1]&&
                      sudoku[5][1]!=sudoku[3][0]&&
                      sudoku[5][1]!=sudoku[3][1]&&
                      sudoku[5][1]!=sudoku[3][2]&&
                      sudoku[5][1]!=sudoku[4][0]&&
                      sudoku[5][1]!=sudoku[4][1]&&
                      sudoku[5][1]!=sudoku[4][2]&&
                      sudoku[5][1]!=sudoku[5][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][1]==sudoku[0][1]||
                   sudoku[5][1]==sudoku[1][1]||
                   sudoku[5][1]==sudoku[2][1]||
                   sudoku[5][1]==sudoku[3][0]||
                   sudoku[5][1]==sudoku[3][1]||
                   sudoku[5][1]==sudoku[3][2]||
                   sudoku[5][1]==sudoku[4][0]||
                   sudoku[5][1]==sudoku[4][1]||
                   sudoku[5][1]==sudoku[4][2]||
                   sudoku[5][1]==sudoku[5][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for third slot sixth row
                   sudoku[5][2]=rNumber;
                   if(sudoku[5][2]!=sudoku[0][2]&&
                      sudoku[5][2]!=sudoku[1][2]&&
                      sudoku[5][2]!=sudoku[2][2]&&
                      sudoku[5][2]!=sudoku[3][0]&&
                      sudoku[5][2]!=sudoku[3][1]&&
                      sudoku[5][2]!=sudoku[3][2]&&
                      sudoku[5][2]!=sudoku[4][0]&&
                      sudoku[5][2]!=sudoku[4][1]&&
                      sudoku[5][2]!=sudoku[4][2]&&
                      sudoku[5][2]!=sudoku[5][0]&&
                      sudoku[5][2]!=sudoku[5][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][2]==sudoku[0][2]||
                   sudoku[5][2]==sudoku[1][2]||
                   sudoku[5][2]==sudoku[2][2]||
                   sudoku[5][2]==sudoku[3][0]||
                   sudoku[5][2]==sudoku[3][1]||
                   sudoku[5][2]==sudoku[3][2]||
                   sudoku[5][2]==sudoku[4][0]||
                   sudoku[5][2]==sudoku[4][1]||
                   sudoku[5][2]==sudoku[4][2]||
                   sudoku[5][2]==sudoku[5][0]||
                   sudoku[5][2]==sudoku[5][1]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot sixth row
                   sudoku[5][3]=rNumber;
                   if(sudoku[5][3]!=sudoku[0][3]&&
                      sudoku[5][3]!=sudoku[1][3]&&
                      sudoku[5][3]!=sudoku[2][3]&&
                      sudoku[5][3]!=sudoku[3][3]&&
                      sudoku[5][3]!=sudoku[3][4]&&
                      sudoku[5][3]!=sudoku[3][5]&&
                      sudoku[5][3]!=sudoku[4][3]&&
                      sudoku[5][3]!=sudoku[4][4]&&
                      sudoku[5][3]!=sudoku[4][5]&&
                      sudoku[5][3]!=sudoku[5][0]&&
                      sudoku[5][3]!=sudoku[5][1]&&
                      sudoku[5][3]!=sudoku[5][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][3]==sudoku[0][3]||
                   sudoku[5][3]==sudoku[1][3]||
                   sudoku[5][3]==sudoku[2][3]||
                   sudoku[5][3]==sudoku[3][3]||
                   sudoku[5][3]==sudoku[3][4]||
                   sudoku[5][3]==sudoku[3][5]||
                   sudoku[5][3]==sudoku[4][3]||
                   sudoku[5][3]==sudoku[4][4]||
                   sudoku[5][3]==sudoku[4][5]||
                   sudoku[5][3]==sudoku[5][0]||
                   sudoku[5][3]==sudoku[5][1]||
                   sudoku[5][3]==sudoku[5][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot sixth row
                   sudoku[5][4]=rNumber;
                   if(sudoku[5][4]!=sudoku[0][4]&&
                      sudoku[5][4]!=sudoku[1][4]&&
                      sudoku[5][4]!=sudoku[2][4]&&
                      sudoku[5][4]!=sudoku[3][3]&&
                      sudoku[5][4]!=sudoku[3][4]&&
                      sudoku[5][4]!=sudoku[3][5]&&
                      sudoku[5][4]!=sudoku[4][3]&&
                      sudoku[5][4]!=sudoku[4][4]&&
                      sudoku[5][4]!=sudoku[4][5]&&
                      sudoku[5][4]!=sudoku[5][0]&&
                      sudoku[5][4]!=sudoku[5][1]&&
                      sudoku[5][4]!=sudoku[5][2]&&
                      sudoku[5][4]!=sudoku[5][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][4]==sudoku[0][4]||
                   sudoku[5][4]==sudoku[1][4]||
                   sudoku[5][4]==sudoku[2][4]||
                   sudoku[5][4]==sudoku[3][3]||
                   sudoku[5][4]==sudoku[3][4]||
                   sudoku[5][4]==sudoku[3][5]||
                   sudoku[5][4]==sudoku[4][3]||
                   sudoku[5][4]==sudoku[4][4]||
                   sudoku[5][4]==sudoku[4][5]||
                   sudoku[5][4]==sudoku[5][0]||
                   sudoku[5][4]==sudoku[5][1]||
                   sudoku[5][4]==sudoku[5][2]||
                   sudoku[5][4]==sudoku[5][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot sixth row
                   sudoku[5][5]=rNumber;
                   if(sudoku[5][5]!=sudoku[0][5]&&
                      sudoku[5][5]!=sudoku[1][5]&&
                      sudoku[5][5]!=sudoku[2][5]&&
                      sudoku[5][5]!=sudoku[3][3]&&
                      sudoku[5][5]!=sudoku[3][4]&&
                      sudoku[5][5]!=sudoku[3][5]&&
                      sudoku[5][5]!=sudoku[4][3]&&
                      sudoku[5][5]!=sudoku[4][4]&&
                      sudoku[5][5]!=sudoku[4][5]&&
                      sudoku[5][5]!=sudoku[5][0]&&
                      sudoku[5][5]!=sudoku[5][1]&&
                      sudoku[5][5]!=sudoku[5][2]&&
                      sudoku[5][5]!=sudoku[5][3]&&
                      sudoku[5][5]!=sudoku[5][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][5]==sudoku[0][5]||
                   sudoku[5][5]==sudoku[1][5]||
                   sudoku[5][5]==sudoku[2][5]||
                   sudoku[5][5]==sudoku[3][3]||
                   sudoku[5][5]==sudoku[3][4]||
                   sudoku[5][5]==sudoku[3][5]||
                   sudoku[5][5]==sudoku[4][3]||
                   sudoku[5][5]==sudoku[4][4]||
                   sudoku[5][5]==sudoku[4][5]||
                   sudoku[5][5]==sudoku[5][0]||
                   sudoku[5][5]==sudoku[5][1]||
                   sudoku[5][5]==sudoku[5][2]||
                   sudoku[5][5]==sudoku[5][3]||
                   sudoku[5][5]==sudoku[5][4]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot sixth row
                   sudoku[5][6]=rNumber;
                   if(sudoku[5][6]!=sudoku[0][6]&&
                      sudoku[5][6]!=sudoku[1][6]&&
                      sudoku[5][6]!=sudoku[2][6]&&
                      sudoku[5][6]!=sudoku[3][6]&&
                      sudoku[5][6]!=sudoku[3][7]&&
                      sudoku[5][6]!=sudoku[3][8]&&
                      sudoku[5][6]!=sudoku[4][6]&&
                      sudoku[5][6]!=sudoku[4][7]&&
                      sudoku[5][6]!=sudoku[4][8]&&
                      sudoku[5][6]!=sudoku[5][0]&&
                      sudoku[5][6]!=sudoku[5][1]&&
                      sudoku[5][6]!=sudoku[5][2]&&
                      sudoku[5][6]!=sudoku[5][3]&&
                      sudoku[5][6]!=sudoku[5][4]&&
                      sudoku[5][6]!=sudoku[5][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][6]==sudoku[0][6]||
                   sudoku[5][6]==sudoku[1][6]||
                   sudoku[5][6]==sudoku[2][6]||
                   sudoku[5][6]==sudoku[3][6]||
                   sudoku[5][6]==sudoku[3][7]||
                   sudoku[5][6]==sudoku[3][8]||
                   sudoku[5][6]==sudoku[4][6]||
                   sudoku[5][6]==sudoku[4][7]||
                   sudoku[5][6]==sudoku[4][8]||
                   sudoku[5][6]==sudoku[5][0]||
                   sudoku[5][6]==sudoku[5][1]||
                   sudoku[5][6]==sudoku[5][2]||
                   sudoku[5][6]==sudoku[5][3]||
                   sudoku[5][6]==sudoku[5][4]||
                   sudoku[5][6]==sudoku[5][5]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot sixth row
                   sudoku[5][7]=rNumber;
                   if(sudoku[5][7]!=sudoku[0][7]&&
                      sudoku[5][7]!=sudoku[1][7]&&
                      sudoku[5][7]!=sudoku[2][7]&&
                      sudoku[5][7]!=sudoku[3][6]&&
                      sudoku[5][7]!=sudoku[3][7]&&
                      sudoku[5][7]!=sudoku[3][8]&&
                      sudoku[5][7]!=sudoku[4][6]&&
                      sudoku[5][7]!=sudoku[4][7]&&
                      sudoku[5][7]!=sudoku[4][8]&&
                      sudoku[5][7]!=sudoku[5][0]&&
                      sudoku[5][7]!=sudoku[5][1]&&
                      sudoku[5][7]!=sudoku[5][2]&&
                      sudoku[5][7]!=sudoku[5][3]&&
                      sudoku[5][7]!=sudoku[5][4]&&
                      sudoku[5][7]!=sudoku[5][5]&&
                      sudoku[5][7]!=sudoku[5][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][7]==sudoku[0][7]||
                   sudoku[5][7]==sudoku[1][7]||
                   sudoku[5][7]==sudoku[2][7]||
                   sudoku[5][7]==sudoku[3][6]||
                   sudoku[5][7]==sudoku[3][7]||
                   sudoku[5][7]==sudoku[3][8]||
                   sudoku[5][7]==sudoku[4][6]||
                   sudoku[5][7]==sudoku[4][7]||
                   sudoku[5][7]==sudoku[4][8]||
                   sudoku[5][7]==sudoku[5][0]||
                   sudoku[5][7]==sudoku[5][1]||
                   sudoku[5][7]==sudoku[5][2]||
                   sudoku[5][7]==sudoku[5][3]||
                   sudoku[5][7]==sudoku[5][4]||
                   sudoku[5][7]==sudoku[5][5]||
                   sudoku[5][7]==sudoku[5][6]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot sixth row
                   sudoku[5][8]=rNumber;
                   if(sudoku[5][8]!=sudoku[0][8]&&
                      sudoku[5][8]!=sudoku[1][8]&&
                      sudoku[5][8]!=sudoku[2][8]&&
                      sudoku[5][8]!=sudoku[3][6]&&
                      sudoku[5][8]!=sudoku[3][7]&&
                      sudoku[5][8]!=sudoku[3][8]&&
                      sudoku[5][8]!=sudoku[4][6]&&
                      sudoku[5][8]!=sudoku[4][7]&&
                      sudoku[5][8]!=sudoku[4][8]&&
                      sudoku[5][8]!=sudoku[5][0]&&
                      sudoku[5][8]!=sudoku[5][1]&&
                      sudoku[5][8]!=sudoku[5][2]&&
                      sudoku[5][8]!=sudoku[5][3]&&
                      sudoku[5][8]!=sudoku[5][4]&&
                      sudoku[5][8]!=sudoku[5][5]&&
                      sudoku[5][8]!=sudoku[5][6]&&
                      sudoku[5][8]!=sudoku[5][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[5][8]==sudoku[0][8]||
                   sudoku[5][8]==sudoku[1][8]||
                   sudoku[5][8]==sudoku[2][8]||
                   sudoku[5][8]==sudoku[3][6]||
                   sudoku[5][8]==sudoku[3][7]||
                   sudoku[5][8]==sudoku[3][8]||
                   sudoku[5][8]==sudoku[4][6]||
                   sudoku[5][8]==sudoku[4][7]||
                   sudoku[5][8]==sudoku[4][8]||
                   sudoku[5][8]==sudoku[5][0]||
                   sudoku[5][8]==sudoku[5][1]||
                   sudoku[5][8]==sudoku[5][2]||
                   sudoku[5][8]==sudoku[5][3]||
                   sudoku[5][8]==sudoku[5][4]||
                   sudoku[5][8]==sudoku[5][5]||
                   sudoku[5][8]==sudoku[5][6]||
                   sudoku[5][8]==sudoku[5][7]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for first slot seventh row
                   sudoku[6][0]=rNumber;
                   if(sudoku[6][0]!=sudoku[0][0]&&
                      sudoku[6][0]!=sudoku[1][0]&&
                      sudoku[6][0]!=sudoku[2][0]&&
                      sudoku[6][0]!=sudoku[3][0]&&
                      sudoku[6][0]!=sudoku[4][0]&&
                      sudoku[6][0]!=sudoku[5][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][0]==sudoku[0][0]||
                   sudoku[6][0]==sudoku[1][0]||
                   sudoku[6][0]==sudoku[2][0]||
                   sudoku[6][0]==sudoku[3][0]||
                   sudoku[6][0]==sudoku[4][0]||
                   sudoku[6][0]==sudoku[5][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for second slot seventh row
                   sudoku[6][1]=rNumber;
                   if(sudoku[6][1]!=sudoku[0][1]&&
                      sudoku[6][1]!=sudoku[1][1]&&
                      sudoku[6][1]!=sudoku[2][1]&&
                      sudoku[6][1]!=sudoku[3][1]&&
                      sudoku[6][1]!=sudoku[4][1]&&
                      sudoku[6][1]!=sudoku[5][1]&&
                      sudoku[6][1]!=sudoku[6][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][1]==sudoku[0][1]||
                   sudoku[6][1]==sudoku[1][1]||
                   sudoku[6][1]==sudoku[2][1]||
                   sudoku[6][1]==sudoku[3][1]||
                   sudoku[6][1]==sudoku[4][1]||
                   sudoku[6][1]==sudoku[5][1]||
                   sudoku[6][1]==sudoku[6][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for third slot seventh row
                   sudoku[6][2]=rNumber;
                   if(sudoku[6][2]!=sudoku[0][2]&&
                      sudoku[6][2]!=sudoku[1][2]&&
                      sudoku[6][2]!=sudoku[2][2]&&
                      sudoku[6][2]!=sudoku[3][2]&&
                      sudoku[6][2]!=sudoku[4][2]&&
                      sudoku[6][2]!=sudoku[5][2]&&
                      sudoku[6][2]!=sudoku[6][0]&&
                      sudoku[6][2]!=sudoku[6][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][2]==sudoku[0][2]||
                   sudoku[6][2]==sudoku[1][2]||
                   sudoku[6][2]==sudoku[2][2]||
                   sudoku[6][2]==sudoku[3][2]||
                   sudoku[6][2]==sudoku[4][2]||
                   sudoku[6][2]==sudoku[5][2]||
                   sudoku[6][2]==sudoku[6][0]||
                   sudoku[6][2]==sudoku[6][1]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot seventh row
                   sudoku[6][3]=rNumber;
                   if(sudoku[6][3]!=sudoku[0][3]&&
                      sudoku[6][3]!=sudoku[1][3]&&
                      sudoku[6][3]!=sudoku[2][3]&&
                      sudoku[6][3]!=sudoku[3][3]&&
                      sudoku[6][3]!=sudoku[4][3]&&
                      sudoku[6][3]!=sudoku[5][3]&&
                      sudoku[6][3]!=sudoku[6][0]&&
                      sudoku[6][3]!=sudoku[6][1]&&
                      sudoku[6][3]!=sudoku[6][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][3]==sudoku[0][3]||
                   sudoku[6][3]==sudoku[1][3]||
                   sudoku[6][3]==sudoku[2][3]||
                   sudoku[6][3]==sudoku[3][3]||
                   sudoku[6][3]==sudoku[4][3]||
                   sudoku[6][3]==sudoku[5][3]||
                   sudoku[6][3]==sudoku[6][0]||
                   sudoku[6][3]==sudoku[6][1]||
                   sudoku[6][3]==sudoku[6][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot seventh row
                   sudoku[6][4]=rNumber;
                   if(sudoku[6][4]!=sudoku[0][4]&&
                      sudoku[6][4]!=sudoku[1][4]&&
                      sudoku[6][4]!=sudoku[2][4]&&
                      sudoku[6][4]!=sudoku[3][4]&&
                      sudoku[6][4]!=sudoku[4][4]&&
                      sudoku[6][4]!=sudoku[5][4]&&
                      sudoku[6][4]!=sudoku[6][0]&&
                      sudoku[6][4]!=sudoku[6][1]&&
                      sudoku[6][4]!=sudoku[6][2]&&
                      sudoku[6][4]!=sudoku[6][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][4]==sudoku[0][4]||
                   sudoku[6][4]==sudoku[1][4]||
                   sudoku[6][4]==sudoku[2][4]||
                   sudoku[6][4]==sudoku[3][4]||
                   sudoku[6][4]==sudoku[4][4]||
                   sudoku[6][4]==sudoku[5][4]||
                   sudoku[6][4]==sudoku[6][0]||
                   sudoku[6][4]==sudoku[6][1]||
                   sudoku[6][4]==sudoku[6][2]||
                   sudoku[6][4]==sudoku[6][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot seventh row
                   sudoku[6][5]=rNumber;
                   if(sudoku[6][5]!=sudoku[0][5]&&
                      sudoku[6][5]!=sudoku[1][5]&&
                      sudoku[6][5]!=sudoku[2][5]&&
                      sudoku[6][5]!=sudoku[3][5]&&
                      sudoku[6][5]!=sudoku[4][5]&&
                      sudoku[6][5]!=sudoku[5][5]&&
                      sudoku[6][5]!=sudoku[6][0]&&
                      sudoku[6][5]!=sudoku[6][1]&&
                      sudoku[6][5]!=sudoku[6][2]&&
                      sudoku[6][5]!=sudoku[6][3]&&
                      sudoku[6][5]!=sudoku[6][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][5]==sudoku[0][5]||
                   sudoku[6][5]==sudoku[1][5]||
                   sudoku[6][5]==sudoku[2][5]||
                   sudoku[6][5]==sudoku[3][5]||
                   sudoku[6][5]==sudoku[4][5]||
                   sudoku[6][5]==sudoku[5][5]||
                   sudoku[6][5]==sudoku[6][0]||
                   sudoku[6][5]==sudoku[6][1]||
                   sudoku[6][5]==sudoku[6][2]||
                   sudoku[6][5]==sudoku[6][3]||
                   sudoku[6][5]==sudoku[6][4]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot seventh row
                   sudoku[6][6]=rNumber;
                   if(sudoku[6][6]!=sudoku[0][6]&&
                      sudoku[6][6]!=sudoku[1][6]&&
                      sudoku[6][6]!=sudoku[2][6]&&
                      sudoku[6][6]!=sudoku[3][6]&&
                      sudoku[6][6]!=sudoku[4][6]&&
                      sudoku[6][6]!=sudoku[5][6]&&
                      sudoku[6][6]!=sudoku[6][0]&&
                      sudoku[6][6]!=sudoku[6][1]&&
                      sudoku[6][6]!=sudoku[6][2]&&
                      sudoku[6][6]!=sudoku[6][3]&&
                      sudoku[6][6]!=sudoku[6][4]&&
                      sudoku[6][6]!=sudoku[6][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][6]==sudoku[0][6]||
                   sudoku[6][6]==sudoku[1][6]||
                   sudoku[6][6]==sudoku[2][6]||
                   sudoku[6][6]==sudoku[3][6]||
                   sudoku[6][6]==sudoku[4][6]||
                   sudoku[6][6]==sudoku[5][6]||
                   sudoku[6][6]==sudoku[6][0]||
                   sudoku[6][6]==sudoku[6][1]||
                   sudoku[6][6]==sudoku[6][2]||
                   sudoku[6][6]==sudoku[6][3]||
                   sudoku[6][6]==sudoku[6][4]||
                   sudoku[6][6]==sudoku[6][5]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot seventh row
                   sudoku[6][7]=rNumber;
                   if(sudoku[6][7]!=sudoku[0][7]&&
                      sudoku[6][7]!=sudoku[1][7]&&
                      sudoku[6][7]!=sudoku[2][7]&&
                      sudoku[6][7]!=sudoku[3][7]&&
                      sudoku[6][7]!=sudoku[4][7]&&
                      sudoku[6][7]!=sudoku[5][7]&&
                      sudoku[6][7]!=sudoku[6][0]&&
                      sudoku[6][7]!=sudoku[6][1]&&
                      sudoku[6][7]!=sudoku[6][2]&&
                      sudoku[6][7]!=sudoku[6][3]&&
                      sudoku[6][7]!=sudoku[6][4]&&
                      sudoku[6][7]!=sudoku[6][5]&&
                      sudoku[6][7]!=sudoku[6][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][7]==sudoku[0][7]||
                   sudoku[6][7]==sudoku[1][7]||
                   sudoku[6][7]==sudoku[2][7]||
                   sudoku[6][7]==sudoku[3][7]||
                   sudoku[6][7]==sudoku[4][7]||
                   sudoku[6][7]==sudoku[5][7]||
                   sudoku[6][7]==sudoku[6][0]||
                   sudoku[6][7]==sudoku[6][1]||
                   sudoku[6][7]==sudoku[6][2]||
                   sudoku[6][7]==sudoku[6][3]||
                   sudoku[6][7]==sudoku[6][4]||
                   sudoku[6][7]==sudoku[6][5]||
                   sudoku[6][7]==sudoku[6][6]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot seventh row
                   sudoku[6][8]=rNumber;
                   if(sudoku[6][8]!=sudoku[0][8]&&
                      sudoku[6][8]!=sudoku[1][8]&&
                      sudoku[6][8]!=sudoku[2][8]&&
                      sudoku[6][8]!=sudoku[3][8]&&
                      sudoku[6][8]!=sudoku[4][8]&&
                      sudoku[6][8]!=sudoku[5][8]&&
                      sudoku[6][8]!=sudoku[6][0]&&
                      sudoku[6][8]!=sudoku[6][1]&&
                      sudoku[6][8]!=sudoku[6][2]&&
                      sudoku[6][8]!=sudoku[6][3]&&
                      sudoku[6][8]!=sudoku[6][4]&&
                      sudoku[6][8]!=sudoku[6][5]&&
                      sudoku[6][8]!=sudoku[6][6]&&
                      sudoku[6][8]!=sudoku[6][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[6][8]==sudoku[0][8]||
                   sudoku[6][8]==sudoku[1][8]||
                   sudoku[6][8]==sudoku[2][8]||
                   sudoku[6][8]==sudoku[3][8]||
                   sudoku[6][8]==sudoku[4][8]||
                   sudoku[6][8]==sudoku[5][8]||
                   sudoku[6][8]==sudoku[6][0]||
                   sudoku[6][8]==sudoku[6][1]||
                   sudoku[6][8]==sudoku[6][2]||
                   sudoku[6][8]==sudoku[6][3]||
                   sudoku[6][8]==sudoku[6][4]||
                   sudoku[6][8]==sudoku[6][5]||
                   sudoku[6][8]==sudoku[6][6]||
                   sudoku[6][8]==sudoku[6][7]){
                       break; //breaks whole loop if it cant find the number, starts over
                }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for first slot eight row
                   sudoku[7][0]=rNumber;
                   if(sudoku[7][0]!=sudoku[0][0]&&
                      sudoku[7][0]!=sudoku[1][0]&&
                      sudoku[7][0]!=sudoku[2][0]&&
                      sudoku[7][0]!=sudoku[3][0]&&
                      sudoku[7][0]!=sudoku[4][0]&&
                      sudoku[7][0]!=sudoku[5][0]&&
                      sudoku[7][0]!=sudoku[6][0]&&
                      sudoku[7][0]!=sudoku[6][1]&&
                      sudoku[7][0]!=sudoku[6][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][0]==sudoku[0][0]||
                   sudoku[7][0]==sudoku[1][0]||
                   sudoku[7][0]==sudoku[2][0]||
                   sudoku[7][0]==sudoku[3][0]||
                   sudoku[7][0]==sudoku[4][0]||
                   sudoku[7][0]==sudoku[5][0]||
                   sudoku[7][0]==sudoku[6][0]||
                   sudoku[7][0]==sudoku[6][1]||
                   sudoku[7][0]==sudoku[6][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for second slot eight row
                   sudoku[7][1]=rNumber;
                   if(sudoku[7][1]!=sudoku[0][1]&&
                      sudoku[7][1]!=sudoku[1][1]&&
                      sudoku[7][1]!=sudoku[2][1]&&
                      sudoku[7][1]!=sudoku[3][1]&&
                      sudoku[7][1]!=sudoku[4][1]&&
                      sudoku[7][1]!=sudoku[5][1]&&
                      sudoku[7][1]!=sudoku[6][0]&&
                      sudoku[7][1]!=sudoku[6][1]&&
                      sudoku[7][1]!=sudoku[6][2]&&
                      sudoku[7][1]!=sudoku[7][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][1]==sudoku[0][1]||
                   sudoku[7][1]==sudoku[1][1]||
                   sudoku[7][1]==sudoku[2][1]||
                   sudoku[7][1]==sudoku[3][1]||
                   sudoku[7][1]==sudoku[4][1]||
                   sudoku[7][1]==sudoku[5][1]||
                   sudoku[7][1]==sudoku[6][0]||
                   sudoku[7][1]==sudoku[6][1]||
                   sudoku[7][1]==sudoku[6][2]||
                   sudoku[7][1]==sudoku[7][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for third slot eight row
                   sudoku[7][2]=rNumber;
                   if(sudoku[7][2]!=sudoku[0][2]&&
                      sudoku[7][2]!=sudoku[1][2]&&
                      sudoku[7][2]!=sudoku[2][2]&&
                      sudoku[7][2]!=sudoku[3][2]&&
                      sudoku[7][2]!=sudoku[4][2]&&
                      sudoku[7][2]!=sudoku[5][2]&&
                      sudoku[7][2]!=sudoku[6][0]&&
                      sudoku[7][2]!=sudoku[6][1]&&
                      sudoku[7][2]!=sudoku[6][2]&&
                      sudoku[7][2]!=sudoku[7][0]&&
                      sudoku[7][2]!=sudoku[7][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][2]==sudoku[0][2]||
                   sudoku[7][2]==sudoku[1][2]||
                   sudoku[7][2]==sudoku[2][2]||
                   sudoku[7][2]==sudoku[3][2]||
                   sudoku[7][2]==sudoku[4][2]||
                   sudoku[7][2]==sudoku[5][2]||
                   sudoku[7][2]==sudoku[6][0]||
                   sudoku[7][2]==sudoku[6][1]||
                   sudoku[7][2]==sudoku[6][2]||
                   sudoku[7][2]==sudoku[7][0]||
                   sudoku[7][2]==sudoku[7][1]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot eight row
                   sudoku[7][3]=rNumber;
                   if(sudoku[7][3]!=sudoku[0][3]&&
                      sudoku[7][3]!=sudoku[1][3]&&
                      sudoku[7][3]!=sudoku[2][3]&&
                      sudoku[7][3]!=sudoku[3][3]&&
                      sudoku[7][3]!=sudoku[4][3]&&
                      sudoku[7][3]!=sudoku[5][3]&&
                      sudoku[7][3]!=sudoku[6][3]&&
                      sudoku[7][3]!=sudoku[6][4]&&
                      sudoku[7][3]!=sudoku[6][5]&&
                      sudoku[7][3]!=sudoku[7][0]&&
                      sudoku[7][3]!=sudoku[7][1]&&
                      sudoku[7][3]!=sudoku[7][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][3]==sudoku[0][3]||
                   sudoku[7][3]==sudoku[1][3]||
                   sudoku[7][3]==sudoku[2][3]||
                   sudoku[7][3]==sudoku[3][3]||
                   sudoku[7][3]==sudoku[4][3]||
                   sudoku[7][3]==sudoku[5][3]||
                   sudoku[7][3]==sudoku[6][3]||
                   sudoku[7][3]==sudoku[6][4]||
                   sudoku[7][3]==sudoku[6][5]||
                   sudoku[7][3]==sudoku[7][0]||
                   sudoku[7][3]==sudoku[7][1]||
                   sudoku[7][3]==sudoku[7][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot eight row
                   sudoku[7][4]=rNumber;
                   if(sudoku[7][4]!=sudoku[0][4]&&
                      sudoku[7][4]!=sudoku[1][4]&&
                      sudoku[7][4]!=sudoku[2][4]&&
                      sudoku[7][4]!=sudoku[3][4]&&
                      sudoku[7][4]!=sudoku[4][4]&&
                      sudoku[7][4]!=sudoku[5][4]&&
                      sudoku[7][4]!=sudoku[6][3]&&
                      sudoku[7][4]!=sudoku[6][4]&&
                      sudoku[7][4]!=sudoku[6][5]&&
                      sudoku[7][4]!=sudoku[7][0]&&
                      sudoku[7][4]!=sudoku[7][1]&&
                      sudoku[7][4]!=sudoku[7][2]&&
                      sudoku[7][4]!=sudoku[7][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][4]==sudoku[0][4]||
                   sudoku[7][4]==sudoku[1][4]||
                   sudoku[7][4]==sudoku[2][4]||
                   sudoku[7][4]==sudoku[3][4]||
                   sudoku[7][4]==sudoku[4][4]||
                   sudoku[7][4]==sudoku[5][4]||
                   sudoku[7][4]==sudoku[6][3]||
                   sudoku[7][4]==sudoku[6][4]||
                   sudoku[7][4]==sudoku[6][5]||
                   sudoku[7][4]==sudoku[7][0]||
                   sudoku[7][4]==sudoku[7][1]||
                   sudoku[7][4]==sudoku[7][2]||
                   sudoku[7][4]==sudoku[7][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot eight row
                   sudoku[7][5]=rNumber;
                   if(sudoku[7][5]!=sudoku[0][5]&&
                      sudoku[7][5]!=sudoku[1][5]&&
                      sudoku[7][5]!=sudoku[2][5]&&
                      sudoku[7][5]!=sudoku[3][5]&&
                      sudoku[7][5]!=sudoku[4][5]&&
                      sudoku[7][5]!=sudoku[5][5]&&
                      sudoku[7][5]!=sudoku[6][3]&&
                      sudoku[7][5]!=sudoku[6][4]&&
                      sudoku[7][5]!=sudoku[6][5]&&
                      sudoku[7][5]!=sudoku[7][0]&&
                      sudoku[7][5]!=sudoku[7][1]&&
                      sudoku[7][5]!=sudoku[7][2]&&
                      sudoku[7][5]!=sudoku[7][3]&&
                      sudoku[7][5]!=sudoku[7][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][5]==sudoku[0][5]||
                   sudoku[7][5]==sudoku[1][5]||
                   sudoku[7][5]==sudoku[2][5]||
                   sudoku[7][5]==sudoku[3][5]||
                   sudoku[7][5]==sudoku[4][5]||
                   sudoku[7][5]==sudoku[5][5]||
                   sudoku[7][5]==sudoku[6][3]||
                   sudoku[7][5]==sudoku[6][4]||
                   sudoku[7][5]==sudoku[6][5]||
                   sudoku[7][5]==sudoku[7][0]||
                   sudoku[7][5]==sudoku[7][1]||
                   sudoku[7][5]==sudoku[7][2]||
                   sudoku[7][5]==sudoku[7][3]||
                   sudoku[7][5]==sudoku[7][4]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot eight row
                   sudoku[7][6]=rNumber;
                   if(sudoku[7][6]!=sudoku[0][6]&&
                      sudoku[7][6]!=sudoku[1][6]&&
                      sudoku[7][6]!=sudoku[2][6]&&
                      sudoku[7][6]!=sudoku[3][6]&&
                      sudoku[7][6]!=sudoku[4][6]&&
                      sudoku[7][6]!=sudoku[5][6]&&
                      sudoku[7][6]!=sudoku[6][6]&&
                      sudoku[7][6]!=sudoku[6][7]&&
                      sudoku[7][6]!=sudoku[6][8]&&
                      sudoku[7][6]!=sudoku[7][0]&&
                      sudoku[7][6]!=sudoku[7][1]&&
                      sudoku[7][6]!=sudoku[7][2]&&
                      sudoku[7][6]!=sudoku[7][3]&&
                      sudoku[7][6]!=sudoku[7][4]&&
                      sudoku[7][6]!=sudoku[7][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][6]==sudoku[0][6]||
                   sudoku[7][6]==sudoku[1][6]||
                   sudoku[7][6]==sudoku[2][6]||
                   sudoku[7][6]==sudoku[3][6]||
                   sudoku[7][6]==sudoku[4][6]||
                   sudoku[7][6]==sudoku[5][6]||
                   sudoku[7][6]==sudoku[6][6]||
                   sudoku[7][6]==sudoku[6][7]||
                   sudoku[7][6]==sudoku[6][8]||
                   sudoku[7][6]==sudoku[7][0]||
                   sudoku[7][6]==sudoku[7][1]||
                   sudoku[7][6]==sudoku[7][2]||
                   sudoku[7][6]==sudoku[7][3]||
                   sudoku[7][6]==sudoku[7][4]||
                   sudoku[7][6]==sudoku[7][5]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for eigth slot eight row
                   sudoku[7][7]=rNumber;
                   if(sudoku[7][7]!=sudoku[0][7]&&
                      sudoku[7][7]!=sudoku[1][7]&&
                      sudoku[7][7]!=sudoku[2][7]&&
                      sudoku[7][7]!=sudoku[3][7]&&
                      sudoku[7][7]!=sudoku[4][7]&&
                      sudoku[7][7]!=sudoku[5][7]&&
                      sudoku[7][7]!=sudoku[6][6]&&
                      sudoku[7][7]!=sudoku[6][7]&&
                      sudoku[7][7]!=sudoku[6][8]&&
                      sudoku[7][7]!=sudoku[7][0]&&
                      sudoku[7][7]!=sudoku[7][1]&&
                      sudoku[7][7]!=sudoku[7][2]&&
                      sudoku[7][7]!=sudoku[7][3]&&
                      sudoku[7][7]!=sudoku[7][4]&&
                      sudoku[7][7]!=sudoku[7][5]&&
                      sudoku[7][7]!=sudoku[7][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][7]==sudoku[0][7]||
                   sudoku[7][7]==sudoku[1][7]||
                   sudoku[7][7]==sudoku[2][7]||
                   sudoku[7][7]==sudoku[3][7]||
                   sudoku[7][7]==sudoku[4][7]||
                   sudoku[7][7]==sudoku[5][7]||
                   sudoku[7][7]==sudoku[6][6]||
                   sudoku[7][7]==sudoku[6][7]||
                   sudoku[7][7]==sudoku[6][8]||
                   sudoku[7][7]==sudoku[7][0]||
                   sudoku[7][7]==sudoku[7][1]||
                   sudoku[7][7]==sudoku[7][2]||
                   sudoku[7][7]==sudoku[7][3]||
                   sudoku[7][7]==sudoku[7][4]||
                   sudoku[7][7]==sudoku[7][5]||
                   sudoku[7][7]==sudoku[7][6]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot eight row
                   sudoku[7][8]=rNumber;
                   if(sudoku[7][8]!=sudoku[0][8]&&
                      sudoku[7][8]!=sudoku[1][8]&&
                      sudoku[7][8]!=sudoku[2][8]&&
                      sudoku[7][8]!=sudoku[3][8]&&
                      sudoku[7][8]!=sudoku[4][8]&&
                      sudoku[7][8]!=sudoku[5][8]&&
                      sudoku[7][8]!=sudoku[6][6]&&
                      sudoku[7][8]!=sudoku[6][7]&&
                      sudoku[7][8]!=sudoku[6][8]&&
                      sudoku[7][8]!=sudoku[7][0]&&
                      sudoku[7][8]!=sudoku[7][1]&&
                      sudoku[7][8]!=sudoku[7][2]&&
                      sudoku[7][8]!=sudoku[7][3]&&
                      sudoku[7][8]!=sudoku[7][4]&&
                      sudoku[7][8]!=sudoku[7][5]&&
                      sudoku[7][8]!=sudoku[7][6]&&
                      sudoku[7][8]!=sudoku[7][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[7][8]==sudoku[0][8]||
                   sudoku[7][8]==sudoku[1][8]||
                   sudoku[7][8]==sudoku[2][8]||
                   sudoku[7][8]==sudoku[3][8]||
                   sudoku[7][8]==sudoku[4][8]||
                   sudoku[7][8]==sudoku[5][8]||
                   sudoku[7][8]==sudoku[6][6]||
                   sudoku[7][8]==sudoku[6][7]||
                   sudoku[7][8]==sudoku[6][8]||
                   sudoku[7][8]==sudoku[7][0]||
                   sudoku[7][8]==sudoku[7][1]||
                   sudoku[7][8]==sudoku[7][2]||
                   sudoku[7][8]==sudoku[7][3]||
                   sudoku[7][8]==sudoku[7][4]||
                   sudoku[7][8]==sudoku[7][5]||
                   sudoku[7][8]==sudoku[7][6]||
                   sudoku[7][8]==sudoku[7][7]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for first slot ninth row
                   sudoku[8][0]=rNumber;
                   if(sudoku[8][0]!=sudoku[0][0]&&
                      sudoku[8][0]!=sudoku[1][0]&&
                      sudoku[8][0]!=sudoku[2][0]&&
                      sudoku[8][0]!=sudoku[3][0]&&
                      sudoku[8][0]!=sudoku[4][0]&&
                      sudoku[8][0]!=sudoku[5][0]&&
                      sudoku[8][0]!=sudoku[6][0]&&
                      sudoku[8][0]!=sudoku[6][1]&&
                      sudoku[8][0]!=sudoku[6][2]&&
                      sudoku[8][0]!=sudoku[7][0]&&
                      sudoku[8][0]!=sudoku[7][1]&&
                      sudoku[8][0]!=sudoku[7][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][0]==sudoku[0][0]||
                   sudoku[8][0]==sudoku[1][0]||
                   sudoku[8][0]==sudoku[2][0]||
                   sudoku[8][0]==sudoku[3][0]||
                   sudoku[8][0]==sudoku[4][0]||
                   sudoku[8][0]==sudoku[5][0]||
                   sudoku[8][0]==sudoku[6][0]||
                   sudoku[8][0]==sudoku[6][1]||
                   sudoku[8][0]==sudoku[6][2]||
                   sudoku[8][0]==sudoku[7][0]||
                   sudoku[8][0]==sudoku[7][1]||
                   sudoku[8][0]==sudoku[7][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for second slot ninth row
                   sudoku[8][1]=rNumber;
                   if(sudoku[8][1]!=sudoku[0][1]&&
                      sudoku[8][1]!=sudoku[1][1]&&
                      sudoku[8][1]!=sudoku[2][1]&&
                      sudoku[8][1]!=sudoku[3][1]&&
                      sudoku[8][1]!=sudoku[4][1]&&
                      sudoku[8][1]!=sudoku[5][1]&&
                      sudoku[8][1]!=sudoku[6][0]&&
                      sudoku[8][1]!=sudoku[6][1]&&
                      sudoku[8][1]!=sudoku[6][2]&&
                      sudoku[8][1]!=sudoku[7][0]&&
                      sudoku[8][1]!=sudoku[7][1]&&
                      sudoku[8][1]!=sudoku[7][2]&&
                      sudoku[8][1]!=sudoku[8][0]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][1]==sudoku[0][1]||
                   sudoku[8][1]==sudoku[1][1]||
                   sudoku[8][1]==sudoku[2][1]||
                   sudoku[8][1]==sudoku[3][1]||
                   sudoku[8][1]==sudoku[4][1]||
                   sudoku[8][1]==sudoku[5][1]||
                   sudoku[8][1]==sudoku[6][0]||
                   sudoku[8][1]==sudoku[6][1]||
                   sudoku[8][1]==sudoku[6][2]||
                   sudoku[8][1]==sudoku[7][0]||
                   sudoku[8][1]==sudoku[7][1]||
                   sudoku[8][1]==sudoku[7][2]||
                   sudoku[8][1]==sudoku[8][0]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for third slot ninth row
                   sudoku[8][2]=rNumber;
                   if(sudoku[8][2]!=sudoku[0][2]&&
                      sudoku[8][2]!=sudoku[1][2]&&
                      sudoku[8][2]!=sudoku[2][2]&&
                      sudoku[8][2]!=sudoku[3][2]&&
                      sudoku[8][2]!=sudoku[4][2]&&
                      sudoku[8][2]!=sudoku[5][2]&&
                      sudoku[8][2]!=sudoku[6][0]&&
                      sudoku[8][2]!=sudoku[6][1]&&
                      sudoku[8][2]!=sudoku[6][2]&&
                      sudoku[8][2]!=sudoku[7][0]&&
                      sudoku[8][2]!=sudoku[7][1]&&
                      sudoku[8][2]!=sudoku[7][2]&&
                      sudoku[8][2]!=sudoku[8][0]&&
                      sudoku[8][2]!=sudoku[8][1]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][2]==sudoku[0][2]||
                   sudoku[8][2]==sudoku[1][2]||
                   sudoku[8][2]==sudoku[2][2]||
                   sudoku[8][2]==sudoku[3][2]||
                   sudoku[8][2]==sudoku[4][2]||
                   sudoku[8][2]==sudoku[5][2]||
                   sudoku[8][2]==sudoku[6][0]||
                   sudoku[8][2]==sudoku[6][1]||
                   sudoku[8][2]==sudoku[6][2]||
                   sudoku[8][2]==sudoku[7][0]||
                   sudoku[8][2]==sudoku[7][1]||
                   sudoku[8][2]==sudoku[7][2]||
                   sudoku[8][2]==sudoku[8][0]||
                   sudoku[8][2]==sudoku[8][1]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fourth slot ninth row
                   sudoku[8][3]=rNumber;
                   if(sudoku[8][3]!=sudoku[0][3]&&
                      sudoku[8][3]!=sudoku[1][3]&&
                      sudoku[8][3]!=sudoku[2][3]&&
                      sudoku[8][3]!=sudoku[3][3]&&
                      sudoku[8][3]!=sudoku[4][3]&&
                      sudoku[8][3]!=sudoku[5][3]&&
                      sudoku[8][3]!=sudoku[6][3]&&
                      sudoku[8][3]!=sudoku[6][4]&&
                      sudoku[8][3]!=sudoku[6][5]&&
                      sudoku[8][3]!=sudoku[7][3]&&
                      sudoku[8][3]!=sudoku[7][4]&&
                      sudoku[8][3]!=sudoku[7][5]&&
                      sudoku[8][3]!=sudoku[8][0]&&
                      sudoku[8][3]!=sudoku[8][1]&&
                      sudoku[8][3]!=sudoku[8][2]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][3]==sudoku[0][3]||
                   sudoku[8][3]==sudoku[1][3]||
                   sudoku[8][3]==sudoku[2][3]||
                   sudoku[8][3]==sudoku[3][3]||
                   sudoku[8][3]==sudoku[4][3]||
                   sudoku[8][3]==sudoku[5][3]||
                   sudoku[8][3]==sudoku[6][3]||
                   sudoku[8][3]==sudoku[6][4]||
                   sudoku[8][3]==sudoku[6][5]||
                   sudoku[8][3]==sudoku[7][3]||
                   sudoku[8][3]==sudoku[7][4]||
                   sudoku[8][3]==sudoku[7][5]||
                   sudoku[8][3]==sudoku[8][0]||
                   sudoku[8][3]==sudoku[8][1]||
                   sudoku[8][3]==sudoku[8][2]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for fifth slot ninth row
                   sudoku[8][4]=rNumber;
                   if(sudoku[8][4]!=sudoku[0][4]&&
                      sudoku[8][4]!=sudoku[1][4]&&
                      sudoku[8][4]!=sudoku[2][4]&&
                      sudoku[8][4]!=sudoku[3][4]&&
                      sudoku[8][4]!=sudoku[4][4]&&
                      sudoku[8][4]!=sudoku[5][4]&&
                      sudoku[8][4]!=sudoku[6][3]&&
                      sudoku[8][4]!=sudoku[6][4]&&
                      sudoku[8][4]!=sudoku[6][5]&&
                      sudoku[8][4]!=sudoku[7][3]&&
                      sudoku[8][4]!=sudoku[7][4]&&
                      sudoku[8][4]!=sudoku[7][5]&&
                      sudoku[8][4]!=sudoku[8][0]&&
                      sudoku[8][4]!=sudoku[8][1]&&
                      sudoku[8][4]!=sudoku[8][2]&&
                      sudoku[8][4]!=sudoku[8][3]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][4]==sudoku[0][4]||
                   sudoku[8][4]==sudoku[1][4]||
                   sudoku[8][4]==sudoku[2][4]||
                   sudoku[8][4]==sudoku[3][4]||
                   sudoku[8][4]==sudoku[4][4]||
                   sudoku[8][4]==sudoku[5][4]||
                   sudoku[8][4]==sudoku[6][3]||
                   sudoku[8][4]==sudoku[6][4]||
                   sudoku[8][4]==sudoku[6][5]||
                   sudoku[8][4]==sudoku[7][3]||
                   sudoku[8][4]==sudoku[7][4]||
                   sudoku[8][4]==sudoku[7][5]||
                   sudoku[8][4]==sudoku[8][0]||
                   sudoku[8][4]==sudoku[8][1]||
                   sudoku[8][4]==sudoku[8][2]||
                   sudoku[8][4]==sudoku[8][3]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for sixth slot ninth row
                   sudoku[8][5]=rNumber;
                   if(sudoku[8][5]!=sudoku[0][5]&&
                      sudoku[8][5]!=sudoku[1][5]&&
                      sudoku[8][5]!=sudoku[2][5]&&
                      sudoku[8][5]!=sudoku[3][5]&&
                      sudoku[8][5]!=sudoku[4][5]&&
                      sudoku[8][5]!=sudoku[5][5]&&
                      sudoku[8][5]!=sudoku[6][3]&&
                      sudoku[8][5]!=sudoku[6][4]&&
                      sudoku[8][5]!=sudoku[6][5]&&
                      sudoku[8][5]!=sudoku[7][3]&&
                      sudoku[8][5]!=sudoku[7][4]&&
                      sudoku[8][5]!=sudoku[7][5]&&
                      sudoku[8][5]!=sudoku[8][0]&&
                      sudoku[8][5]!=sudoku[8][1]&&
                      sudoku[8][5]!=sudoku[8][2]&&
                      sudoku[8][5]!=sudoku[8][3]&&
                      sudoku[8][5]!=sudoku[8][4]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][5]==sudoku[0][5]||
                   sudoku[8][5]==sudoku[1][5]||
                   sudoku[8][5]==sudoku[2][5]||
                   sudoku[8][5]==sudoku[3][5]||
                   sudoku[8][5]==sudoku[4][5]||
                   sudoku[8][5]==sudoku[5][5]||
                   sudoku[8][5]==sudoku[6][3]||
                   sudoku[8][5]==sudoku[6][4]||
                   sudoku[8][5]==sudoku[6][5]||
                   sudoku[8][5]==sudoku[7][3]||
                   sudoku[8][5]==sudoku[7][4]||
                   sudoku[8][5]==sudoku[7][5]||
                   sudoku[8][5]==sudoku[8][0]||
                   sudoku[8][5]==sudoku[8][1]||
                   sudoku[8][5]==sudoku[8][2]||
                   sudoku[8][5]==sudoku[8][3]||
                   sudoku[8][5]==sudoku[8][4]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for seventh slot ninth row
                   sudoku[8][6]=rNumber;
                   if(sudoku[8][6]!=sudoku[0][6]&&
                      sudoku[8][6]!=sudoku[1][6]&&
                      sudoku[8][6]!=sudoku[2][6]&&
                      sudoku[8][6]!=sudoku[3][6]&&
                      sudoku[8][6]!=sudoku[4][6]&&
                      sudoku[8][6]!=sudoku[5][6]&&
                      sudoku[8][6]!=sudoku[6][6]&&
                      sudoku[8][6]!=sudoku[6][7]&&
                      sudoku[8][6]!=sudoku[6][8]&&
                      sudoku[8][6]!=sudoku[7][6]&&
                      sudoku[8][6]!=sudoku[7][7]&&
                      sudoku[8][6]!=sudoku[7][8]&&
                      sudoku[8][6]!=sudoku[8][0]&&
                      sudoku[8][6]!=sudoku[8][1]&&
                      sudoku[8][6]!=sudoku[8][2]&&
                      sudoku[8][6]!=sudoku[8][3]&&
                      sudoku[8][6]!=sudoku[8][4]&&
                      sudoku[8][6]!=sudoku[8][5]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][6]==sudoku[0][6]||
                   sudoku[8][6]==sudoku[1][6]||
                   sudoku[8][6]==sudoku[2][6]||
                   sudoku[8][6]==sudoku[3][6]||
                   sudoku[8][6]==sudoku[4][6]||
                   sudoku[8][6]==sudoku[5][6]||
                   sudoku[8][6]==sudoku[6][6]||
                   sudoku[8][6]==sudoku[6][7]||
                   sudoku[8][6]==sudoku[6][8]||
                   sudoku[8][6]==sudoku[7][6]||
                   sudoku[8][6]==sudoku[7][7]||
                   sudoku[8][6]==sudoku[7][8]||
                   sudoku[8][6]==sudoku[8][0]||
                   sudoku[8][6]==sudoku[8][1]||
                   sudoku[8][6]==sudoku[8][2]||
                   sudoku[8][6]==sudoku[8][3]||
                   sudoku[8][6]==sudoku[8][4]||
                   sudoku[8][6]==sudoku[8][5]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for eight slot ninth row
                   sudoku[8][7]=rNumber;
                   if(sudoku[8][7]!=sudoku[0][7]&&
                      sudoku[8][7]!=sudoku[1][7]&&
                      sudoku[8][7]!=sudoku[2][7]&&
                      sudoku[8][7]!=sudoku[3][7]&&
                      sudoku[8][7]!=sudoku[4][7]&&
                      sudoku[8][7]!=sudoku[5][7]&&
                      sudoku[8][7]!=sudoku[6][6]&&
                      sudoku[8][7]!=sudoku[6][7]&&
                      sudoku[8][7]!=sudoku[6][8]&&
                      sudoku[8][7]!=sudoku[7][6]&&
                      sudoku[8][7]!=sudoku[7][7]&&
                      sudoku[8][7]!=sudoku[7][8]&&
                      sudoku[8][7]!=sudoku[8][0]&&
                      sudoku[8][7]!=sudoku[8][1]&&
                      sudoku[8][7]!=sudoku[8][2]&&
                      sudoku[8][7]!=sudoku[8][3]&&
                      sudoku[8][7]!=sudoku[8][4]&&
                      sudoku[8][7]!=sudoku[8][5]&&
                      sudoku[8][7]!=sudoku[8][6]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][7]==sudoku[0][7]||
                   sudoku[8][7]==sudoku[1][7]||
                   sudoku[8][7]==sudoku[2][7]||
                   sudoku[8][7]==sudoku[3][7]||
                   sudoku[8][7]==sudoku[4][7]||
                   sudoku[8][7]==sudoku[5][7]||
                   sudoku[8][7]==sudoku[6][6]||
                   sudoku[8][7]==sudoku[6][7]||
                   sudoku[8][7]==sudoku[6][8]||
                   sudoku[8][7]==sudoku[7][6]||
                   sudoku[8][7]==sudoku[7][7]||
                   sudoku[8][7]==sudoku[7][8]||
                   sudoku[8][7]==sudoku[8][0]||
                   sudoku[8][7]==sudoku[8][1]||
                   sudoku[8][7]==sudoku[8][2]||
                   sudoku[8][7]==sudoku[8][3]||
                   sudoku[8][7]==sudoku[8][4]||
                   sudoku[8][7]==sudoku[8][5]||
                   sudoku[8][7]==sudoku[8][6]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
                for(int k=0;k<=50;k++){
                   rNumber=(int)(9*Math.random()+1); //Generates random number for ninth slot ninth row
                   sudoku[8][8]=rNumber;
                   if(sudoku[8][8]!=sudoku[0][8]&&
                      sudoku[8][8]!=sudoku[1][8]&&
                      sudoku[8][8]!=sudoku[2][8]&&
                      sudoku[8][8]!=sudoku[3][8]&&
                      sudoku[8][8]!=sudoku[4][8]&&
                      sudoku[8][8]!=sudoku[5][8]&&
                      sudoku[8][8]!=sudoku[6][6]&&
                      sudoku[8][8]!=sudoku[6][7]&&
                      sudoku[8][8]!=sudoku[6][8]&&
                      sudoku[8][8]!=sudoku[7][6]&&
                      sudoku[8][8]!=sudoku[7][7]&&
                      sudoku[8][8]!=sudoku[7][8]&&
                      sudoku[8][8]!=sudoku[8][0]&&
                      sudoku[8][8]!=sudoku[8][1]&&
                      sudoku[8][8]!=sudoku[8][2]&&
                      sudoku[8][8]!=sudoku[8][3]&&
                      sudoku[8][8]!=sudoku[8][4]&&
                      sudoku[8][8]!=sudoku[8][5]&&
                      sudoku[8][8]!=sudoku[8][6]&&
                      sudoku[8][8]!=sudoku[8][7]){ //if the number matches the rules i set it will break out of loop, if not it'll keep getting random numbers until it does
                       break;
                   }
                }
                if(sudoku[8][8]==sudoku[0][8]||
                   sudoku[8][8]==sudoku[1][8]||
                   sudoku[8][8]==sudoku[2][8]||
                   sudoku[8][8]==sudoku[3][8]||
                   sudoku[8][8]==sudoku[4][8]||
                   sudoku[8][8]==sudoku[5][8]||
                   sudoku[8][8]==sudoku[6][6]||
                   sudoku[8][8]==sudoku[6][7]||
                   sudoku[8][8]==sudoku[6][8]||
                   sudoku[8][8]==sudoku[7][6]||
                   sudoku[8][8]==sudoku[7][7]||
                   sudoku[8][8]==sudoku[7][8]||
                   sudoku[8][8]==sudoku[8][0]||
                   sudoku[8][8]==sudoku[8][1]||
                   sudoku[8][8]==sudoku[8][2]||
                   sudoku[8][8]==sudoku[8][3]||
                   sudoku[8][8]==sudoku[8][4]||
                   sudoku[8][8]==sudoku[8][5]||
                   sudoku[8][8]==sudoku[8][6]||
                   sudoku[8][8]==sudoku[8][7]){
                       break; //breaks whole loop if it cant find the number, starts over
                   }
            }
             if(sudoku[8][8]!=sudoku[0][8]&&
                sudoku[8][8]!=sudoku[1][8]&&
                sudoku[8][8]!=sudoku[2][8]&&
                sudoku[8][8]!=sudoku[3][8]&&
                sudoku[8][8]!=sudoku[4][8]&&
                sudoku[8][8]!=sudoku[5][8]&&
                sudoku[8][8]!=sudoku[6][6]&&
                sudoku[8][8]!=sudoku[6][7]&&
                sudoku[8][8]!=sudoku[6][8]&&
                sudoku[8][8]!=sudoku[7][6]&&
                sudoku[8][8]!=sudoku[7][7]&&
                sudoku[8][8]!=sudoku[7][8]&&
                sudoku[8][8]!=sudoku[8][0]&&
                sudoku[8][8]!=sudoku[8][1]&&
                sudoku[8][8]!=sudoku[8][2]&&
                sudoku[8][8]!=sudoku[8][3]&&
                sudoku[8][8]!=sudoku[8][4]&&
                sudoku[8][8]!=sudoku[8][5]&&
                sudoku[8][8]!=sudoku[8][6]&&
                sudoku[8][8]!=sudoku[8][7]&&
                sudoku[8][8]!=0){
                       w=1;
                       break; //breaks first loop to get out and continue to print
            }
        }
        return sudoku;
    }
}
