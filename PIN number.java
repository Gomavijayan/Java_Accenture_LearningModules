import java.util.Scanner;
public class Main{

 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

 int n,x,c;
 System.out.println("Enter the total number of PIN numbers");
 n=sc.nextInt();
 if(n>0){
 int[] arr=new int[n];
 System.out.println("Enter the PIN numbers");
 for(int i=0; i<n; i++){
 arr[i]=sc.nextInt();
 if(arr[i]>0){
 x=arr[i];
 c=0;
 while(x!=0){
 x/=10;
 ++c;
 }
 if(c<4 || c>4){
 System.out.println(arr[i]+" is an invalid PIN number");
 System.exit(0);
 }}
 else{
 System.exit(0);
 }
 }
 int flag=0,m=0;
 for(int k=0; k<n;k++){
 int one = (arr[k]/1000)%10;
 int two = (arr[k]/100)%10;
 int three =(arr[k]/10)%10;
 int four =arr[k]%10;

 if((one%2)!=0 && (two%2)==0 && ( three==2 || three==3 ||
three==5 || three==7) && (four==4 || four==6 || four==8|| four==9)){
 if(flag==0){
 System.out.println("Valid PIN numbers are");
 }
 System.out.println(arr[k]);
 flag=1;
 m++;
 }
