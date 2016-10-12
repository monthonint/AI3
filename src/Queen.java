/**
 * Created by monthonintraraprasit on 10/12/2016 AD.
 */
public class Queen {
    private int numberOfQueen;
    public int position_x;
    public int position_y;
    public Queen(int numberOfQueen){
        this.numberOfQueen = numberOfQueen;
    }
    public Queen(int numberOfQueen,int position_x,int position_y){
        this.numberOfQueen = numberOfQueen;
        this.position_x = position_x;
        this.position_y = position_y;
    }
    public int getnumberOfQueen(){
        return numberOfQueen;
    }
    public int getPosition_X(){
        return position_x;
    }
    public int getPosition_y(){
        return position_y;
    }
    public void setPosition_x(int position_x){
        this.position_x = position_x;
    }
    public void setPosition_y(int position_y){
        this.position_y = position_y;
    }

}
