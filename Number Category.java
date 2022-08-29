
public interface NumberCategory{
public boolean checkNumberCategory(int num1,int num2);
}
//=========================================//
import java.util.*;
public class NumberCategoryUtility{

 static int findFactor(int n){
 int i;
 int sum=0;
 for ( i=1; (i*i)<n; i++){
 if(n%i==0){
 sum+=i;
 }
 }
 if(i-(n/i)==1){
 i--;
 }
 for (;i>1; i--){
 if(n%i==0){
 sum+=(n/i);
 }
 }
 return sum;
 }

 public static boolean isPalindrome(int num){
 String n=String.valueOf(num);
 int i=0;
 int j=n.length()-1;

 while(i<j){
 if(n.charAt(i)==n.charAt(j)){
 i++;
 j--;
 continue;
 }return false;
 }return true;
 }

 public static NumberCategory checkAmicable(){
 NumberCategory amicable=((number1,number2)->{
 int n1=findFactor(number1);
 int n2=findFactor(number2);
 if(number1==n2 && number2==n1){
 return true;
 }
 return false;
 });
 return amicable;
 }

 public static NumberCategory checkPalindrome(){
 NumberCategory
palindrome=(((number1,number2)->isPalindrome(number1*number2)));
 return palindrome;
 }

 public static void main(String [] args)
 {
 Scanner sc=new Scanner(System.in);
 int num1=Integer.parseInt(sc.nextLine());
 int num2=Integer.parseInt(sc.nextLine());
 boolean isAmicable=checkAmicable().checkNumberCategory(num1,num2);
 boolean isPalindrome=checkPalindrome().checkNumberCategory(num1,num2);

 if(isAmicable){
 System.out.println("The numbers are amicable");
 }
 else{
 System.out.println("The numbers are not amicable");
 }
 if(isPalindrome){
 System.out.println("Product do produces a palindrome");
 }
 else{
 System.out.println("Product does not produce a palindrome");
 }
 }
}
