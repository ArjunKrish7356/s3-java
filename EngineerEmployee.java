
class Employee{
    int Salary=10000;

    void display(){
        System.out.println("Employee Class");
    }

    void Calc_salary(){
        System.out.println("Salary of employee : "+Salary );
    }
}

class Engineer extends Employee{
    int Salary= 20000;


    void Calc_salary(){
        System.out.println("Engineer Salary is : "+Salary);
        super.Calc_salary();
    }
}
class EngineeerEmployee{
    public static void main(String[] args) {
        Engineer Eng= new Engineer();

        Eng.display();
        Eng.Calc_salary();
};