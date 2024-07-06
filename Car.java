class Vechicle{
    public void drive(){
        System.out.println("Hello From Vechicle");
    }
}
class Bike extends Vechicle{
    public void drive(){
        System.out.println("Repairing car");
    }
}


public class Car {
    public static void main(String[] args) {

        Vechicle v1 = new Vechicle();
        Bike b1 = new Bike();

        v1.drive();
        b1.drive();
    }
    
}
