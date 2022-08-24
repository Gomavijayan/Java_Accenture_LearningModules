public interface BonusPoints {
double calculateBonusPoints();
}
//===================================//
public class CustomerDetails implements BonusPoints, DoorDelivery{
private String customerName;
private String phoneNumber;
private String streetName;
private double billAmount;
private int distance;
public CustomerDetails(String customerName, String phoneNumber, String
streetName, double billAmount, int distance){
 this.customerName=customerName;
 this.phoneNumber=phoneNumber;
 this.streetName=streetName;
 this.billAmount=billAmount;
 this.distance=distance;
}
public String getCustomerName(){
 return customerName;
}
public void setCustomerName(String customerName){
 this.customerName=customerName;
}
public String getPhoneNumber(){
 return phoneNumber;
}
public void setPhoneNumber(String phoneNumber){
 this.phoneNumber=phoneNumber;
}
public String getStreetName(){
 return streetName;
}
public void setStreetName(String streetName){
 this.streetName=streetName;
}
public double getBillAmount(){
