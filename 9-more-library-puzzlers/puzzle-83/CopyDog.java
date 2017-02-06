import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CopyDog {
    public static void main(String[] args) {
        Dog newDog = (Dog)deepCopy(Dog.INSTANCE); // You figure out what to put here

        // This line should print false
        System.out.println(newDog == Dog.INSTANCE);

        // This line should print "Woof"
        System.out.println(newDog);
    }

    public static Object deepCopy(Object obj) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            new ObjectOutputStream(bos).writeObject(obj);
            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
            return new ObjectInputStream(bin).readObject();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
// singleton class that implements "Serializable" must have a "readResolve" method to returns its sole instance
