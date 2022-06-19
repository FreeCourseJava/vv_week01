package src.main.java;

public class CharSandbox {

    public static void main(String[] args) {
        testChar ('á');
        testChar ('\u03A9');
        testChar ('1');
    }

    private static void testChar(char c) {
        System.out.println("Char: '" + c + "'");
        System.out.println("Numeric value: " + ((int)c));
        System.out.println( "'" + c + "'" + " + 5: '" + (char) (c + 5) + "'");
        System.out.println("Numeric value of '" + c + "'" + " + 5: " + (c + 5) );
        System.out.println("");
    }
}
