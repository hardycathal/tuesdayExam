package ie.atu;
import java.io.IOException;
import java.util.Scanner;



public class ShiftWorkerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShiftWorker worker = new ShiftWorker();


        ShiftWorker worker2 = new ShiftWorker("Roisin","Woman",22,1);
        System.out.println(worker2.toString());





    }
}