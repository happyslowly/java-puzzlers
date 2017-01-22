public class Thrower {
    private static Throwable t;

    private Thrower() throws Throwable {
        throw t;
    }

    public static void main(String[] args) {
        sneakyThrow(new Exception("This is a checked exception"));
    }

    /*
     * Provide a body for this method to make it throw the specified exception.
     * You must not use any deprecated methods.
     */
    public static void sneakyThrow(Throwable t) {
        Thrower.t = t;
        try {
            Thrower.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            Thrower.t = null;
        }
    }
}
