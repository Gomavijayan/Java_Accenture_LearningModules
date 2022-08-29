import java.util.ArrayList;
public interface EmployeeAudit {
 public ArrayList<String> fetchEmployeeDetails(double salary);
}
//========================================//
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
private static Map <String,Double> employeeMap = new
HashMap<String,Double>();
public Map<String, Double> getEmployeeMap() {
 return employeeMap;
}
public void setEmployeeMap(Map<String, Double> employeeMap) {
 this.employeeMap = employeeMap;
}
public void addEmployeeDetails(String employeeName, double salary)
{
 employeeMap.put(employeeName,salary);
}
public static EmployeeAudit findEmployee()
{
 ArrayList<String> name= new ArrayList<String>();

 EmployeeAudit employeeAudit = (search)->{
 for (Map.Entry<String,Double> i:employeeMap.entrySet() )
 if(i.getValue()<=search){
 name.add(i.getKey());
 }
 return name;
 };

 return employeeAudit;
}
public static void main(String[] args)
{
 Main emp = new Main();
 Scanner sc=new Scanner(System.in);
 int choice=0;
 do{
 System.out.println("1. Add Employee details");
 System.out.println("2. Find Employee details");
 System.out.println("3. Exit");
 System.out.println("Enter the choice");
 choice=Integer.parseInt(sc.nextLine());

 switch(choice){
 case 1:
 System.out.println("Enter the Employee name");
 String name=sc.nextLine();
 System.out.println("Enter the Employee Salary");
 double salary=Double.parseDouble(sc.nextLine());
 emp.addEmployeeDetails(name,salary);
 break;

 case 2:
 System.out.println("Enter the salary to be searched");
 double search=Double.parseDouble(sc.nextLine());
 ArrayList<String>
nameList=findEmployee().fetchEmployeeDetails(search);
 if(nameList.isEmpty()){
 System.out.println("No employee found");
 }
 else{
 System.out.println("Employee List");
 for(String empName: nameList){
 System.out.println(empName);
 }
 }
 break;

 default:
 break;
 }}while(choice!=3);

 System.out.println("Let's complete the session");

}
}
