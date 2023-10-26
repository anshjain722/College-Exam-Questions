/*Create a class called Employee that includes three pieces of information as instance
 * variables -- a first name (type String),a last name (type String) and a monthly Salary
 * (double). Your class should have a constructor that initializes the three instance variables.
 * If the monthly salary is not positive, set it to 0.0.
 * Write a test application named EmployeeTest that demonstrates class Employee's capabilities
 * Create two Employee object and display each object's yearly salary. Then give each
 * Employee a 10% raise and display each objects's yearly salary again */

class Employee{
    String first_name;
    String last_name;
    double monthlySalary;

    public Employee(String first_name,String last_name,double monthlySalary){
        this.first_name = first_name;
        this. last_name = last_name;
        this.monthlySalary = monthlySalary;
    }

    public double yearlySalary(){
        return monthlySalary * 12;
    }

    public double giveRaise(int percentage){
        return monthlySalary += monthlySalary * (percentage/100);
    }
}
//Portion Remaining