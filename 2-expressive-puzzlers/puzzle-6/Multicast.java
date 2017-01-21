public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
    }
}
// (byte) -1 -> 11111111
// (char) 11111111 -> 11111111 11111111
// (int) 11111111 11111111 -> 00000000 00000000 11111111 11111111 (because char is unsigned)
// it is 65535