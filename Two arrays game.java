import java.util.Scanner;
public class Main{

 public static int[] Calculate(int[] a, int[] b, int Size){
 int[] finalArray=new int[Size];

 for ( int i=0; i<Size; i++){
 finalArray[i]=a[i]+b[i];
 i++;
 }
 for ( int j=1; j<Size; j++){
 finalArray[j]=a[j]-b[j];
 j++;
 }
 return finalArray;
 }

 public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the size for the first array");
 int Size=sc.nextInt();
 if(Size<=0){
 System.out.println("Invalid array size");
 System.exit(1);
 }

 System.out.println("Enter the elements for the first array");
 int[] farray=new int[Size];
 for ( int i=0; i<Size; i++){
 farray[i]=sc.nextInt();
 }

 System.out.println("Enter the size for the second array");
 int Size2=sc.nextInt();
 if(Size2<=0){
 System.out.println("Invalid array size");
 System.exit(1);
 }

 if(Size!=Size2){
 System.out.println("Both array size are not same");
 System.exit(1);
 }

 System.out.println("Enter the elements for the second array");
 int[] sarray=new int[Size2];
 for ( int i=0; i<Size2; i++){
 sarray[i]=sc.nextInt();
 }
 int[] x=Calculate(farray,sarray,Size);
 System.out.println("The elements of the third array");
 for (int i=0; i<x.length; i++){
 System.out.println(x[i]);
 }
 }
}
