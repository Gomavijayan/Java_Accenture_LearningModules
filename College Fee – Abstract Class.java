
public class DayScholar extends Student{
private int busNumber;
private float distance;
public DayScholar(int studentId, String studentName, String department,
String gender, String category, double collegeFee, int busNumber, float distance){
 super(studentId,studentName,department,gender,category,collegeFee);
 this.busNumber=busNumber;
 this.distance=distance;
}
public int getBusNumber(){
 return busNumber;
}
public void setBusNumber(int busNumber){
 this.busNumber=busNumber;
}
public float getDistance(){
 return distance;
}
public void setDistance(float distance){
 this.distance=distance;
}
public double calculateTotalFee() {

 int busFee=0;
 if(distance>30 && distance <=40){
 busFee=28000;
 }
 else if (distance>20 && distance<=30){
 busFee=20000;
 }
 else if(distance >10 && distance <= 20){
 busFee=12000;
 }
 else{
 busFee=6000;
 }
 return (collegeFee+busFee);
}
}
//===============================================//
public abstract class Student {
protected int studentId;
protected String studentName;
protected String department;
protected String gender;
protected String category;
protected double collegeFee;
public Student(int studentId, String studentName, String department, String
gender, String category, double collegeFee){
 this.studentId=studentId;
 this.studentName=studentName;
 this.department=department;
 this.gender=gender;
 this.category=category;
 this.collegeFee=collegeFee;
}
public int getStudentId(){
 return studentId;
}
public void setStudentId(int studentId){
 this.studentId=studentId;
}
public String getStudentName(){
 return studentName;
}
public void setStudentName(String studentName){
 this.studentName=studentName;
}
public String getDepartment(){
 return department;
}
public void setDepartment(String department){
 this.department=department;
}
public String getGender(){
 return gender;
}
public void setGender(String gender){
 this.gender=gender;
}
public String getCategory(){
 return category;
}
public void setCategory(String category){
 this.category=category;
}
public double getCollegeFee(){
 return collegeFee;
}
public abstract double calculateTotalFee();
}
//===========================================//
import java.util.Scanner;
public class UserInterface {
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 System.out.println("Enter Student Id");
 int studentId= Integer.parseInt(sc.nextLine());
 System.out.println("Enter Student name");
 String name=sc.nextLine();
 System.out.println("Enter Department name");
 String deptName=sc.nextLine();
 System.out.println("Enter gender");
 String gender=sc.nextLine();
 System.out.println("Enter category");
 String category=sc.nextLine();
 System.out.println("Enter College fee");
 double collegeFee=Double.parseDouble(sc.nextLine());

 if(category.equals("DayScholar")){
 System.out.println("Enter Bus number");
 int busNumber=Integer.parseInt(sc.nextLine());
 System.out.println("Enter the distance");
 int distance=Integer.parseInt(sc.nextLine());

 DayScholar dayScholar=new DayScholar(studentId, name, deptName, gender,
category, collegeFee, busNumber, distance);
 System.out.println("Total College fee is
"+dayScholar.calculateTotalFee());
 }
 else{
 System.out.println("Enter the room number");
 int roomNumber=Integer.parseInt(sc.nextLine());
 System.out.println("Enter the Block name");
 char blockName=sc.nextLine().charAt(0);
 System.out.println("Enter the room type");
 String roomType=sc.nextLine();

 Hosteller hosteller=new
Hosteller(studentId,name,deptName,gender,category,collegeFee,roomNumber,blockName,r
oomType);
 System.out.println("Total College fee is
"+hosteller.calculateTotalFee());
 }

}
}
//======================================//
public class Hosteller extends Student{

 private int roomNumber;
 private char blockName;
 private String roomType;

 public Hosteller(int studenId,String studentName, String department, String
gender, String category, double collegeFee, int roomNumber, char blockName, String
roomType){
 super(studenId,studentName,department,gender,category,collegeFee);
 this.roomNumber=roomNumber;
 this.blockName=blockName;
 this.roomType=roomType;
 }

 public int getRoomNumber(){
 return roomNumber;
 }
 public void setRoomNumber(int roomNumber){
 this.roomNumber=roomNumber;
 }

 public char getBlockName(){
 return blockName;
 }
 public void setBlockName(char blockName){
 this.blockName=blockName;
 }
 public String getRoomType(){
 return roomType;
 }
 public void setRoomType(String roomType){
 this.roomType=roomType;
 }

 public double calculateTotalFee(){
 int roomFee=0;
 int hostelFee=0;
 if(blockName=='A'){
 hostelFee=60000;
 if(roomType.equals("AC")){
 roomFee=8000;
 }
 }
 else if (blockName=='B'){
 hostelFee=50000;
 if(roomType.equals("AC")){
 roomFee=5000;
 }
 }
 else if (blockName=='C'){
 hostelFee=40000;
 if(roomType.equals("AC")){
 roomFee=2500;
 }
 }
 return collegeFee+hostelFee+roomFee;
 }
}
