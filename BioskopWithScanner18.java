import java.util.Scanner;
public class BioskopWithScanner18 {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nama, next;
    int baris, kolom;

    String[][] penonton = new String[4][2];

    while (true) {
        System.out.println("Menu:");
        System.out.println("Menu 1: Input data penonton");
        System.out.println("Menu 2: Tampilkan daftar penonton");
        System.out.println("Menu 3: Exit");
        System.out.println("Pilih Menu (1/2/3)");

        int pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan){
            case 1:
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();
                System.out.print(" Masukkkan baris: ");
                baris = sc.nextInt ();
                System.out.print("Masukkan Kolom :");
                kolom = sc.nextInt();
                 sc.nextLine();

                 if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Peringatan: Kursi sudah terisi oleh penonton lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    break; 
                }
                }
                
                break;
                
            case 2 :
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            } else {
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                    }
                }
            }
            break;
            
            case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
            default:
                System.out.println("Pilihan tidak valid. Silahkan pilih menu yang keluar ");    
                

            }
        }
    }
} 




