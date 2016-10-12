import java.util.Calendar;
import java.util.Random;

/**
 * Created by monthonintraraprasit on 10/12/2016 AD.
 */
public class Main {
    public static Main main = new Main();
    public View view = new View();
    public static void main(String[] args){
        main.view.setValueInitial();
        main.createqueen(main.view);
        int temp = main.randomqueen();
        main.printinforQueen(temp);
        main.printTable(0,main.view);

        main.move_Up_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(1,main.view);

        main.move_Down_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(2,main.view);

        main.move_Left_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(3,main.view);

        main.move_Right_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(4,main.view);

        main.move_Up_Left_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(5,main.view);

        main.move_Up_Right_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(6,main.view);

        main.move_Down_Left_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(7,main.view);

        main.move_Down_Right_queen(temp,main.view);
        main.printinforQueen(temp);
        main.printTable(8,main.view);
    }
    public void createqueen(View viewofqueen){
        int count = 0;
        while(count<viewofqueen.getTable().length){
            int[] positionqueen = randomposition();
            if(viewofqueen.getTable()[positionqueen[0]][positionqueen[1]]!='q'){
                viewofqueen.queen[count] = new Queen(count,positionqueen);
                viewofqueen.setvalue(positionqueen[0],positionqueen[1],'q');
                count += 1;
            }
        }
    }
    public int[] randomposition(){
        int[] position_xy = new int[2];
        Random random = new Random(Calendar.getInstance().getTimeInMillis());
        position_xy[0] = (int)(random.nextDouble() * 8);
        position_xy[1] = (int)(random.nextDouble() * 8);
        return position_xy;
    }
    public int randomqueen(){
        Random random = new Random(Calendar.getInstance().getTimeInMillis());
        int temp = (int)(random.nextDouble() * 8);
        return temp;
    }
    public void printTable(int time, View view) {
        System.out.println("Time : " + time);
        System.out.print(" ");
        for (int i = 0; i < view.getTable().length; i++)
            System.out.print("- ");
        System.out.println(" ");
        for (int i = 0; i < view.getTable().length; i++) {
            System.out.print("|");
            for (int j = 0; j < view.getTable()[i].length; j++) {
                System.out.print(view.getTable()[i][j]);
                System.out.print("|");
            }
            System.out.println();
            System.out.print(" ");
            for (int k = 0; k < view.getTable().length; k++)
                System.out.print("- ");
            System.out.println(" ");
        }
    }
    public void move_Up_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()-1][view.queen[randomqueen].getPosition_y()]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()-1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Down_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()<view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()+1][view.queen[randomqueen].getPosition_y()]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()+1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Left_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_y()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()][view.queen[randomqueen].getPosition_y()-1]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()-1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Right_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_y()<view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()][view.queen[randomqueen].getPosition_y()+1]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()+1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Up_Left_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()>0&&view.queen[randomqueen].getPosition_y()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()-1][view.queen[randomqueen].getPosition_y()-1]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()-1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()-1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Up_Right_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()>0&&view.queen[randomqueen].getPosition_y()<view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()-1][view.queen[randomqueen].getPosition_y()+1]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()-1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()+1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Down_Left_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()<view.getTable().length-1&&view.queen[randomqueen].getPosition_y()>0){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()+1][view.queen[randomqueen].getPosition_y()-1]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()+1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()-1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void move_Down_Right_queen(int randomqueen,View view){
        if(view.queen[randomqueen].getPosition_x()<view.getTable().length-1&&view.queen[randomqueen].getPosition_y()
                <view.getTable().length-1){
            if(view.getTable()[view.queen[randomqueen].getPosition_x()+1][view.queen[randomqueen].getPosition_y()+1]!='q'){
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),' ');
                view.queen[randomqueen].setPosition_x(view.queen[randomqueen].getPosition_x()+1);
                view.queen[randomqueen].setPosition_y(view.queen[randomqueen].getPosition_y()+1);
                view.setvalue(view.queen[randomqueen].getPosition_x(),view.queen[randomqueen].getPosition_y(),'q');
            }
        }
    }
    public void printinforQueen(int temp){
        System.out.println("q: "+temp+" x: "+main.view.queen[temp].getPosition_x()+" y: "+main.view.queen[temp].getPosition_y()
                +" No.Queen: "+main.view.queen[temp].getnumberOfQueen());
    }
}
