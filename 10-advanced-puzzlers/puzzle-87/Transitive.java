public class Transitive {
    public static void main(String[] args) throws Exception {
        /*
         * If you can come up with a set of primitive types and values
         * that causes this program to print "true true false", then
         * you have proven that the == operator is not transitive.
         */
        float x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        double z = Integer.MAX_VALUE;
        System.out.print ((x == y) + " ");
        System.out.print ((y == z) + " ");
        System.out.println(x == z);
    }
}
