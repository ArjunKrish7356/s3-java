class Test{
    static void finalise(){
       System.out.println("test obj");
    } 
}

class Main{
    public static void main(String[] args) {
        Test t1=new Test();
        t1.finalise();
        t1=null;
        System.finalise
        t1.finalise();
    }
}