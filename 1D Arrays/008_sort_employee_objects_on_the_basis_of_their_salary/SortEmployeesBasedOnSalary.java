// Platform             : QSpiders
// Branch Location      : Bengaluru
// Branch Name          : Basavanagudi
// Course Code          : QCCM11
// Course Name          : Java SE/Core Java
// Faculty              : Mr. Dixith SN
// Author               : Deepjyoti Barman
// Date                 : May 22 (Friday), 2020




import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * It is built to sort Employee objects stored in an ArrayList on the basis of their salary
 * 
 * @author Deepjyoti Barman
 * @since March 29, 2020
 */
class Employee
{
    // Properties
    int empId;
    String empName;
    double salary;
   
    // Constructor: No-argument
    public Employee()
    {
        super();
    }
    
    // Constructor: 3-arguments
    public Employee(int empId, String empName, double salary)
    {
        super();
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Overridden methods of Object class
    @Override
    public String toString()
    {
        return "\n\tEmployee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]\n";
    }

    @Override
    public int hashCode() {
        return new Integer(this.empId).hashCode() + this.empName.hashCode() + new Double(this.salary).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        
        return this.empId == emp.empId &&
               this.empName.equals(emp.empName) &&
               this.salary == emp.salary; 
    }
}

public class SortEmployeesBasedOnSalary
{
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        char choice = 'y';
        ArrayList<Employee> employeeList = new ArrayList<>();
        
        for (int i = 1; choice == 'y' || choice == 'Y'; i++)
        {
            System.out.println("Enter the details of Employee - " +  i);
            System.out.println("----------------------------------\n");
            
            System.out.print("Enter the employee id: ");
            int id = scan.nextInt();
            
            System.out.print("Enter the employee name: ");
            scan.nextLine();
            String name = scan.nextLine();
            
            System.out.print("Enter the salary of the employee: ");
            double salary = scan.nextDouble();
            
            employeeList.add(new Employee(id, name, salary));
            
            System.out.println("\nDo you want to continue (Yes: y / No: n)?");
            choice = scan.next().charAt(0);
            
            System.out.println("\n\n\n");
        }
        
        Comparator<Employee> sortBySalary = (Employee e1, Employee e2) -> (e1.salary == e2.salary ? 0 : (e1.salary > e2.salary ? 1 : -1));
        scan.close();
        
        System.out.println("Employees list in normal order:\n" + employeeList);
        employeeList.sort(sortBySalary);
        System.out.println("\nEmployees list in ascending order of their salary:\n" + employeeList);
    }
}