class OctopusWatch extends Octopus {
    // inherits fields and methods from class Octopus

    private double watchDiameter;

    // constructor
    public OctopusWatch(String holderName, double initialValue) {
        // Octopus(holderName, initialValue);
        
        // super();

        
         super(holderName, initialValue);
        
        // am I responsible for initializing those inherited fields?
        
        watchDiameter = 5;
//        cardWidth = cardHeight = -1;   // can't access private field
    }
    
    // override the useValue() method inherited from Octopus
    // to demonstrate polymorphism in class Lecture10cPolymorphism
    @Override
    public void useValue(double amount) {
        System.out.println(this + " SUBCLASS useValue 90% x HK$" + amount);
        value -= amount * 0.9;
    }

    // override the addValue() method inherited from Octopus
    // demonstrate using super.addValue() to call original version of superclass method
    // to demonstrate polymorphism in class Lecture10cPolymorphism
    @Override
    public void addValue(double amount) {
        System.out.print(this + " SUBCLASS addValue HK$" + amount + ": ");
        super.addValue(amount);
    }

    // resetValue() is private in superclass, thus NOT inherited
    // create its own method to override/replace the private method in the super class
    public void resetValue() {
        value = 0;
    }

    // re-declaration
    public double cardWidth;  // this one has NO relationship with the ONE in your superclass
    
    public static void main(String[] args) {
        
        Octopus  newCard;
        newCard = new Octopus("Test Card", 50);
        newCard.addValue(100);
        
        OctopusWatch MichaelWatch = new OctopusWatch("Michael Watch", 50);
        MichaelWatch.cardWidth = 13;
        
        
        MichaelWatch.useValue(13);
        MichaelWatch.addValue(30);
        MichaelWatch.resetValue();
    }
}
