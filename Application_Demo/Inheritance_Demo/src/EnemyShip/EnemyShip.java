package EnemyShip;

// CSCI1130 Tutorial
// Inheritance: Superclass - EnemyShip

public abstract class EnemyShip {
    protected String name;
    protected double amtDamage;

    public void followHeroShip() {
        System.out.println( this.name + " is following the hero.");
    }
    
    public void displayEnemyShip() {
    System.out.println( this.name + " is on the screen.");
    }
    
    public void enemyShipShoots() {
        System.out.println(this.name + " attacks and does " +
                                      this.amtDamage + " damage to hero.");
    }

    public void doStuffEnemy() {
        displayEnemyShip();
        followHeroShip();
        enemyShipShoots();
    }

}
