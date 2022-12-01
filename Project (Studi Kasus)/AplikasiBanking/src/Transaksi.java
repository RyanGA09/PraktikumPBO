public abstract class Transaksi {
    private String tanggalTransaksi;

    public Transaksi() {
        tanggalTransaksi = DateString.now();
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public abstract int getNominal();
}