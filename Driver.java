package Format;

public class Driver {
    protected String name; //atribut
    protected int price;

    public Driver(String name, int price) { //Konstruktor
        this.name = name;
        this.price = price;
    }
    
    public void displayInfo() { //method prosedur untuk meng input data driver
        System.out.println("Driver Name: " + name);
        System.out.println("Price per Trip:Rp." + price);
    }
    
    public void drive(String pickupLocation, String destination) { // method prosedur untuk menampilkan informasi lagi yang lebih signifikan
        System.out.println("Driver " + name + " Sedang Menuju Lokasi Anda " + pickupLocation + ".");
        System.out.println("Total Harga:Rp." + price);
    }
}