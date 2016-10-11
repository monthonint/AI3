/**
 * Created by monthonintraraprasit on 10/11/2016 AD.
 */
public class View {
    private char[][] table = new char[8][8];
    public int[] position_x = new int[8];
    public int[] position_y = new int[8];
    public View(char[][] table){
        this.table = table;
        int countQueeen = 0;
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                if(table[i][j]=='q'){
                    this.position_x[countQueeen] = i;
                    this.position_y[countQueeen] = j;
                    countQueeen += 1;
                }
            }
        }
    }
    public View(View view){
        for(int i=0;i<view.getTable().length;i++){
            this.table[i]= view.getTable()[i].clone();
        }
        int countQueeen = 0;
        for(int i=0;i<view.getTable().length;i++){
            for(int j=0;j<view.getTable()[i].length;j++){
                if(table[i][j]=='q'){
                    this.position_x[countQueeen] = i;
                    this.position_y[countQueeen] = j;
                    countQueeen += 1;
                }
            }
        }
    }
    public char[][] getTable(){
        return table;
    }
    public void setTable(char[][] table){
        this.table = table;
    }
    public int[] getQueenPosition_X(){
        return position_x;
    }
    public int[] getQueenPosition_y(){
        return position_y;
    }
    public void setQueenPosition_x(int numberofqueen,int position_x){
        this.getQueenPosition_X()[numberofqueen] = position_x;
    }
    public void setQueenPosition_y(int numberofqueen,int position_y){
        this.getQueenPosition_y()[numberofqueen] = position_y;
    }
    private void setValueInitial(){
        this.table = new char[][]{{' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {'q','q','q','q','q','q','q','q'},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '}};
    }
}
