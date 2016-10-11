/**
 * Created by monthonintraraprasit on 10/12/2016 AD.
 */
public class Queen {
    int numberOfQueen;
    View currentview;
    public Queen(int numberOfQueen,View currentview){
        this.numberOfQueen = numberOfQueen;
        this.currentview = currentview;
    }
    public int getnumberOfQueen(){
        return numberOfQueen;
    }
    public int position_x(){
        return currentview.getQueenPosition_X()[getnumberOfQueen()];
    }
    public int position_y(){
        return currentview.getQueenPosition_y()[getnumberOfQueen()];
    }
}
