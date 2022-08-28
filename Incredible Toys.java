public class CustomerDetails {
private String customerId;
private String customerName;
private long phoneNumber;
private String emailId;
private String toyType;
private double price;
public CustomerDetails(String customerId, String customerName, long
phonenumber,
String emailId, String toyType, double price){
 this.emailId=emailId;
 this.toyType=toyType;
 this.customerId=customerId;
 this.customerName=customerName;
 this.phoneNumber=phoneNumber;
 this.price=price;
}
public double calculateDiscount() {
 String type =this.toyType;
 double discount=0;
 if(type.equalsIgnoreCase("SoftToys")){
 discount=5;
 }else if (type.equalsIgnoreCase("FidgetToys")){
 discount=10;
 }else if (type.equalsIgnoreCase("SensoryToys")){
 discount=15;
 }else if (type.equalsIgnoreCase("Puzzles")){
 discount=20;
 }
  discount=((this.price)*discount)/100;
 double cost = this.price-discount;
 return cost;
}
public String getCustomerId(){
 return customerId;
}
public void setCustomerId(String customerId){
 this.customerId=customerId;
}
public String getCustomerName(){
 return customerName;
}
public void setCustomerName(String customerName){
 this.customerName=customerName;
}
  public long getPhoneNumber(){
 return phoneNumber;
}
public void setPhoneNumber(long phoneNumber){
 this.phoneNumber=phoneNumber;
}
public String getEmailId(){
 return emailId;
}
public void setEmailId(String emailId){
 this.emailId=emailId;
}
public String getToyType(){
 return toyType;
}
public void setToyType(String toyType){
 this.toyType=toyType;
}
public double getPrice(){
 return price;
}
public void setPrice(double price){
 this.price=price;
}
 public boolean validateNum(String str){
 boolean result =str.matches("[0-9]+");
 return result;
 }

public boolean validateCustomerId(){
 String[] data=customerId.split("/");
 if(data.length==3){
 if(data[0].equalsIgnoreCase("Incredible")){
 if(data[1].length()==3){
 boolean check =validateNum(data[1]);
 if(check == true){
 if(data[2].length()==4){
 boolean check1 =validateNum(data[2]);
 if(check1==true){
 return true;
 }
 }
 }
 }
 }
 }
 return false;
 }
}
//====================================================//
import java.util.Scanner;
public class Main {
public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.println("Enter Customer Id");
 String cid=sc.next();
 System.out.println("Enter Customer Name");
 String name=sc.next();
 System.out.println("Enter Phone Number");
 long phone=sc.nextLong();
 System.out.println("Enter Email Id");
 String email=sc.next();
 System.out.println("Enter type");
 String type=sc.next();
 System.out.println("Enter Price");
 double price = sc.nextDouble();

 CustomerDetails cd = new
CustomerDetails(cid,name,phone,email,type,price);
 if(cd.validateCustomerId()==false){
 System.out.println("Provide a proper Customer Id");
 return;
 }
 System.out.printf("Amount to be paid by the Customer
%.2f\n",cd.calculateDiscount());
}
}
