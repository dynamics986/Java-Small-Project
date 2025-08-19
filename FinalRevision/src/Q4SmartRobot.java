public class Q4SmartRobot extends Q4FlyingRobot {
   private String lang;

   public Q4SmartRobot(int e, String n, String l) {
      super(e, n);
      this.lang = l;
   }

   @Override
   public void charge(int e) {
      energy += e;
      System.out.println("Smart Charged: " + energy);
   }

   public void program() {
      System.out.println("Program using: " + lang);
   }
}