public class Main {
    public static void main(String[] args) {
        PenjualAlatTulis penjual = new PenjualAlatTulis();

        // Input stok dari pengguna
        penjual.inputStok();

        // Menampilkan informasi alat tulis
        penjual.getBolpoint().displayInfo();
        penjual.getPensil().displayInfo();
        penjual.getPenghapus().displayInfo();

        // Menghitung total harga dan menampilkannya
        penjual.calculateTotalHarga();
        penjual.displayTotalHarga();
    }
}
