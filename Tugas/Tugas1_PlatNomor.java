package Tugas;

import java.util.Scanner;

public class Tugas1_PlatNomor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[] CITY = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };
        
        System.out.println("Program Pencarian Kota berdasarkan Kode Plat Nomor");
        System.out.println("================================================");
        
        System.out.println("\nDaftar Kode Plat Nomor yang tersedia:");
        for (int i = 0; i < CODE.length; i++) {
            System.out.printf("%c ", CODE[i]);
        }
        
        System.out.print("\n\nMasukkan kode plat nomor: ");
        char kodePlat = sc.next().charAt(0);
        kodePlat = Character.toUpperCase(kodePlat);
        
        // Mencari kota berdasarkan kode
        boolean found = false;
        String kota = "";
        
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == kodePlat) {
                kota = CITY[i];
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.printf("Kota untuk plat nomor %c adalah: %s\n", kodePlat, kota);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan!");
        }
        
        sc.close();
    }
}