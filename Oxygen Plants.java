//Oxygen Plants
import java.util.Scanner;
import java.util.Formatter;
import java.*;
public class Main {
public static void main(String [] args)
{
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter the floor area of the room(m*m)");
 double l=sc.nextDouble();
 double b=sc.nextDouble();
 System.out.println("Enter the plant area of a single plant(in
cm2)");
 double area=sc.nextInt();

 double a=l*b;
 double bd=area/10000;
 double Tplant=a/bd;

 double rem=Tplant%10;
 Tplant-=rem;
 double oxygen=Tplant*0.9;
 String poxygen=String.format("%.02f",oxygen);
 String pl=String.format("%.02f",l);
 String pb=String.format("%.02f",b);
 String pTplant=String.format("%.0f",Tplant);


 System.out.printf("Total plants placed on floor area "+pl+"*"+pb+"
is "+pTplant+" plants produces "+poxygen+" litres of oxygen in a day");
}
}
