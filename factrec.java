import java.util.*;
class factorial{
    static int factorial(int n){
        if(n==0){
           return 1;
        }
        else{
            return n*factorial(n-1); 
        }
    }
}
class factrec{
    public static void main(String args[]){
        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Scn.nextInt();
        factorial fact= new factorial();
        int ans=fact.factorial(n);
        System.out.println(ans);
    }
}