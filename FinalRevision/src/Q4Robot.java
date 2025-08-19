public class Q4Robot {
   protected int energy;
   protected String name;

   public Q4Robot(int e, String n) {
      this.energy = e;
      this.name = n;
   }

   public void move() {
      System.out.println("Walk");
      energy -= 5;
   }

   public void charge(int e) {
      energy += e;
      System.out.println("Super charged: " + energy);
   }
}