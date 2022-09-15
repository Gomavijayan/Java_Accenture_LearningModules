
import java.util.Scanner;
public class Main{

 public static int Points(int age, int big, int medium, int small, int count){
 int total=0;
 if(age<18){
 System.out.println(age+" is an invalid age");
 System.exit(1);
 }
 else if(count<0){
 System.out.println(count+" is an invalid input");
 System.exit(1);
 }
 else if(big<0){
 System.out.println(big+" is an invalid input");
 System.exit(1);
 }
 else if(medium<0){
 System.out.println(medium+" is an invalid input");
 System.exit(1);
 }
 else if(small<0){
 System.out.println(small+" is an invalid input");
 System.exit(1);
 }
 else{
 total=(big*10)+(medium*6)+(small*3);
 }
 return total;
 }

 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the details");
 String str=sc.next();
 String[] details=new String[4];
 details=str.split(":");
 String name=details[0];
 int age=Integer.parseInt(details[1]);
 int big=Integer.parseInt(details[2]);
 int medium=Integer.parseInt(details[3]);
 int small=Integer.parseInt(details[4]);
 int count=big+medium+small;
 int x=Points(age,big,medium,small,count);
 System.out.println(name+" scored "+x+" points");

 }
}
