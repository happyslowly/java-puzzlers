package p67;

public class StrungOut {
    public static void main(String[] args) {
        String s = new String("Hello world");
        System.out.println(s);
    }
}

class String {
    private final java.lang.String s;

    public String(java.lang.String s) {
        this.s = s;
    }

    public java.lang.String toString() {
        return s;
    }
}
// line 4, it is not the main method, because the parameter is not the java.lang.String
// Avoid reusing the names of platform classes, and never reuse class names from java.lang