class Octopus extends Object {

    public String cardHolderName;
    protected double value;
    
    private double cardWidth;
    private double cardHeight;

    public Octopus()
    {
        super();
        
        
        cardHolderName = "No Name";
        value = 50;
    }
   
    // constructor
    public Octopus(String holderName, double initialValue) {
        super();
        cardHolderName = holderName;
        value = initialValue;
        cardWidth = 10;
        cardHeight = 7;
    }

    // public methods
    // println(this) means println(this.toString())
    public void useValue(double amount) {
        System.out.println(this + " SUPERCLASS useValue HK$" + amount);
        value -= amount;
    }

    public void addValue(double amount) {
        System.out.println(this + " SUPERCLASS addValue HK$" + amount);
        value += amount;
        
        // stretch your card
        cardWidth *= 1.1;
        
    }

    // private method
    private void resetValue() {
        value = 0;
    }

    // override the toString() method inherited from class Object (implicit grand-superclass)
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " object holder \"" + cardHolderName + "\" with HK$" + value;
    }

    public static void main(String[] args) {
        Octopus MichaelCard = new Octopus("Michael Card", 50);
        MichaelCard.useValue(23);
        MichaelCard.addValue(30);
    }
}
