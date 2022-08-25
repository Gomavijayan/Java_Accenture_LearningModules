// College Admission
import java.util.Scanner;
public class Main
{
 String name;
 char gender;
 int mark_HSC, mark_SSLC, Tmark_HSC, Trmark_SSLC;
 float mark_Engineering;

public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);

 System.out.println("Applicant name");
 String name=sc.nextLine();

 System.out.println("Marks obtained in HSC");
 int mark_HSC=sc.nextInt();

 System.out.println("Total possible marks in HSC");
 int Tmark_HSC=sc.nextInt();

 System.out.println("Engineering cutoff mark");
 float mark_Engineering=sc.nextFloat();

 System.out.println("Marks obtained in SSLC");
 int mark_SSLC=sc.nextInt();

 System.out.println("Total possible marks in SSLC");
 int Trmark_SSLC=sc.nextInt();

 System.out.println("Gender");
 char gender=sc.next().charAt(0);

 System.out.println("Your Application has been Submitted
Successfully");
 System.out.println("The name of the applicant: "+name);
 System.out.println("Engineering Cutoff: "+mark_Engineering);
 System.out.println("Applicant gender: "+gender);
 System.out.println("All the best for your Career");

}
}
