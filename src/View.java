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
        char[][] table = view.getTable();
        for(int i=0; i < table.length; i++){
            this.table[i]= table[i].clone();
        }
        queen = view.getQueen().clone();
    }
    public View(){
        initialTable();
    }

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
