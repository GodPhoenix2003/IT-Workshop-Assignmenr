import java.util.*;
public class Prog11 {
    public static void main(String []args){
        Employee x = new Employee();
        x.input();
        System.out.println("The gross salary of the employee is: " + x._gross_());
    }
}

class Employee{
    int emp_id, basic_salary, allowance;
    String emp_name;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employee id: ");
        emp_id = in.nextInt();
        System.out.print("Enter the employee name: ");
        in.nextLine();
        emp_name = in.nextLine();
        System.out.print("Enter the basic salary of the employee: ");
        basic_salary = in.nextInt();
        System.out.print("Enter the net allowance of the employee: ");
        allowance = in.nextInt();
        in.close();
    }
    public int _gross_(){
        return(basic_salary + allowance);
    }
}
