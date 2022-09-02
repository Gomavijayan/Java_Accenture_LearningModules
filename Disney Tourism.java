//BoatHouseBooking
public class BoatHouseBooking extends Booking{
int noOfDays;
String foodType;
public BoatHouseBooking(String customerName, String cityName, String
phoneNumber, int noOfPeople, int noOfDays, String foodType){
 super(customerName,cityName,phoneNumber,noOfPeople);
 this.noOfDays=noOfDays;
 this.foodType=foodType;
}
public double calculateTotalAmount() {

 return foodType.toLowerCase().equals("nonveg") ? noOfPeople*800 +
noOfDays*3000 + 500 : noOfPeople*800 + noOfDays*3000 + 250;
}
}
//=============================================//
//BoatRideBooking
public class BoatRideBooking extends Booking{
private float noOfHours;
private String guide;
public BoatRideBooking(String customerName, String cityName, String
phoneNumber, int noOfPeople, float noOfHours, String guide){
 super(customerName,cityName,phoneNumber,noOfPeople);
 this.noOfHours=noOfHours;
 this.guide=guide;
}
public double calculateTotalAmount() {
 return guide.toLowerCase().equals("yes") ? noOfPeople*80 +
noOfHours*300 + 150 : noOfPeople*80 + noOfHours*300;
}
}
//================================================//
//Booking
import java.util.*;
public abstract class Booking {
protected String customerName;
protected String cityName;
protected String phoneNumber;
protected int noOfPeople;
Booking(String customerName, String cityName, String phoneNumber, int
noOfPeople){
 this.customerName=customerName;
 this.cityName=cityName;
 this.phoneNumber=phoneNumber;
 this.noOfPeople=noOfPeople;
}
public String getCustomerName(){
 return customerName;
}
public void setCustomerName(String customerName){
 this.customerName=customerName;
}
public String getCityName(){
 return cityName;
}
public void setCityName(String cityName){
 this.cityName=cityName;
}
public String getPhoneNumber(){
 return phoneNumber;
}
public void setPhoneNumber(String phoneNumber){
 this.phoneNumber=phoneNumber;
}
public int getNoOfPeople(){
 return noOfPeople;
}
public void setNoOfPeople(int noOfPeople){
 this.noOfPeople=noOfPeople;
}
public abstract double calculateTotalAmount();
}
//===============================================//
//UserInterface
import java.util.Scanner;
public class UserInterface {
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the Customer Name");
 String cname=sc.nextLine();
 System.out.println("Enter the City name");
 String cityName=sc.nextLine();
 System.out.println("Enter the phone number");
 String phoneNumber=sc.nextLine();
 System.out.println("Enter number of people");
 int noOfPeople=Integer.parseInt(sc.nextLine());
 System.out.print("Enter the option\n1. Boat House Booking\n2. Boat
Ride Booking\n");

 int choice=Integer.parseInt(sc.nextLine());
 int days=0;

 if(choice==1){
 System.out.println("Enter number of days");
 days=Integer.parseInt(sc.nextLine());
 System.out.println("Enter food type (Veg/NonVeg)");
 String foodType=sc.nextLine();

 BoatHouseBooking bh = new BoatHouseBooking(cname, cityName,
phoneNumber, noOfPeople, days, foodType);
 System.out.println("Your booking has been confirmed pay
Rs."+bh.calculateTotalAmount());
 }
 else{
 int noOfHours=0;
 String guide="";
 System.out.println("Enter number of hours");
 noOfHours=Integer.parseInt(sc.nextLine());
 System.out.println("Do you want guide (Yes/No)");
 guide=sc.nextLine();

 BoatRideBooking br = new BoatRideBooking(cname, cityName,
phoneNumber, noOfPeople, noOfHours, guide);
 System.out.println("Your booking has been confirmed pay
Rs."+br.calculateTotalAmount());
 }
}
}
