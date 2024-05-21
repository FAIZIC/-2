import org.junit.Test;
import java.io.FileNotFoundException;

public class TestLoadFunction {

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

    @Test(timeout = 10000)
    public void loadSum(){
        for (int i = 0; i < 1000000; i++){
            Main._sum(sps);
        }
    }

    @Test(timeout = 10000)
    public void loadMult(){
        for (int i = 0; i < 10000000; i++){
            Main._mult(sps);
        }
    }

    @Test(timeout = 10000)
    public void loadMin(){
        for (int i = 0; i < 1000000; i++){
            Main._min(sps);
        }
    }

    @Test(timeout = 1000000000)
    public void loadMax(){
        for (int i = 0; i < 1_000_00; i++){
            Main._max(sps);
        }
    }
}
