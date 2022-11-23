import java.util.ArrayList;
import java.util.HashMap;

public class Phone {
    private boolean onOff;
    public String name;
    public String model;
    public int RAM;
    public int storage;
    public int mainCameraResolution;
    public int secondCameraResolution;
    private HashMap<Integer, String> contacts = new HashMap<Integer,String>();

    public Phone() {
        onOff = false;
    }
    public Phone(String name, String model, int RAM, int storage, int mainCameraResolution, int secondCameraResolution) {
        onOff = false;
        this.name = name;
        this.model = model;
        this.RAM = RAM;
        this.storage = storage;
        this.mainCameraResolution = mainCameraResolution;
        this.secondCameraResolution = secondCameraResolution;
    }
    public void onOff() { onOff = !onOff; }
    private boolean checkOn(){
        if (!onOff){
            System.out.println("Your phone is off!");
            return false;
        }
        else return true;
    }
    public void info() {
        System.out.println("\nName: " + name + "\nModel: " + model + "\nRAM: " + RAM + "\nStorage: " + storage + "\nMain camera resolution: " + mainCameraResolution + "\nSecond camera resolution: " + secondCameraResolution);
    }
    public void call(){
        if (checkOn()) System.out.println("Calling!");
    }
    public void photo(){
        if (checkOn()) System.out.println("Take a photo!");
    }
    public void putContact(int number, String name){
        if(checkOn()) contacts.put(number, name);
    }
    public void getContacts(){
        System.out.println(contacts);
    }

}

