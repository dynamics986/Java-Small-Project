package oop_research;

/**
 *
 * @author fansixing
 */
public class OOP_Research {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         new Vehicle().move();
//        
//        new Lorry().move();
//        
//        new Bus().stop();
//        
//        new ElectricBus().stop();
//        
//        new ElectricBus().charge();

//        ((Vehicle) new Bus()).stop();
//        
//        ((Vehicle) new ElectricBus()).stop();
//        
//        System.out.println(new Vehicle[3] instanceof Transport[] );
//        System.out.println(new Lorry() instanceof Bus );// cannot be compiled
//        
//        
//        System.out.println(new Bus[3] instanceof Transport[]);
//        
//        System.out.println(new Bus() instanceof Chargeable );
//        
//        System.out.println(new Transport[3] instanceof Chargeable[]); 
//        
//        System.out.println(new Chargeable[3] instanceof Transport[] );
        Vehicle[] vs = new Vehicle[2];
        for (int i = 1; i <= 2; i++) {
            try {
                vs[i] = new Vehicle();
                System.out.println("S");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("error");
                System.out.println(e);
            }
        }
    }
}

class Vehicle implements Transport {

    public void move() {
        System.out.println("V");
    }

    public void stop() {
        System.out.println("T");
    }
}

class Lorry extends Vehicle {

    public void move() {
        System.out.println("L");
    }
}

class Bus extends Vehicle {

    public void stop() {
        System.out.println("B");
    }
}

class ElectricBus extends Bus implements Chargeable {

    public void stop() {
        System.out.println("H");
    }

    public void charge() {
        System.out.println("C");
    }
}

interface Transport {

    public void move();

    public void stop();
}

interface Chargeable {

    public void charge();

    public void stop();
}
