
/**
 * Created by monthonintraraprasit on 10/12/2016 AD.
 */
public class Main {
    static final int MAX = 5000;
    public static void main(String[] args){
        View init_view = new View();
        createQueen(init_view);
        printTable(0, init_view);
        for(int time = 1;time <= MAX;time++){
            View next_view = moveAQueen(init_view);
            init_view = simulatedAnnealing(init_view,next_view,time);
            //printTable(time, init_view);
            System.out.println(init_view.evaluateView());
        }
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
            //if(table[position_y][position_x] != 'Q'){
            if(init_view.getQueenMap().get(position_x * 10 + position_y) == null){
                Queen new_Queen = new Queen(count, position_x, position_y);
                init_view.getQueen()[count] = new_Queen;
                init_view.setTableValue(position_x, position_y, 'Q');
                init_view.getQueenMap().put(position_x * 10 + position_y, new_Queen);
                count++;
            }
        }
    }

    public static View simulatedAnnealing(View init_view,View new_view,int time){
        int deltaE = new_view.evaluateView()-init_view.evaluateView();
        int T = MAX -time;
        System.out.print("T = " + T);
        if(deltaE>0){
            return new_view;
        }
        else{
            double prop = Math.exp(((double)deltaE)/((double)T));
            if(Math.random() <= prop){
                System.out.print("moved with prop = " + prop + " ");
                return new_view;
            }
            else{
                return init_view;
            }
        }
    }

    public static View moveAQueen(View view){
        int random_Queen = randomNumber();
        View next_View = new View(view);

        Queen move_Q = next_View.getQueen()[random_Queen];
        int new_position_x = randomNumber();
        int new_position_y = randomNumber();
        if(next_View.getTable()[new_position_y][new_position_x] == 'Q') return view;
        next_View.setTableValue(move_Q.getPosition_x(), move_Q.getPosition_y(), ' ');
        //System.out.println(move_Q.toString());
        Queen new_Q = new Queen(random_Queen, new_position_x, new_position_y);
        next_View.getQueen()[random_Queen] = new_Q;
        //System.out.println(move_Q.toString());
        next_View.setTableValue(new_Q.getPosition_x(), new_Q.getPosition_y(), 'Q');
        return next_View;
    }

    /**
     * Random a number
     * @return  number; maximum value = 8
     */
    public static int randomNumber(){
        return (int)(Math.random() * 8);
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

}
