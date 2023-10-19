import java.util.*;

class Employee{
        int id;
        String Name;
        int Age;
        int Salary;
        char Gender;
        String Address;
        String Designation;


    
}

class EmployeeDetails{
    public static void main(String args[]){
        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = Scn.nextInt();
        Employee [] emp = new Employee[n];
        for(int i=0;i<n;i++){
            emp[i] = new Employee();
            emp[i].id=i+1;
            System.out.println("Enter the details of employee "+(i+1));
            System.out.println("Enter Name");
            emp[i].Name=Scn.next();
            System.out.println("Enter Age");
            emp[i].Age=Scn.nextInt();
            System.out.println("Enter Gender");
            String gen = Scn.next();
            emp[i].Gender=gen.charAt(0);
            System.out.println("Enter Salary");
            emp[i].Salary=Scn.nextInt();
            System.out.println("Enter Address");
            emp[i].Address=Scn.next();
            System.out.println("Enter Designation");
            emp[i].Designation=Scn.next();

        }
        System.out.println("Enter ID of employee to get details");
        int ID = Scn.nextInt();
        for(Employee e : emp ){
            if(ID==e.id){
                //print details
                System.out.println("Employee Details");
                System.out.println("Name : "+e.Name);
                System.out.println("Age : "+e.Age);
                System.out.println("Salary : "+e.Salary);
                System.out.println("Gender : "+e.Gender);
                System.out.println("Address : "+e.Address);
                System.out.println("Designation : "+e.Designation);
            }
        }


    }
}

