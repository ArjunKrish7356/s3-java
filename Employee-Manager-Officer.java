import java.util.*;

class Employee{
    String  name;
    int age;
    String address;
    long pn;  //phone number
    int salary;

    void printsalary(){
        System.out.print(salary);
    }
}
class Officer extends Employee{
    String specilisation;
}
class Manager extends Employee{
    String department;
}

class Main{
     public static void main(String[] args) {
        System.out.println("Enter the number of Employees : ");
        Scanner Scn = new Scanner(System.in);
        int n= Scn.nextInt();     // n is the variable that stores the number of employees
        Employee emp[] = new Employee[10]; 
        for(int i=1;i<=n;i++){
            emp[i]= new Employee();
            System.out.println("Enter the name of employee"+i+" : ");
            emp[i].name=Scn.next();
            System.out.println("Enter the age of the employee"+i+" : ");
            emp[i].age=Scn.nextInt();
            System.out.println("Enter the address of the employee"+i+" : ");
            emp[i].address=Scn.next();
            System.out.println("Enter the phonenumber of the employee"+i+" : ");
            emp[i].pn=Scn.nextInt();
            System.out.println("Enter the salary of the employee"+i+" : ");
            emp[i].salary=Scn.nextInt();
        }
        System.out.println("Enter the details of Manager : ");      //Details of manager
        Manager man= new Manager();
        System.out.println("Enter the name of Manager : ");
        man.name = Scn.next();
        System.out.println("Enter the age of the Manager : ");
        man.age = Scn.nextInt();
        System.out.println("Enter the address of the Manager : ");
        man.address = Scn.next();
        System.out.println("Enter the phonenumber of the Manager : ");
        man.pn = Scn.nextInt();
        System.out.println("Enter the salary of the Manager : ");
        man.salary = Scn.nextInt();
        System.out.println("Enter the department of the Manager : ");
        man.department = Scn.next();
        
        System.out.println("Enter the details of Officer : ");      //Details of officer
        Officer officer= new Officer();
        System.out.println("Enter the name of Officer : ");
        officer.name = Scn.next();
        System.out.println("Enter the age of the Officer : ");
        officer.age = Scn.nextInt();
        System.out.println("Enter the address of the Officer : ");
        officer.address = Scn.next();
        System.out.println("Enter the phonenumber of the Officer : ");
        officer.pn = Scn.nextInt();
        System.out.println("Enter the salary of the Officer : ");
        officer.salary = Scn.nextInt();
        System.out.println("Enter the specilisation of the Officer : ");
        officer.specilisation = Scn.next();
        
        System.out.println("The Salary of all are : ");
        for(int i=1;i<=n;i++){
          System.out.println("Salary of employee"+i +" is : ");
          emp[i].printsalary();
        }
        System.out.println("Salary of manager is :");
        man.printsalary();
        System.out.println("Salary of Officer is : " );
        officer.printsalary();
     }
} 