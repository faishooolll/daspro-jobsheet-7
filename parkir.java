import java.util.Scanner;
public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total=0;
        
        
        do{
            System.out.println("Masukkan jenis kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("3. Keluar");
            System.out.print("pilih angka 1-3: ");
            jenis = sc.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total+=12500;
                }else if (jenis == 1) {
                    total += durasi * 3000;
                }else if (jenis == 2) {
                    total += durasi * 2000;
                }
            }else if(jenis == 3){
                System.out.println("anda keluar program");
                break;
            }else{
                System.out.println("invalid input! tolong masukkan input yang benar");
            }
        }while(jenis != 0);
        System.out.println("Total markir hari ini adalah " + total);
        
        sc.close();
    }
}
