import org.junit.Test;
import java.io.FileNotFoundException;

public class TestLoadFunction {

    public int[] sps;

    public int[] massive_builder(String file){
        try {
            sps = Main.fileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            System.exit(1);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
        return sps;
    }
    public int[] sps_1 = massive_builder("one_number.txt");
    public int[] sps_100 = massive_builder("100_numbers.txt");
    public int[] sps_1000 = massive_builder("1000_numbers.txt");
    public int[] sps_10_000 = massive_builder("10000_numbers.txt");
    public int[] sps_100_000 = massive_builder("100_000_numbers.txt");
    public int[] sps_1_000_000 = massive_builder("many_numbers.txt");

    @Test(timeout = 10000)
    public void loadSum_1(){
        for (int i = 0; i < 10000; i++){
            Main._sum(sps_1);
        }
    }

    @Test(timeout = 10000)
    public void loadSum_100(){
        for (int i = 0; i < 10000; i++){
            Main._sum(sps_100);
        }
    }

    @Test(timeout = 10000)
    public void loadSum_1000(){
        for (int i = 0; i < 10000; i++){
            Main._sum(sps_1000);
        }
    }

    @Test(timeout = 10000)
    public void loadSum_10_000(){
        for (int i = 0; i < 10000; i++){
            Main._sum(sps_10_000);
        }
    }

    @Test(timeout = 10000)
    public void loadSum_100_000(){
        for (int i = 0; i < 10000; i++){
            Main._sum(sps_100_000);
        }
    }

    @Test(timeout = 10000)
    public void loadSum_1_000_000(){
        for (int i = 0; i < 10000; i++){
            Main._sum(sps_1_000_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMult_1(){
        for (int i = 0; i < 10000; i++){
            Main._mult(sps_1);
        }
    }

    @Test(timeout = 10000)
    public void loadMult_100(){
        for (int i = 0; i < 10000; i++){
            Main._mult(sps_100);
        }
    }

    @Test(timeout = 10000)
    public void loadMult_1000(){
        for (int i = 0; i < 10000; i++){
            Main._mult(sps_1000);
        }
    }

    @Test(timeout = 10000)
    public void loadMult_10_000(){
        for (int i = 0; i < 10000; i++){
            Main._mult(sps_10_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMult_100_000(){
        for (int i = 0; i < 10000; i++){
            Main._mult(sps_100_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMult_1_000_000(){
        for (int i = 0; i < 10000; i++){
            Main._mult(sps_1_000_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMax_1(){
        for (int i = 0; i < 10000; i++){
            Main._max(sps_1);
        }
    }

    @Test(timeout = 10000)
    public void loadMax_100(){
        for (int i = 0; i < 10000; i++){
            Main._max(sps_100);
        }
    }

    @Test(timeout = 10000)
    public void loadMax_1000(){
        for (int i = 0; i < 10000; i++){
            Main._max(sps_1000);
        }
    }

    @Test(timeout = 10000)
    public void loadMax_10_000(){
        for (int i = 0; i < 10000; i++){
            Main._max(sps_10_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMax_100_000(){
        for (int i = 0; i < 10000; i++){
            Main._max(sps_100_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMax_1_000_000(){
        for (int i = 0; i < 10000; i++){
            Main._max(sps_1_000_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMin_1(){
        for (int i = 0; i < 10000; i++){
            Main._min(sps_1);
        }
    }

    @Test(timeout = 10000)
    public void loadMin_100(){
        for (int i = 0; i < 10000; i++){
            Main._min(sps_100);
        }
    }

    @Test(timeout = 10000)
    public void loadMin_1000(){
        for (int i = 0; i < 10000; i++){
            Main._min(sps_1000);
        }
    }

    @Test(timeout = 10000)
    public void loadMin_10_000(){
        for (int i = 0; i < 10000; i++){
            Main._min(sps_10_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMin_100_000(){
        for (int i = 0; i < 10000; i++){
            Main._min(sps_100_000);
        }
    }

    @Test(timeout = 10000)
    public void loadMin_1_000_000(){
        for (int i = 0; i < 10000; i++){
            Main._min(sps_1_000_000);
        }
    }
}
