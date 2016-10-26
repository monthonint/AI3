import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by monthonintraraprasit on 10/11/2016 AD.
 */
public class View {
    private char[][] table = new char[8][8];
    Map<Integer, Queen> queenMap = new HashMap<>();
    public Queen[] queen = new Queen[8];
    public View(char[][] table){
        this.table = table;
        }
    public View(View view){
        char[][] table = view.getTable();
        for(int i=0; i < table.length; i++){
            this.table[i]= table[i].clone();
        }
        queen = view.getQueen().clone();
        queenMap = view.getQueenMap();
    }

    public int evaluateView(){
        int number_of_free_Q = 0;
        for(int i = 0; i < queen.length; i++){
            int position_x = queen[i].getPosition_x();
            int position_y = queen[i].getPosition_y();
            for(int j = 0; j < queen.length; j++) {
                if (j != i) {
                    if (position_x == queen[j].getPosition_x()) number_of_free_Q--;
                    if (position_y == queen[j].getPosition_y()) number_of_free_Q--;
                    if (Math.abs(position_x - queen[j].getPosition_x()) == Math.abs(position_y - queen[j].getPosition_y()))
                        number_of_free_Q--;
                }
            }
        }
        return number_of_free_Q * 10000;
    }

    public View(){
        initialTable();
    }

    public void setTable(char[][] table) {
        this.table = table;
    }

    public Map<Integer, Queen> getQueenMap() {
        return queenMap;
    }

    public void setQueenMap(Map<Integer, Queen> queenMap) {
        this.queenMap = queenMap;
    }
    /*
    public ArrayList<Integer> getRowAvaliable(){
        for(Queen temp : queen){

        }
    }*/

    public Queen[] getQueen() {
        return queen;
    }

    public void setQueen(Queen[] queen) {
        this.queen = queen;
    }

    public char[][] getTable(){
        return table;
    }
    public void setTablebyView(View view){
        char[][] table = view.getTable();
        for(int i=0; i < table.length; i++){
            this.table[i]= table[i].clone();
        }
    }
    public void setTablebytable(char[][] table){
        for(int i=0; i < table.length; i++){
            this.table[i]= table[i].clone();
        }
    }
    public void initialTable(){
        this.table = new char[][]{  {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},};
    }
    public void setTableValue(int position_x, int position_y, char data){
        this.table[position_y][position_x] = data;
    }
    public void setAllQueen(){
        for(Queen Q : queen){
            table[Q.getPosition_y()][Q.getPosition_x()] = 'Q';
        }
    }
}
