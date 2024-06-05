package Format;

public class MobilDriver extends Driver{
    public MobilDriver(String name, int price) { // memanggil konstruktor di class driver
        super(name, price);
    }

    @Override // polimorfisme dynamic
    public void drive(String pickupLocation, String destination) {
        System.out.println("Driver " + name + " Sedang Menuju Lokasi Anda " + pickupLocation + ".");
        System.out.println("Total Harga:Rp." + price);
        System.out.println("__Driver berpengalaman, dan sudah di pastikan Perjalanan anda nyaman, dan selamat sampai tujuan__");
    }
}