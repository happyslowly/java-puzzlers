public class Outer {
    public static void main(String[] args) throws Exception {
        new Outer().greetWorld();
    }

    private void greetWorld() throws Exception {
        System.out.println(Inner.class.newInstance());
    }

    public class Inner {
        public String toString() {
            return "Hello world";
        }
    }
}
// throw NoSuchMethodException.
// The signature of the default constructor for Inner is:
// Inner(Outer outer)
