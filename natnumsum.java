import java.util.*;
class sum{
 public static void main(String args[]){
  System.out.println("Enter the number upto which sum is to be found : ");
  Scanner Scn= new Scanner(System.in);
  int n= Scn.nextInt();
  int sum=0;
  for(int i=1;i<=n;i++){
   sum=sum+i;
  }
  System.out.println("The sum of first " +n+ " numbers are : "+sum );
 }
}
