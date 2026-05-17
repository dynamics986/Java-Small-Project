class ContinueDemo {

    private static void whileDemo() {
        System.out.println("This is the while-continue demo.");
        int i;
        i = 0;
        while (i <= 8) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.print(i);  // when i == 5, this line is skipped
        }
        System.out.println();
    }

    private static void do_whileDemo() {
        System.out.println("This is the do_while-continue demo.");
        int i;
        i = 0;
        do {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.print(i);  // when i == 5, this line is skipped
        } while (i <= 8);
        System.out.println();
    }

    private static void forDemo() {
        System.out.println("This is the for-continue demo.");
        int i;
        for (i = 1; i <= 9; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i);  // when i == 5, this line is skipped
        }
        System.out.println();
    }

    public static void main(String[] args) {
        whileDemo();
        do_whileDemo();
        forDemo();
    }
}
