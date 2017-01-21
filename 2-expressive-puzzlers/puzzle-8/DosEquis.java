public class DosEquis {
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.print(true ? x : 0);
        System.out.print(false ? i : x);
    }
}
// line 5: 0 is constant, return original type of 'x'
// line 6: promote x to int, which is 88