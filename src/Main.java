import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String name, model;
        int RAM, Storage, mainCameraResolution, secondCameraResolution;
        Scanner s = new Scanner(System.in);

        Phone p2 = new Phone("Google", "Pixel 7 pro", 12, 128, 50, 12);
        //p2.putContact(632004672, "Bogdan");
        //p2.putContact(632004672, "Bogdan");
        //p2.getContacts();
        while (true) {
            System.out.println("My phone: \n1. ON/OFF phone \n2. Photo \n3. Call \n4. Add contact \n5. Get contacts \n9. Phone info \n0. Setup phone \nEnter action:");
            int n = s.nextInt();
            if(n == 99) break;

            switch (n) {
                case 1:
                    p2.onOff();
                    break;
                case 2:
                    p2.photo();
                    break;
                case 3:
                    p2.call();
                    break;
                case 4:
                    p2.putContact(632004672, "Tamir");
                    p2.putContact(632004672, "Bogdan");
                    break;
                case 5:
                    p2.getContacts();
                case 9:
                    p2.info();
                    break;
                case 0:
                    System.out.println("Enter name: ");
                    name = s.nextLine();
                    System.out.println("Enter model: ");
                    model = s.nextLine();
                    System.out.println("Enter RAM: ");
                    RAM = s.nextInt();
                    System.out.println("Enter storage: ");
                    Storage = s.nextInt();
                    System.out.println("Enter main camera: ");
                    mainCameraResolution = s.nextInt();
                    System.out.println("Enter second camera: ");
                    secondCameraResolution = s.nextInt();

                    Phone p1 = new Phone(name, model, RAM, Storage, mainCameraResolution, secondCameraResolution);
                    break;
                default:
                    System.out.println("You not choise any action!");
                    break;
            }

            System.out.print("\033[H\033[2J");
        }*/
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter numbers: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(i, s.nextInt());
        }
        System.out.println(numbers);
        System.out.print("Rename member: ");
        int m = s.nextInt();

        Random r = new Random();
    }
}