import java.util.Calendar;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private static final int CURRENT_YEAR =
            Calendar.getInstance().get(Calendar.YEAR);
    private final int beltSize;

    private Elvis() {
        beltSize = CURRENT_YEAR - 1930;
    }

    public static void main(String[] args) {
        System.out.println("Elvis wears a size " +
                INSTANCE.beltSize() + " belt.");
    }

    public int beltSize() {
        return beltSize;
    }
}
// CURRENT_YEAR is initialized after INSTANCE, which is still 0 (default value)