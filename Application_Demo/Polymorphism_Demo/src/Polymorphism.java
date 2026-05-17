
public class Polymorphism {

    public static void main(String[] args) {
        Octopus MichaelCard = new Octopus("Michael Card", 50);
        MichaelCard.useValue(23);
        MichaelCard.addValue(30);

        Octopus MichaelWatch = new OctopusWatch("Michael Watch", 50);
        MichaelWatch.useValue(23);
        MichaelWatch.addValue(30);

        System.out.println("device array testing:");
        Octopus[] devices = new Octopus[5];
        devices[0] = MichaelCard;
        devices[1] = new OctopusWatch("Watch 1", 20);
        devices[2] = new OctopusWatch("Watch 2", 20);
        devices[3] = new Octopus("Card 3", 15);
        devices[4] = new Octopus("Card 4", 25);

        devices[0].useValue(8);
        devices[1].useValue(8);
        devices[2].useValue(8);
        devices[3].useValue(8);
        devices[4].useValue(8);

    }
}
