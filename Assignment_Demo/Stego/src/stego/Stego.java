package stego;
/**
 * 2D array and file I/O
 */
public class Stego {

    /**
     * convert an array of bits to a String DO NOT MODIFY the method signature
     *
     * @param the bit stream in a byte array
     * @return secret message in String
     */
    private String bitArrayToString(byte[] bitArr) {
        // Your code here

        StringBuilder sMessage = new StringBuilder();
        int base, ASCII;
        // binary to decimal (ASCII value)
        for (int j = 0; j < bitArr.length / 8; j++) {
            base = 1;
            ASCII = 0;

            for (int i = 0; i < 8; i++) {
                ASCII += base * bitArr[8*j + 7 - i];
                base *= 2;
            }
            if (ASCII == 0) {
                break;
            }

            sMessage.append((char)(ASCII));
            
        }

        return sMessage.toString();
        // End of your code
    }

    /**
     * decode the stego image back a String, and prints to console DO NOT MODIFY
     * the method signature
     *
     * @param pgmImage the PGM image to be decoded
     */
    public void decode(PGM pgmImage) {
        // Your code here

        byte[] bitArray = new byte[pgmImage.getHeight() * pgmImage.getWidth()];
        
        //Extract the least significant bit (LSB) of each pixel below
        int[][] Data = pgmImage.getImage();
        for (int i = 0; i < pgmImage.getHeight(); i++) {
            for (int j = 0; j < pgmImage.getWidth(); j++) {
                // LSB of an odd-valued and even-valued pixel is 1 and 0 respectively
                bitArray[i*pgmImage.getWidth()+j] = (byte) (Data[i][j] % 2);
                // Store all extracted bits into a byte array, be careful to the index!
            }
        }

        System.out.println(bitArrayToString(bitArray));
        // Then it prints the hidden message to the console

        // End of your code
    }

    /**
     * main() method, starting point of the Java application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename;

        PGM pgmSimple;
        pgmSimple = new PGM();
        pgmSimple.showImage();
//
//        PGM pgmDefault;
//        pgmDefault = new PGM("MidGray", 40, 30);
//        pgmDefault.showImage();
//
//        filename = "WRONG_FILENAME.ppm";
//        PGM pmgCorrupted;
//        pmgCorrupted = new PGM(filename);
//        pmgCorrupted.showImage();

        //Uncomment the following lines after the bitArrayToString method is implemented (for testing only)
//        Stego testStego = new Stego();
//        byte[] simpleBitArray = {0, 1, 0, 0, 0, 0, 0, 1}; // a value of 65 in binary format
//        System.out.println(testStego.bitArrayToString(simpleBitArray)); // prints "A" after correct implementation

        // Decode java's slogan from java_stego.pgm
        Stego javaStego = new Stego();

//        PGM pgmJava;
//        pgmJava = new PGM("java_stego.pgm");
//        pgmJava.showImage();
//        javaStego.decode(pgmJava);

        // Uncomment the following lines to decode from other PGM as well (for testing)
//        PGM pgmCamMan, pgmPeppers;
//        pgmCamMan = new PGM("cameraman_stego_with_message.pgm");
//        pgmCamMan.showImage();
//        javaStego.decode(pgmCamMan);
//
//        pgmPeppers = new PGM("peppers_stego.pgm");
//        pgmPeppers.showImage();
//        javaStego.decode(pgmPeppers);
        PGM test = new PGM("test.pgm",20,20);
        test.showImage();
        javaStego.decode(test);
    }

}
