import java.io.PrintStream;

public class PrintStream1 {
    public static void main(String args[]) {
        PrintStream out = new PrintStream(System.out);
        out.printf("Formatted output: %s, %d%n", "Hello", 123);
    }
}
