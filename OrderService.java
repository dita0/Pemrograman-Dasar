package Format;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    private Scanner scanner; // variabel untuk mendeklarasikan scanner dan array
    private ArrayList<Driver> drivers;

    public OrderService() { // konstruktor
        scanner = new Scanner(System.in); //membuat objek scanner dengan input Systemin
        drivers= new ArrayList<>(); // memmbuat objek di variabel drivers
        
        drivers.add(new MotorDriver("Jamal", 10000)); // menambahkan objek
        drivers.add(new MobilDriver("Irwansyah", 20000));
    }

    public void processOrder() { //output yang akan di tampilkan
        System.out.println("***Welcome to Easy Go!!!***");
        System.out.print("Lokasi Penjemputan: ");
        String pickupLocation = scanner.nextLine(); //untuk membaca input & dan untuk membaca baris berikutnya
        System.out.print("Lokasi Tujuan: ");
        String destination = scanner.nextLine();

        Driver selectedDriver = selectDriver(); //menyimpan objek Driver ke var selectDriver, selectedDriver(untuk memilih driver)

        selectedDriver.drive(pickupLocation, destination); // memanggil drive() untuk mengkoordinasikan tindakan
    } 

    private Driver selectDriver() { // output di console
        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.print("Pilihan Anda (1/2): ");
        int choice = scanner.nextInt(); // variabel penerima input angka

        if (choice == 1) { // percabangan, jika meng input angka 1 maka
            return drivers.get(0); // akan mengembalikan objek pada indeks 0
        } else if (choice == 2) {
            return drivers.get(1);
        } else { // jika bukan meng inputkan 1 atau 2 maka tidak akan valid
            System.out.println("Pilihan tidak valid, silakan pilih kembali.");
            return selectDriver();
        }
    }

    public void close() { //method untuk memberhentikan objek scanner
        scanner.close();
    }
}
