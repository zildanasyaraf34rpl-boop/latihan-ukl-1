
import java.util.Scanner;

public class HitungBiayaEkspedisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("hitung biaya ekspedisi");

        System.out.print("masukkan berat paket (Kg): ");
        double berat = input.nextDouble();

        System.out.print("masukkan jarak pengiriman (Km): ");
        double jarak = input.nextDouble();

        System.out.print("masukkan panjang paket (Cm): ");
        double panjang = input.nextDouble();

        System.out.print("masukkan lebar paket (Cm): ");
        double lebar = input.nextDouble();

        System.out.print("masukkan tinggi paket (Cm): ");
        double tinggi = input.nextDouble();

        double biayaJarakBerat = 0;
        double biayaVolume = 0;

        if (jarak <=10) {
            biayaJarakBerat = berat * 4250;
        } else {
            biayaJarakBerat = berat * 6000;
        }
        double volume = panjang * lebar * tinggi;

        if (volume <=100) {
            biayaVolume = 50000;
        
        } 
        double totalBiaya = biayaJarakBerat + biayaVolume;

        System.out.println("rincian biaya ekspedisi:");
        System.out.println("volume paket: " + volume + " Cm3");
        System.out.println("biaya jarak dan berat: Rp " + biayaJarakBerat);
        System.out.println("biaya tambahan berdasarkan volume: Rp " + biayaVolume);
        System.out.println("total biaya ekspedisi: Rp " + totalBiaya);

        input.close();
    }
}