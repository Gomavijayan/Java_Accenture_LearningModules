
import java.util.Scanner;
public class Main{
 public static boolean flag=false;

 public static int findWinner(Float[] sum){
 int index=0;
 float fastest=sum[0];
 for (int i=1; i<sum.length;i++ ){
 if(sum[i] < fastest){
 fastest=sum[i];
 index=i;
 }
 }
 return index;
 }

 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of teams");
 int no_of_teams=sc.nextInt();
 if(no_of_teams>1){
 Float[] sum = new Float[no_of_teams];
 String[] teams = new String[no_of_teams];
 System.out.println("Enter the details");
 for (int i=0; i<no_of_teams; i++){
 teams[i]=sc.next();
 String[] td=teams[i].split(":");
 if(Float.parseFloat(td[1])<1.00 || Float.parseFloat(td[2])<1.00 ||
Float.parseFloat(td[3])<1.00 || Float.parseFloat(td[4])<1.00){
 System.out.println("Invalid number");
 flag = false;
 break;
 }
 else{
 flag=true;

sum[i]=Float.parseFloat(td[1])+Float.parseFloat(td[2])+Float.parseFloat(td[3])+Floa
t.parseFloat(td[4]);
 }
 }
 if(flag){
 int winnerIndex=findWinner(sum);
 System.out.print(teams[winnerIndex].split(":")[0]+" team wins the
race in");
 System.out.printf(" %.2f ",sum[winnerIndex]);
 System.out.print("minutes");
 }
 }else{
 System.out.println("Invalid input");
 }
 }
}
