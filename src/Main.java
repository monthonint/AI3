import java.util.Calendar;
import java.util.Random;

/**
 * Created by monthonintraraprasit on 10/12/2016 AD.
 */
public class Main {
    public static void main(String[] args){
        View init_view = new View();
        createQueen(init_view);
        printTable(0, init_view);
    }

    /**
     * Put 8 Queens into a view
     * @param init_view
     */
    public static void createQueen(View init_view){
        char[][] table = init_view.getTable();
        int count = 0;
        while(count < 8){
            int position_x = randomNumber();
            int position_y = randomNumber();
            if(table[position_y][position_x] != 'Q'){
                init_view.getQueen()[count] = new Queen(count, position_x, position_y);
                init_view.setTableValue(position_x, position_y, 'Q');
                count++;
            }
        }
    }

    /**
     * Random a number
     * @return  number; maximum value = 8
     */
    public static int randomNumber(){
        Random random = new Random(Calendar.getInstance().getTimeInMillis());
        return (int)(random.nextDouble() * 8);
    }

    public static void moveQueen(View view){

    }

    /**
     * Print a view of the puzzle
     * @param time  number to be printed above the displayed table.
     * @param view  a view to be displayed.
     */
    public static void printTable(int time, View view) {
        char[][] table = view.getTable();
        System.out.println("Time : " + time);
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[0][0] + "| " + table[0][1] + "| " + table[0][2] + "| " + table[0][3] + "| " +
                table[0][4] + "| " + table[0][5] + "| " + table[0][6] + "| " + table[0][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[1][0] + "| " + table[1][1] + "| " + table[1][2] + "| " + table[1][3] + "| " +
                table[1][4] + "| " + table[1][5] + "| " + table[1][6] + "| " + table[1][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[2][0] + "| " + table[2][1] + "| " + table[2][2] + "| " + table[2][3] + "| " +
                table[2][4] + "| " + table[2][5] + "| " + table[2][6] + "| " + table[2][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[3][0] + "| " + table[3][1] + "| " + table[3][2] + "| " + table[3][3] + "| " +
                table[3][4] + "| " + table[3][5] + "| " + table[3][6] + "| " + table[3][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[4][0] + "| " + table[4][1] + "| " + table[4][2] + "| " + table[4][3] + "| " +
                table[4][4] + "| " + table[4][5] + "| " + table[4][6] + "| " + table[4][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[5][0] + "| " + table[5][1] + "| " + table[5][2] + "| " + table[5][3] + "| " +
                table[5][4] + "| " + table[5][5] + "| " + table[5][6] + "| " + table[5][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[6][0] + "| " + table[6][1] + "| " + table[6][2] + "| " + table[6][3] + "| " +
                table[6][4] + "| " + table[6][5] + "| " + table[6][6] + "| " + table[6][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
        System.out.println("| " + table[7][0] + "| " + table[7][1] + "| " + table[7][2] + "| " + table[7][3] + "| " +
                table[7][4] + "| " + table[7][5] + "| " + table[7][6] + "| " + table[7][7] + "|");
        System.out.println(" -- -- -- -- -- -- -- --");
    }

/*    public void move_Up_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()-1][view.queen[randomqueen].getPosition_y()]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()-1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Down_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()<view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()+1][view.queen[randomqueen].getPosition_y()]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()+1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Left_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_y()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()][view.queen[randomqueen].getPosition_y()-1]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()-1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Right_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_y()<view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()][view.queen[randomqueen].getPosition_y()+1]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()+1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Up_Left_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()>0&&view.queen[randomqueen].getPosition_y()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()-1][view.queen[randomqueen].getPosition_y()-1]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()-1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()-1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Up_Right_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()>0&&view.queen[randomqueen].getPosition_y()<view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()-1][view.queen[randomqueen].getPosition_y()+1]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()-1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()+1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Down_Left_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()<view.getTable().length-1&&view.queen[randomqueen].getPosition_y()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()+1][view.queen[randomqueen].getPosition_y()-1]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()+1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()-1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Down_Right_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()<view.getTable().length-1&&view.queen[randomqueen].getPosition_y()
                <view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()+1][view.queen[randomqueen].getPosition_y()+1]!='q'){
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()+1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()+1);
                view.setTableValue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }*/
}
