package Format;

public class MotorDriver extends Driver{
    public MotorDriver(String name, int price) {
        super(name, price);
    }

    @Override
    public void drive(String pickupLocation, String destination) {
        System.out.println("Driver " + name + " Sedang Menuju Lokasi Anda " + pickupLocation + ".");
        System.out.println("Total Harga:Rp." + price);
        System.out.println("Driver motor berpengalaman, Cepat dan Efisien untuk perjalanan Singkat.");
    }
}