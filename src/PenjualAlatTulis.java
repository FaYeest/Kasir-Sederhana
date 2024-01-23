import java.util.Scanner;

class PenjualAlatTulis {
    private Bolpoint bolpoint;
    private Pensil pensil;
    private Penghapus penghapus;
    private int totalHarga;

    public PenjualAlatTulis() {
        bolpoint = new Bolpoint(0);
        pensil = new Pensil(0);
        penghapus = new Penghapus(0);
    }

    public Bolpoint getBolpoint() {
        return bolpoint;
    }

    public Pensil getPensil() {
        return pensil;
    }

    public Penghapus getPenghapus() {
        return penghapus;
    }

    public void inputStok() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Bolpoint yang ingin dibeli: ");
        bolpoint.stok = scanner.nextInt();

        System.out.print("Masukkan jumlah Pensil yang ingin dibeli: ");
        pensil.stok = scanner.nextInt();

        System.out.print("Masukkan jumlah Penghapus yang ingin dibeli: ");
        penghapus.stok = scanner.nextInt();
        scanner.close();

        bolpoint.harga = bolpoint.stok * bolpoint.hargaSatuan;
        pensil.harga = pensil.stok * pensil.hargaSatuan;
        penghapus.harga = penghapus.stok * penghapus.hargaSatuan;
    }

    public void displayTotalHarga() {
        calculateTotalHarga();
        System.out.println("Total Harga yang harus dibayar: Rp. " + totalHarga);
    }

    public void calculateTotalHarga() {
        totalHarga = bolpoint.harga + pensil.harga + penghapus.harga;
    }
}