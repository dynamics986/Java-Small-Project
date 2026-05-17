
package EnemyShip;

// CSCI1130 Tutorial
// Inheritance: Factory Pattern 

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip( String newShipType ) {
        if (newShipType.equals("U"))
            return new UFOEnemyShip();
        else
        if (newShipType.equals("R"))
            return new RocketEnemyShip();
        else return null;
    }
    
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy1 = shipFactory.makeEnemyShip("U");
        EnemyShip theEnemy2 = shipFactory.makeEnemyShip("R");
        
        theEnemy1.doStuffEnemy();
        theEnemy2.doStuffEnemy();

    }
} 

