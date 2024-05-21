import static org.junit.Assert.*;
import org.junit.Test;
import java.io.FileNotFoundException;

public class TestFunction {

    public static int[] sps;

    static {
        try {
            sps = Main.fileReader();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            System.exit(1);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }


    @Test
    public void testSum() {
        try {
            assertEquals(10,Main._sum(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMult() {
        try {
            assertEquals(18,Main._mult(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMin() {
        try {
            assertEquals(1,Main._min(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMax() {
        try {
            assertEquals(6,Main._max(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }
}