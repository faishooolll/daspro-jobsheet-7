import java.util.Scanner;
public class bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int beli = 0;
        int tiket = 50000;
        double diskon1 = 0;
        double diskon2 = 0;
        double finalBayar = 0;
        int pelanggan;
        int total = 0;
        int tiketTerjual = 0;

        System.out.print("Berapa pelanggan yang akan beli tiket hari ini?: ");
        pelanggan = sc.nextInt();

        for(int i = 0; i < pelanggan; i++){
           System.out.print("masukkan berapa tiket bioskop yang ingin anda beli: ");
           beli = sc.nextInt();
            tiketTerjual += beli;
           if (beli > 4 && beli < 11) {
               System.out.println("Selamat anda mendapatkan diskon sebesar 10%");
               diskon1 = (beli * tiket) * 0.1;
               finalBayar = (beli * tiket) - diskon1;
           }else if (beli > 10 ) {
               System.out.println("Selamat anda mendapatkan diskon sebesar 15%");
               diskon2 = (beli * tiket) * 0.15;
               finalBayar = (beli * tiket) - diskon2;
           }else{
               finalBayar = beli* tiket;
           }
           if (beli < 0) {
            System.out.println("input tidak valid");
            i--;
            continue;
           }   
           System.out.println("total yang harus dibayar adalah " + finalBayar);
           total += finalBayar;
       }
        System.out.println("Tiket bioskop yang terjual hari ini adalah "+ tiketTerjual);
        System.out.println("total harga penjualan adalah " + total );

        sc.close();
    }
   
    }

