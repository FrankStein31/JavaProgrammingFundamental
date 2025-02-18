package Function;

public class RoyalGarden {
    static int[][] stok = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };
    
    static int[] harga = {75000, 50000, 60000, 10000};
    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    
    static void printLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    static void hitungPendapatan() {
        System.out.println("\n=== Pendapatan RoyalGarden jika Semua Bunga Terjual ===\n");
        
        System.out.printf("%-15s", "Cabang");
        for (String b : bunga) {
            System.out.printf("%-12s", b);
        }
        System.out.printf("%-15s\n", "Total");
        
        printLine(75);
        
        for (int i = 0; i < stok.length; i++) {
            System.out.printf("%-15s", "RoyalGarden " + (i+1));
            int total = 0;
            
            for (int j = 0; j < stok[i].length; j++) {
                int pendapatan = stok[i][j] * harga[j];
                total += pendapatan;
                System.out.printf("%-12s", "Rp " + pendapatan/1000 + "k");
            }
            System.out.printf("%-15s\n", "Rp " + total/1000 + "k");
        }
    }
    
    static void cekStokCabang4() {
        System.out.println("\n=== Stok Cabang RoyalGarden 4 Setelah Pengurangan ===\n");
        
        int[] pengurangan = {1, 2, 0, 5};
        
        System.out.printf("%-15s", "Status");
        for (String b : bunga) {
            System.out.printf("%-12s", b);
        }
        System.out.println();
        
        printLine(60);
        
        System.out.printf("%-15s", "Stok Awal");
        for (int stokAwal : stok[3]) {
            System.out.printf("%-12d", stokAwal);
        }
        System.out.println();
        
        System.out.printf("%-15s", "Pengurangan");
        for (int kurang : pengurangan) {
            System.out.printf("%-12d", kurang);
        }
        System.out.println();
        
        System.out.printf("%-15s", "Stok Akhir");
        for (int i = 0; i < stok[3].length; i++) {
            System.out.printf("%-12d", stok[3][i] - pengurangan[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        hitungPendapatan();
        cekStokCabang4();
    }
}