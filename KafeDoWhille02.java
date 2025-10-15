import java.util.Scanner;

public class KafeDoWhille02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh , roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do{
            System.out.print("masukkan nama pelanggan (ketik batal untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi:");
            kopi = sc.nextInt();
            System.out.print("jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("jumlah roti: ");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayar adalah "+ totalHarga);
            sc.nextLine();
        }while (true);
        sc.close();
    }
}
