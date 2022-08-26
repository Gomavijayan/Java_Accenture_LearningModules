
//CardPoints
public class CardPoints {
 private int cardId;
 private String holderName;
 private int balancePoints;

 public void setCardId(int cardId){
 this.cardId=cardId;
 }

 public int getCardId(){
 return cardId;
 }

 public void setHolderName(String holderName){
 this.holderName=holderName;
 }
 public String getHolderName(){
 return holderName;
 }
public void setBalancePoints(int balancePoints){
 this.balancePoints=balancePoints;
}
public int getBalancePoints(){
 return balancePoints;
}
public boolean withdrawPoints(int points) {
 if(balancePoints<points){
 System.out.println("Sorry!!! No enough points");
 return false;
 }else{
 int rem=balancePoints-points;
 balancePoints=rem;
 System.out.printf("Balance points after used:%d\n",rem);
 return true;
 }
}
}
//======================================================//
import java.util.Scanner;
public class GameCardDetails {
 public CardPoints getCardDetails()
 {
 Scanner sc = new Scanner(System.in);
 CardPoints cp=new CardPoints();
 int cardId;
 String holderName;
 int balancePoints;
 System.out.println("Enter card id");
 cardId=sc.nextInt();
 System.out.println("Enter card holder name");
 holderName=sc.next();

 do{
 System.out.println("Enter balance points");
 balancePoints = sc.nextInt();
 if(balancePoints<=0){
 System.out.println("Balance points should be positive");
 }
 }while(balancePoints<=0);

 cp.setCardId(cardId);
 cp.setHolderName(holderName);
 cp.setBalancePoints(balancePoints);
 return cp;
 }
 public int getPointUsage()
 {
 Scanner sc = new Scanner(System.in);
 int points;
 do{
 System.out.println("Enter points should be used");
 points =sc.nextInt();
 if(points<=0){
 System.out.println("Points should be positive");
 }
 }while(points<=0);
 return points;
 }

 public static void main(String[] arg)
 {
 CardPoints cp = new CardPoints();
 GameCardDetails cd=new GameCardDetails();
 cp=cd.getCardDetails();
 int points=cd.getPointUsage();
 cp.withdrawPoints(points);
 }
}
