public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        Object x = "Buy ";
        String i = "Effective Java";

        x = x + i;  // Must be LEGAL
        x += i;     // Must be ILLEGAL
    }
}
// It is still legal under Java 7...
