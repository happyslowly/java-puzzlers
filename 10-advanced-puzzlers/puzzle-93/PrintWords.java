public class PrintWords {
    public static void main(String[] args) {
        System.out.println(Words.FIRST  + " " + 
                           Words.SECOND + " " +
                           Words.THIRD);
    }
}
// print "the chemistry set"
// reference to constant fields are resolved at compile time
// null is not a compile time constant expression