package Tugas;

import java.util.Scanner;

public class Tugas3_Jadwal {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] courseName = new String[n];
        int[] creditHours = new int[n];
        int[] semester = new int[n];
        String[] lectureDay = new String[n];
        
        inputCourseData(n, courseName, creditHours, semester, lectureDay);
        
        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    displayAllCourses(n, courseName, creditHours, semester, lectureDay);
                    break;
                case 2:
                    displayCoursesByDay(n, courseName, creditHours, semester, lectureDay);
                    break;
                case 3:
                    displayCoursesBySemester(n, courseName, creditHours, semester, lectureDay);
                    break;
                case 4:
                    searchCourse(n, courseName, creditHours, semester, lectureDay);
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);
        
        sc.close();
    }
    
    static void displayMenu() {
        System.out.println("\nSISTEM MANAJEMEN MATA KULIAH");
        System.out.println("============================");
        System.out.println("1. Tampilkan Semua Mata Kuliah");
        System.out.println("2. Tampilkan Mata Kuliah berdasarkan Hari");
        System.out.println("3. Tampilkan Mata Kuliah berdasarkan Semester");
        System.out.println("4. Cari Mata Kuliah");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }
    
    static void inputCourseData(int n, String[] courseName, int[] creditHours, 
                              int[] semester, String[] lectureDay) {
        System.out.println("\nInput Data Mata Kuliah");
        System.out.println("=====================");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("\nMata Kuliah ke-%d:\n", i + 1);
            System.out.print("Nama Mata Kuliah: ");
            courseName[i] = sc.nextLine();
            
            System.out.print("Jumlah SKS: ");
            creditHours[i] = sc.nextInt();
            
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); // consume newline
            
            System.out.print("Hari Kuliah: ");
            lectureDay[i] = sc.nextLine();
        }
    }
    
    static void displayAllCourses(int n, String[] courseName, int[] creditHours, 
                                int[] semester, String[] lectureDay) {
        System.out.println("\nDaftar Semua Mata Kuliah");
        System.out.println("=======================");
        displayCourseHeader();
        
        for (int i = 0; i < n; i++) {
            displayCourseData(i, courseName[i], creditHours[i], semester[i], lectureDay[i]);
        }
    }
    
    static void displayCoursesByDay(int n, String[] courseName, int[] creditHours, 
                                  int[] semester, String[] lectureDay) {
        System.out.print("\nMasukkan hari (Senin/Selasa/dll): ");
        String day = sc.nextLine();
        
        System.out.printf("\nDaftar Mata Kuliah Hari %s\n", day);
        System.out.println("=======================");
        displayCourseHeader();
        
        for (int i = 0; i < n; i++) {
            if (lectureDay[i].equalsIgnoreCase(day)) {
                displayCourseData(i, courseName[i], creditHours[i], semester[i], lectureDay[i]);
            }
        }
    }
    
    static void displayCoursesBySemester(int n, String[] courseName, int[] creditHours, 
                                       int[] semester, String[] lectureDay) {
        System.out.print("\nMasukkan semester: ");
        int sem = sc.nextInt();
        
        System.out.printf("\nDaftar Mata Kuliah Semester %d\n", sem);
        System.out.println("=======================");
        displayCourseHeader();
        
        for (int i = 0; i < n; i++) {
            if (semester[i] == sem) {
                displayCourseData(i, courseName[i], creditHours[i], semester[i], lectureDay[i]);
            }
        }
    }
    
    static void searchCourse(int n, String[] courseName, int[] creditHours, 
                           int[] semester, String[] lectureDay) {
        System.out.print("\nMasukkan nama mata kuliah: ");
        String search = sc.nextLine();
        
        System.out.println("\nHasil Pencarian");
        System.out.println("===============");
        displayCourseHeader();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (courseName[i].toLowerCase().contains(search.toLowerCase())) {
                displayCourseData(i, courseName[i], creditHours[i], semester[i], lectureDay[i]);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan!");
        }
    }
    
    static void displayCourseHeader() {
        System.out.printf("%-5s %-30s %-10s %-10s %-15s\n", 
            "No.", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("----------------------------------------------------------");
    }
    
    static void displayCourseData(int index, String name, int credits, 
                                int sem, String day) {
        System.out.printf("%-5d %-30s %-10d %-10d %-15s\n", 
            index + 1, name, credits, sem, day);
    }
}