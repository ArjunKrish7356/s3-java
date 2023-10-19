import java.util.*;
class palnum
{
 public static void main(String args[])
 {
   int n,d,rev=0,rem;
   Scanner Scn = new Scanner(System.in);
   System.out.println("Enter the No :");
   n=Scn.nextInt();
   d=n;
   System.out.println("d is : "+d);
   while(n>0)
   {
     rem = n%10;
     rev= rev*10+rem;
     n=n/10;
     System.out.println(n + " : " +d);
   }
   if(d==rev)
   {
   System.out.println("Is palindrome");
   }
   else
   {
   System.out.println("not a palindrome");
   }
 }
}
