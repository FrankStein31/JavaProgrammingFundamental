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
    
    static void hitungPendapatan() {
        System.out.println("=== Laporan Pendapatan Cabang RoyalGarden ===");
        System.out.println("Daftar Harga Bunga:");
        for (int i = 0; i < bunga.length; i++) {
            System.out.printf("- %s: Rp %,d\n", bunga[i], harga[i]);
        }
        System.out.println("\nRincian Pendapatan per Cabang:");
        
        for (int i = 0; i < stok.length; i++) {
            System.out.printf("\nCabang RoyalGarden %d:\n", i+1);
            int pendapatanTotal = 0;
            
            for (int j = 0; j < stok[i].length; j++) {
                int pendapatanPerBunga = stok[i][j] * harga[j];
                System.out.printf("- Penjualan %s (%d unit): Rp %,d\n", 
                    bunga[j], stok[i][j], pendapatanPerBunga);
                pendapatanTotal += pendapatanPerBunga;
            }
            System.out.printf("Total Pendapatan: Rp %,d\n", pendapatanTotal);
        }
    }
    
    static void cekStokCabang4() {
        System.out.println("\n=== Laporan Stok Cabang RoyalGarden 4 ===");
        System.out.println("Pengurangan stok karena bunga mati:");
        int[] pengurangan = {1, 2, 0, 5};
        
        System.out.println("\nRincian Stok:");
        for (int i = 0; i < stok[3].length; i++) {
            int stokAwal = stok[3][i];
            int stokAkhir = stokAwal - pengurangan[i];
            System.out.printf("%s:\n", bunga[i]);
            System.out.printf("- Stok awal: %d unit\n", stokAwal);
            System.out.printf("- Pengurangan: %d unit\n", pengurangan[i]);
            System.out.printf("- Stok akhir: %d unit\n", stokAkhir);
        }
    }
    
    public static void main(String[] args) {
        hitungPendapatan();
        cekStokCabang4();
    }
}