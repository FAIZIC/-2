import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int[] fileReader() throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "User" + separator + "Desktop" + separator + "file.txt";
        File file = new File(path);
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    public static int _min(int[] sps){
        int minim = sps[0];
        for (int i = 1; i < sps.length; i++){
            if (sps[i] < minim){
                minim = sps[i];
            }
        }
        return minim;
    }

    public static int _max(int[] sps){
        int maxim = sps[0];
        for (int i = 1; i < sps.length; i++){
            if (sps[i] > maxim){
                maxim = sps[i];
            }
        }
        return maxim;
    }
    public static int _sum(int[] sps) {
        int summ = sps[0];
        for (int i = 1; i < sps.length; i++){
            summ += sps[i];
        }
        return summ;
    }

    public static int _mult(int[] sps) {
        int mult = sps[0];
        for (int i = 1; i < sps.length; i++){
            mult *= sps[i];
        }
        return mult;
    }

    public static void main(String[] args) throws FileNotFoundException {
        org.junit.runner.JUnitCore.main("TestLoadFunction");
        org.junit.runner.JUnitCore.main("TestFunction");
    }
}