//Electricity Board
//CustomerDetails
public class CustomerDetails {
private String customerId;
private String customerName;
private long phoneNumber;
private String city;
private double unitConsumed;
private double costPerUnit;
public void setCustomerId(String customerId){
 this.customerId=customerId;
}
public void setCustomerName(String customerName){
 this.customerName=customerName;
}
public void setPhoneNumber(long phoneNumber){
 this.phoneNumber=phoneNumber;
}
public void setCity(String city){
 this.city=city;
}
public void setUnitConsumed(double unitConsumed){
 this.unitConsumed=unitConsumed;
}
public void setCostPerUnit(double costPerUnit){
 this.costPerUnit=costPerUnit;
}
public String getCustomerId(){
 return customerId;
}
public String getCustomerName(){
 return customerName;
}
public long getPhoneNumber(){
 return phoneNumber;
}
public String getCity(){
 return city;
}
public double getUnitConsumed(){
 return unitConsumed;
}
public double getCostPerUnit(){
 return costPerUnit;
}
public CustomerDetails(String customerId, String customerName, long
phoneNumber, String city, double unitConsumed, double costPerUnit){

 this.customerId=customerId;
 this.customerName=customerName;
 this.phoneNumber=phoneNumber;
 this.city=city;
 this.unitConsumed=unitConsumed;
 this.costPerUnit=costPerUnit;

}
public double calculateElectricityBill(){
 return(unitConsumed*costPerUnit);
 }
}
//================================================//
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

 CustomerDetails c = new
CustomerDetails("Sample","Sample",123456789,"Sample",12.00,13.00);
 System.out.println("Enter Customer Id");
 c.setCustomerId(sc.nextLine());
 System.out.println("Enter Customer Name");
 c.setCustomerName(sc.nextLine());
 System.out.println("Enter Phone Number");
 c.setPhoneNumber(sc.nextLong());
 System.out.println("Enter City");
 c.setCity(sc.next());
 System.out.println("Enter Units Consumed");
 c.setUnitConsumed(sc.nextDouble());
 System.out.println("Enter Cost per Units");
 c.setCostPerUnit(sc.nextDouble());
 double amount=c.calculateElectricityBill();
 System.out.printf("Amount to be paid is Rs.%.2f",amount);

}
}
