class ImportDuty {
    public static void main(String[] args) {
        printArgs(1, 2, 3, 4, 5);
    }

    static void printArgs(Object... args) {
//        System.out.println(toString(args));
    }
}
// won't compile,
// members are naturally in scope take precedence over static imports