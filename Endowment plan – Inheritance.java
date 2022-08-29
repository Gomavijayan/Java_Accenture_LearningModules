public class EducationalEndowment extends Endowment{

 private String educationalInstitution;
 private String educationalDivision;

 public EducationalEndowment(String endowmentId, String holderName, String
endowmentType, String registrationDate, String educationalInstitution, String
educationalDivision){
 super(endowmentId,holderName,endowmentType, registrationDate);
 this.educationalInstitution=educationalInstitution;
 this.educationalDivision=educationalDivision;
 }

 public String getEducationalInstitution(){
 return educationalInstitution;
 }
 public void setEducationalInstitution(String educationalInstitution){
 this.educationalInstitution=educationalInstitution;
 }

 public String getEducationalDivision(){
 return educationalDivision;
 }
 public void setEducationalDivision(String educationalDivision){
 this.educationalDivision=educationalDivision;
 }

public double calculateEndowment(){
 int endowmentAmount=0;
 if(educationalDivision.equalsIgnoreCase("School")){
 endowmentAmount=30000;
 }
 else if (educationalDivision.equalsIgnoreCase("UnderGraduate")){
 endowmentAmount=60000;
 }
 else{
 endowmentAmount=90000;
 }
 return endowmentAmount;
}
}
//================================================//
public abstract class Endowment {
private String endowmentId;
private String holderName;
private String endowmentType;
private String registrationDate;
public Endowment(String endowmentId, String holderName, String
endowmentType, String registrationDate){
 this.endowmentId=endowmentId;
 this.holderName=holderName;
 this.endowmentType=endowmentType;
 this.registrationDate=registrationDate;
}
public String getEndowmentId(){
 return endowmentId;
}
public void setEndowmentId(String endowmentId){
 this.endowmentId=endowmentId;
}
public String getHolderName(){
 return holderName;
}
public void setHolderName(String holderName){
 this.holderName=holderName;
}
public String getEndowmentType(){
 return endowmentType;
}
public void setEndowmentType(String endowmentType){
 this.endowmentType=endowmentType;
}
public String getRegistrationDate(){
 return registrationDate;
}
public void setRegistrationDate(String registrationDate){
 this.registrationDate=registrationDate;
}
public abstract double calculateEndowment();
}
//=================================================//
public class HealthEndowment extends Endowment{
private String healthCareCenter;
private int holderAge;
public HealthEndowment(String endowmentId, String holderName, String
endowmentType, String registrationDate, String healthCareCenter, int holderAge){
 super(endowmentId,holderName,endowmentType,registrationDate);
 this.healthCareCenter=healthCareCenter;
 this.holderAge=holderAge;
}
public String getHealthCareCenter(){
 return healthCareCenter;
}
public void setHealthCareCenter(String healthCareCenter){
 this.healthCareCenter=healthCareCenter;
}
public int getHolderAge(){
 return holderAge;
}
public void setHolderAge(int holderAge){
 this.holderAge=holderAge;
}
public double calculateEndowment(){
 int endowmentAmount=0;
 if(holderAge<=30){
 endowmentAmount=120000;
 }
 else if (holderAge>30 && holderAge<60){
 endowmentAmount=200000;
 }
 else{
 endowmentAmount=500000;
 }
 return endowmentAmount;
}
}
//=====================================================//
import java.util.Scanner;
public class UserInterface {
public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter Endowment Id");
 String endowmentId=sc.nextLine();
 System.out.println("Enter Holder Name");
 String holderName=sc.nextLine();
 System.out.println("Enter Endowment Type");
 String endowmentType=sc.nextLine();
 System.out.println("Enter Registration Date");
 String registrationDate=sc.nextLine();

 if(endowmentType.equalsIgnoreCase("Educational")){
 System.out.println("Enter Educational Institution");
 String educationalInstitution=sc.nextLine();
 System.out.println("Enter Educational Division");
 String educationalDivision=sc.nextLine();
 EducationalEndowment educationalEndowment = new
EducationalEndowment(endowmentId,holderName,endowmentType,registrationDate,educatio
nalInstitution,educationalDivision);
 System.out.println("Endowment Amount
"+educationalEndowment.calculateEndowment());
 }
 else{
 System.out.println("Enter Health Care Center");
 String healthCenter=sc.nextLine();
 System.out.println("Enter Holder Age");
 int holderAge=Integer.parseInt(sc.nextLine());
 HealthEndowment healthEndowment=new
HealthEndowment(endowmentId,holderName,endowmentType,registrationDate,healthCenter,
holderAge);
 System.out.println("Endowment Amount
"+healthEndowment.calculateEndowment());
 }
}
}
