package Tugas;

import java.util.Scanner;

public class Tugas2_Kubus {
    static Scanner sc = new Scanner(System.in);
    
    static void displayMenu() {
        System.out.println("\nKALKULATOR KUBUS");
        System.out.println("================");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }
    
    static double inputSisi() {
        System.out.print("Masukkan panjang sisi kubus: ");
        return sc.nextDouble();
    }
    
    static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }
    
    static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
    
    static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    
    public static void main(String[] args) {
        int pilihan;
        do {
            displayMenu();
            pilihan = sc.nextInt();
            
            if (pilihan >= 1 && pilihan <= 3) {
                double sisi = inputSisi();
                switch (pilihan) {
                    case 1:
                        double volume = hitungVolume(sisi);
                        System.out.printf("Volume kubus dengan sisi %.2f adalah: %.2f\n", 
                            sisi, volume);
                        break;
                    case 2:
                        double luasPermukaan = hitungLuasPermukaan(sisi);
                        System.out.printf("Luas permukaan kubus dengan sisi %.2f adalah: %.2f\n", 
                            sisi, luasPermukaan);
                        break;
                    case 3:
                        double keliling = hitungKeliling(sisi);
                        System.out.printf("Keliling (total panjang rusuk) kubus dengan sisi %.2f adalah: %.2f\n", 
                            sisi, keliling);
                        break;
                }
            } else if (pilihan != 4) {
                System.out.println("Pilihan tidak valid!");
            }
            
        } while (pilihan != 4);
        
        System.out.println("Terima kasih telah menggunakan kalkulator kubus!");
        sc.close();
    }
}