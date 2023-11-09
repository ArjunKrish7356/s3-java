abstract class Shapes{
    abstract void numberOfsides();
}

class Rectangle extends Shapes{
    void numberOfsides(){
        System.out.println(" Number of sides : 4 ");
    }
}

class Triangle extends Shapes{
    void numberOfsides(){
        System.out.println(" Number of sides : 3 ");
    }
}

class Hexagon extends Shapes{
    void numberOfsides(){
        System.out.println(" Number of sides : 6 ");
    }
}

class Main{
    public static void main(String[] args) {
        Shapes s = new Rectangle();
        s.numberOfsides();
        
        s = new Triangle();
        s.numberOfsides();
        
        s = new Hexagon();
        s.numberOfsides();
    }
}