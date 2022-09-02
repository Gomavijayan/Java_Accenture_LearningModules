//Bero
public abstract class Bero {

 protected String beroType;
 protected String beroColour;
 protected double price;
Bero(String beroType, String beroColour){
 this.beroType=beroType;
 this.beroColour=beroColour;
}
public String getBeroType(){
 return beroType;
}
public void setBeroType(String beroType){
 this.beroType=beroType;
}
public String getBeroColour(){
 return beroColour;
}
public void setBeroColour(String beroColour){
 this.beroColour=beroColour;
}
public double getPrice(){
 return price;
}
public void setPrice(double price){
 this.price=price;
}
public abstract void calculatePrice();
}
//==========================================//
public class CustomerDetails {

 private String customerName;
 private long phoneNumber;
 private String address;

 public CustomerDetails(String customerName, long phoneNumber, String address){
 this.customerName=customerName;
 this.phoneNumber=phoneNumber;
 this.address=address;
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

 public String getAddress(){
 return address;
 }
 public void setAddress(String address){
 this.address=address;
 }
}
//=============================================//
public class Discount {
public double calculateDiscount(Bero bObj) {
 double discount=0;
 if(bObj instanceof SteelBero){
 discount=.10*bObj.getPrice();
 }
 else if (bObj instanceof WoodenBero){
 discount=.15*bObj.getPrice();
 }
 return discount;
}
}
//===================================================//
public class SteelBero extends Bero{
private int beroHeight;
public int getBeroHeight(){
 return beroHeight;
}
public void setBeroHeight(int beroHeight){
 this.beroHeight=beroHeight;
}
public SteelBero(String beroType,String beroColour,int beroHeight){
 super(beroType,beroColour);
 this.beroHeight=beroHeight;
}
public void calculatePrice() {
 double totalPrice=0;
 if(beroHeight==3){
 totalPrice=5000;
 }
 else if (beroHeight==5){
 totalPrice=8000;
 }
 else if (beroHeight==7){
 totalPrice=10000;
 }
 setPrice(totalPrice);
}
}
//==============================================//
public class WoodenBero extends Bero{
private String woodType;
public WoodenBero(String beroType, String beroColour, String woodType){
 super(beroType,beroColour);
 this.woodType=woodType;
}
public void setWoodType(String woodType){
 this.woodType=woodType;
}
public String getWoodType(){
 return woodType;
}
public void calculatePrice() {
 double totalPrice=0;
 if(woodType.equals("Ply Wood")){
 totalPrice=15000;
 }
 else if (woodType.equals("Teak Wood")){
 totalPrice=12000;
 }
 else if (woodType.equals("Engineered Wood")){
 totalPrice=10000;
 }
 setPrice(totalPrice);
}
}
//===========================================//
import java.util.Scanner;
public class Main {
public static void main(String[] args) {

 double TotalPrice=0;
 Discount d=new Discount();
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter Customer Name");
 String cname=sc.nextLine();
 System.out.println("Enter Phone Number");
 long phno=Long.parseLong(sc.nextLine());
 System.out.println("Enter address");
 String ads=sc.nextLine();
 System.out.println("Enter Bero Type");
 String btype=sc.nextLine();
 System.out.println("Enter Bero Colour");
 String bColour=sc.nextLine();

 if(btype.equals("Wooden Bero")){
 System.out.println("Enter Wood Type");
 String wType=sc.nextLine();

 WoodenBero wb = new WoodenBero(btype,bColour,wType);

 wb.calculatePrice();
 TotalPrice= wb.getPrice()-d.calculateDiscount(wb);

 System.out.printf("Amount needs to be paid
Rs.%.2f",TotalPrice);
 }

 else if (btype.equals("Steel Bero")){
 System.out.println("Enter Bero Height");
 int height=Integer.parseInt(sc.nextLine());

 SteelBero sb =new SteelBero(btype,bColour,height);

 sb.calculatePrice();
 TotalPrice=sb.getPrice()-d.calculateDiscount(sb);

 System.out.printf("Amount needs to be paid
Rs.%.2f",TotalPrice);

 }
}
}
