
class Array {

    public static void main(String[] args) {
        int[] i;
        i = new int[10];

        for (int k = 0; k < 8; k++) {
            i[k] = k * k;
        }
        i[8] = -6;
        i[9] = +6;

        try {
            i[9] = 21;
            i[999] = 28;
            i[88] = 0;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
        }

        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("Mailbox " + count + " stores " + i[count]);
        }

        System.out.println("Length of the array i = " + i.length);
    }
}
