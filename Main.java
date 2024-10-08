
import java.util.Scanner;
public class Main {


public static void main(String []args) {
    Scanner input = new Scanner(System.in);
    Methods M = new Methods();
    int DH = M.Deal();
    System.out.println("Dealer Hand " + DH);
    int PH = M.Deal() + M.Deal();
    System.out.println("Player Hand " + PH);
    if (PH == 22){
        PH = 21;
    }
    boolean PlayerBust = false;
    while (PH <= 21){
    System.out.println("Hit or stand");
    
    String HitStand = input.next();
    if (HitStand.equals("hit")){
        PH = PH + M.Deal();
        System.out.println("New player hand " + PH);
    
        if (PH > 21){
        System.out.println("Bust");
        PlayerBust = true;
    }
    }else{
        break;
    }    
    }
    while (DH < 17 && PlayerBust == false && PH !=21){
        DH = DH + M.Deal();
        System.out.println("dealer new hand " + DH);
    }
        Methods.Level Result = M.Winner(DH, PH);
    if (Result.equals(Methods.Level.PlayerWin)){
        System.out.println("player wins");
    }
    else if (Result.equals(Methods.Level.DealerWin)){
        System.out.println("dealer wins");
    }
    else{
        System.out.println("Tie");
    }
}


}
    
    