public class SelfInterruption {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();

        if (Thread.interrupted()) {
            System.out.println("Interrupted: " + Thread.interrupted());
        } else {
            System.out.println("Not interrupted: " + Thread.interrupted());
        }
    }
}
// print "Interrupted: false"
// Thread.interrupted() clear the interrupted status
// Use Thread.currentThread().isInterrupted() instead.
