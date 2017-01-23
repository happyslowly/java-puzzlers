package p48;

class Dog {
    public static void bark() {
        System.out.print("woof ");
    }
}

class Basenji extends Dog {
    public static void bark() {
    }
}

public class Bark {
    public static void main(String args[]) {
        Dog woofer = new Dog();
        Dog nipper = new Basenji();
        woofer.bark();
        nipper.bark();
    }
}
// both line invoke bark() inside the Dog
// static method is not dynamic binding
// Never qualify a static method invocation with an expression(instance name)