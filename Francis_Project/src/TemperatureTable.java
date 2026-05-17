class TemperatureTable {

    /**
    * Displays a simple table converting Celsius to Fahrenheit for a given range.
    * Illustrates using the loop variable in expressions in the loop
    */
    public static void PrintTemperatureTable() {
        System.out.println("Temperature Conversion Table");
        System.out.println("============================");
        System.out.println();
        System.out.println("C\tF");
        for (int c = 0; c <= 38; c++) {
            System.out.println(c + "\t" + Math.round(c * 9.0 / 5 + 32));
        }
    }

    public static void main(String[] args) {
        PrintTemperatureTable();
    }
}
