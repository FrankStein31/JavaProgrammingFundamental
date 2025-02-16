package Selection;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double assignment, quiz, midExam, finalExam;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas (0-100): ");
        assignment = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis (0-100): ");
        quiz = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS (0-100): ");
        midExam = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS (0-100): ");
        finalExam = sc.nextDouble();
        
        if (assignment < 0 || assignment > 100 || quiz < 0 || quiz > 100 || midExam < 0 || midExam > 100 || finalExam < 0 || finalExam > 100) {
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("Nilai Tidak Valid");
                System.out.println("==============================");
                System.out.println("==============================");
                sc.close();
            return;
        }
        
        double nilaifinal = (0.2 * assignment) + (0.2 * quiz) + (0.3 * midExam) + (0.3 * finalExam);
        
        String nilaiHuruf;
        if (nilaifinal > 80 && nilaifinal <= 100) nilaiHuruf = "A";
        else if (nilaifinal > 73 && nilaifinal <= 80) nilaiHuruf = "B+";
        else if (nilaifinal > 65 && nilaifinal <= 73) nilaiHuruf = "B";
        else if (nilaifinal > 60 && nilaifinal <= 65) nilaiHuruf = "C+";
        else if (nilaifinal > 50 && nilaifinal <= 60) nilaiHuruf = "C";
        else if (nilaifinal > 39 && nilaifinal <= 50) nilaiHuruf = "D";
        else nilaiHuruf = "E";
        
        String status = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "GAGAL" : "LULUS";
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.printf("Nilai Akhir: %.2f\n", nilaifinal);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Status: " + status);

        sc.close();
    }
}