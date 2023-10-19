import java.util.*;

class Multiplication{
 public static void main( String args[])
 {
  int m,n,p,q;
  int a[][] = new int [10][10];
  int b[][] = new int [10][10];
  int c[][] = new int [10][10];
  Scanner Scn= new Scanner(System.in);
  System.out.println("Enter the sizes m and n of matrix 1");
  m=Scn.nextInt();
  n=Scn.nextInt();
  System.out.println("Enter the elements of matrix 1");
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   {
    a[i][j]=Scn.nextInt();
    System.out.print(" ");
   }
   System.out.println("");
  }
  
  System.out.println("Enter the sizes p and q of matrix 2");
  p=Scn.nextInt();
  q=Scn.nextInt();
  System.out.println("Enter the elements of matrix 2");
  for(int i=0;i<p;i++)
  {
   for(int j=0;j<q;j++)
   {
    b[i][j]=Scn.nextInt();
    System.out.print("\t");
   }
   System.out.print("\n");
  }
  if(m==q && n==p)
  {
   for(int i=0;i<m;i++)
  {
    for(int j=0;j<q;j++)
     { 
      int sum=0;
      for(int k=0;k<n;k++)
      {
       sum+=a[i][k]*b[k][j];
      }
      c[i][j]=sum;
      System.out.print(" ");
     }
   System.out.println("");
  }
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<q;j++)
   {
    System.out.print(c[i][j]);
    System.out.print(" ");
   }
   System.out.println("");
  }
  
  }
  else
  {
   System.out.println("Multiplication not possible ");
  }
  }
  }
