//Sim Card
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the phone number");
 long phn=sc.nextLong();

 int odd=0,even=0;
 long temp=phn,rem=0;

 while(temp>0){
 rem=temp%10;
 if(rem%2==0){
 even+=rem;
 }
 else{
 odd+=rem;
 }
 temp/=10;
 }
 if(odd>even){
 System.out.println("Sum of odd is greater than sum of even");
 }
 else if (odd<even){
 System.out.println("Sum of even is greater than sum of odd");
 }
 else{
 System.out.println("Sum of odd and even are equal");
 }

}
}
