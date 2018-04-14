public class Employee
{
  public Employee()                        // defining a constructor
  {
    System.out.println("OK 1");
  }
  public static void main(String args[])
  {
    Employee emp1 = new Employee();        // creating object to call the constructor
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
  }
}
