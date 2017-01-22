import java.util.Random;

public class Rhymes {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        StringBuffer word = null;
        switch (rnd.nextInt(2)) {
            case 1:
                word = new StringBuffer('P');
            case 2:
                word = new StringBuffer('G');
            default:
                word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
// three issues:
// rnd.nextInt(2) returns [0, 2), it is inclusive and exclusive
// no constructor StringBuffer(char c), So char c will be promoted to int, which is capacity
// missing break in case