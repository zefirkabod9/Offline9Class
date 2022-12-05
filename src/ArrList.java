import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class ArrList {
    static double disco(double a, double b, double c) {
        return Math.pow(2, b) - 4 * a * c;
    }
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        HashMap<Integer, String> numbers = new HashMap<>();

        int phone = 0;
        String name = "";

        while (true) {
            System.out.println("1-Add user \n2-Delete user \n3-Call user \n4-Info");
            System.out.print("Enter action: ");
            int n = s.nextInt();

            switch (n) {
                case 1 -> System.out.print("Enter user number: ");
                phone = s.nextInt();
                System.out.print("Enter user name: ");
                name = s.next();
                numbers.put(phone, name);
                case 2 -> System.out.print("Enter user number: ");
                phone = s.nextInt();
                case 3 ->
                case 4 ->
                default ->
            }
        }*/

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = s.nextInt();
        System.out.print("Enter b: ");
        double b = s.nextInt();
        System.out.print("Enter c: ");
        double c = s.nextInt();

        if (disco(a,b,c) < 0){
            System.out.println("No answer!");
        }
        else {
            double x1 = (-b + Math.sqrt(disco(a,b,c)))/(2 * a);
            double x2 = (-b - Math.sqrt(disco(a,b,c)))/(2 * a);
            System.out.print("Answer X1: " + x1 + "\nAnswear X2: " + x2);
        }
    }
}
