public class AnimalFarm {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        System.out.println("Animals are equal: "
                + pig == dog);
    }
}
// false, '==' is lower than '+'
// pig and dog are different objects, even though pig is interned.
