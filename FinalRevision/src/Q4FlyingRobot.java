public class Q4FlyingRobot extends Q4Robot {
   public Q4FlyingRobot(int e, String n) {
      super(e, n);
   }

   @Override
   public void move() {
      System.out.println("Fly");
      energy -= 10;
   }

   @Override
   public void charge(int e) {
      e = e / 2;
      System.out.print("Flying uses ");
      super.charge(e);
   }
}
