 //Ludo King
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter Alex points");
 int pa=sc.nextInt();
 if (pa<0 || pa>50){
 System.out.println(pa+" is an invalid number");
 System.exit(1);
 }

 System.out.println("Enter Nikil points");
 int pn=sc.nextInt();
 if(pn<0 || pn>50){
 System.out.println(pn+" is an invalid number");
 System.exit(1);
 }

 System.out.println("Enter Sam points");
 int ps=sc.nextInt();
 if(ps<0 || ps>50){
 System.out.println(ps+" is an invalid number");
 System.exit(1);
 }

 if(pa>pn && pa>ps){
 System.out.println("Alex scored "+pa+" points and won the
game");
 }
 else if (pn>pa && pn>ps){

 System.out.println("Nikil scored "+pn+" points and won the
game");
 }
 else{
 System.out.println("Sam scored "+ps+" points and won the
game");
 }

}
}
