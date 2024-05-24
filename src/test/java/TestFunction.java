import static org.junit.Assert.*;
import org.junit.Test;
import java.io.FileNotFoundException;

public class TestFunction {

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

    //Тесты на проверку суммы
    @Test
    public void testSum_zero() {
        try {
            sps = massive_builder("zero.txt");
            assertEquals(0,Main._sum(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testSum_one_number() {
        try {
            sps = massive_builder("one_number.txt");
            assertEquals(-376383632,Main._sum(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testSum_1000_numbers() {
        try {
            sps = massive_builder("1000_numbers.txt");
            assertEquals(-52,Main._sum(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testSum_many_numbers() {
        try {
            sps = massive_builder("many_numbers.txt");
            assertEquals(6598,Main._sum(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    //Тесты на проверку умножения
    @Test
    public void testMult_zero() {
        try {
            sps = massive_builder("zero.txt");
            assertEquals(0,Main._mult(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMult_one_number() {
        try {
            sps = massive_builder("one_number.txt");
            assertEquals(-376383632,Main._mult(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMult_1000_numbers() {
        try {
            sps = massive_builder("1000_numbers.txt");
            assertEquals(0,Main._mult(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMult_many_numbers() {
        try {
            sps = massive_builder("many_numbers.txt");
            assertEquals(3000000,Main._mult(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    //Тесты на проверку Максимума
    @Test
    public void testMax_zero() {
        try {
            sps = massive_builder("zero.txt");
            assertEquals(0,Main._max(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMax_one_number() {
        try {
            sps = massive_builder("one_number.txt");
            assertEquals(-376383632,Main._max(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMax_1000_numbers() {
        try {
            sps = massive_builder("1000_numbers.txt");
            assertEquals(5,Main._max(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMax_many_numbers() {
        try {
            sps = massive_builder("many_numbers.txt");
            assertEquals(5000,Main._max(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    //Тесты на проверку минимума
    @Test
    public void testMin_zero() {
        try {
            sps = massive_builder("zero.txt");
            assertEquals(0,Main._min(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMin_one_number() {
        try {
            sps = massive_builder("one_number.txt");
            assertEquals(-376383632,Main._min(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMin_1000_numbers() {
        try {
            sps = massive_builder("1000_numbers.txt");
            assertEquals(-5,Main._min(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }

    @Test
    public void testMin_many_numbers() {
        try {
            sps = massive_builder("many_numbers.txt");
            assertEquals(1,Main._min(sps));
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Выход за границы типа");
            System.exit(1);
        }
    }


}
