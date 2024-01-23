class AlatTulis {
    protected String nama;
    protected int stok;
    protected int hargaSatuan;
    protected int harga;

    public AlatTulis(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.harga = stok * hargaSatuan;
    }

    public void displayInfo() {
        System.out.println("\nNama: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Satuan: Rp. " + hargaSatuan);
        System.out.println("Harga yang harus dibayar: Rp. " + harga);
    }
}
