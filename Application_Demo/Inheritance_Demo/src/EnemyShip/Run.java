
package EnemyShip;

// CSCI1130 Tutorial
// Inheritance: Run

public class Run {
    public static void main(String[] args) {
        EnemyShip theUFOEnemy = new UFOEnemyShip();
        EnemyShip theRocketEnemy = new RocketEnemyShip();
        // Polymorphism

        theUFOEnemy.enemyShipShoots();
        theRocketEnemy.enemyShipShoots();
    }
}