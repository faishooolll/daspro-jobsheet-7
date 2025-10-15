import java.util.Scanner;
public class SiakadFor02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for(int i = 0; i<10; i++){
            System.out.print("Masukkan nilai mahasiswa ke " + (i+1) + " : ");
            nilai = sc.nextInt();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if(nilai < terendah){
                terendah = nilai;
            }
        }
        System.out.println("nilai tertinggi adalah "+ tertinggi);
        System.out.println(" nilai terendah adalah " + terendah);
        sc.close();
    }
}