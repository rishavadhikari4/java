public class EscapeSequence {
    public static void main(String[] args) {
     
        System.out.println("This is a new line:\nHello, World!");

        System.out.println("Hello\tWorld");

        System.out.println("Hello\rWorld"); 

        System.out.println("This is a backslash: \\");

        System.out.println("This is a single quote: \'");

        System.out.println("This is a double quote: \"");
        
        System.out.println("Hello\bWorld");

        System.out.println("This is a form feed:\fNext line");

        System.out.println("Unicode character: \u0052\u0069\u0073\u0068\u0061\u0076"); // Prints 'Rishav'
    }
}
