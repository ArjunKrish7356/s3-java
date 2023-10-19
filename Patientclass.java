import java.util.*;

class Patient{
 int id,age;
 String BloodData;
 
 public Patient(){
  id=0;
  age=0;
  BloodData="0";
 }

 Patient(int ID,int Age,String bloodData){
    id=ID;
    age=Age;
    BloodData=bloodData;
 }
}
class Patientclass{
    public static void main(String args[]){
        Patient p1= new Patient(1,20,"O+");
        System.out.println("Id : "+p1.id);
        System.out.println("Age : "+p1.age);
        System.out.println("Blood Group : "+p1.BloodData);
    }
}