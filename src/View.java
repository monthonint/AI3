/**
 * Created by monthonintraraprasit on 10/11/2016 AD.
 */
public class View {
    private char[][] table = new char[8][8];
    public Queen[] queen = new Queen[8];
    public View(char[][] table){
        this.table = table;
        }
    public View(View view){
        for(int i=0;i<view.getTable().length;i++){
            this.table[i]= view.getTable()[i].clone();
        }
    }
    public View(){
    }
    public char[][] getTable(){
        return table;
    }
    public void setTablebyView(View view){
        this.table = view.getTable();
    }
    public void setTablebytable(char[][] table){
        this.table = table;
    }
    public void setValueInitial(){
        this.table = new char[][]{  {' ',' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' ',' '},
                                    {' ',' ',' ',' ',' ',' ',' ',' '}};
    }
    public void setvalue(int position_x,int position_y,char data){
        this.table[position_x][position_y] = data;
    }
}
