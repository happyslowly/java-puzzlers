public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println(0xcafebabe);
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabe));
    }
}
// 0xcafebabe is a negative number
// when it is converted to long, java performs sign extension
