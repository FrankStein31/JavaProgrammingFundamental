// package Array;
// import java.util.Scanner;

// public class IPSemester {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         String[] mataKuliah = {
//             "Pancasila",
//             "Konsep Teknologi Informasi",
//             "Critical Thinking dan Problem Solving",
//             "Matermatika Dasar",
//             "Bahasa Inggris",
//             "Dasar Pemrograman",
//             "Praktikum Dasar Pemrograman",
//             "Keselamatan dan Kesehatan Kerja"
//         };
        
//         int[] bobotSKS = {2, 2, 2, 3, 2, 2, 3, 2};
        
//         int n = mataKuliah.length;
//         double[] nilaiAngka = new double[n];
        
//         System.out.println("Program Menghitung IP Semester");
//         System.out.println("==============================");
        
//         for (int i = 0; i < n; i++) {
//             System.out.print("Masukkan Nilai Angka untuk MK " + mataKuliah[i] + "(0 - 100): ");
//             nilaiAngka[i] = sc.nextDouble();
//         }
        
//         System.out.println("==============================");
//         System.out.println("=====Hasil Konversi Nilai=====");
//         System.out.println("==============================");
        
//         System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
//         double totalBobotXSKS = 0;
//         int totalSKS = 0;
        
//         for (int i = 0; i < n; i++) {
//             String nilaiHuruf;
//             double bobotNilai;
            
//             if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
//                 nilaiHuruf = "A";
//                 bobotNilai = 4.00;
//             } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
//                 nilaiHuruf = "B+";
//                 bobotNilai = 3.50;
//             } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
//                 nilaiHuruf = "B";
//                 bobotNilai = 3.00;
//             } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
//                 nilaiHuruf = "C+";
//                 bobotNilai = 2.50;
//             } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
//                 nilaiHuruf = "C";
//                 bobotNilai = 2.00;
//             } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
//                 nilaiHuruf = "D";
//                 bobotNilai = 1.00;
//             } else {
//                 nilaiHuruf = "E";
//                 bobotNilai = 0.00;
//             }
            
//             System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", 
//                 mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai);
            
//             totalBobotXSKS += (bobotNilai * bobotSKS[i]);
//             totalSKS += bobotSKS[i];
//         }
        
//         System.out.println("==============================");
//         double ip = totalBobotXSKS / totalSKS;
//         System.out.printf("IP : %.2f\n", ip);

//         sc.close();
//     }
// }

package Array;

public class IPSemester {
    public static void main(String[] args) {
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matermatika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        int[] bobotSKS = {2, 2, 2, 3, 2, 2, 3, 2};
        
        double[] nilaiAngka = {
            75.0,  // Pancasila
            85.0,  // Konsep Teknologi Informasi
            70.0,  // Critical Thinking dan Problem Solving
            85.0,  // Matermatika Dasar
            85.0,  // Bahasa Inggris
            62.0,  // Dasar Pemrograman
            62.0,  // Praktikum Dasar Pemrograman
            85.0   // Keselamatan dan Kesehatan Kerja
        };
        
        int n = mataKuliah.length;
        
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        
        System.out.println("==============================");
        System.out.println("=====Hasil Konversi Nilai=====");
        System.out.println("==============================");
        
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        double totalBobotXSKS = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < n; i++) {
            String nilaiHuruf;
            double bobotNilai;
            
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf = "A";
                bobotNilai = 4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf = "B+";
                bobotNilai = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf = "B";
                bobotNilai = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf = "C+";
                bobotNilai = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf = "C";
                bobotNilai = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf = "D";
                bobotNilai = 1.00;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0.00;
            }
            
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", 
                mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai);
            
            totalBobotXSKS += (bobotNilai * bobotSKS[i]);
            totalSKS += bobotSKS[i];
        }
        
        System.out.println("==============================");
        double ip = totalBobotXSKS / totalSKS;
        System.out.printf("IP : %.2f\n", ip);
    }
}