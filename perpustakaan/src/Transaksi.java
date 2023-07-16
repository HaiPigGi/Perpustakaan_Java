import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
public class Transaksi implements Serializable {
protected ArrayList<Koleksi> arkoleksi = new ArrayList<Koleksi>();;
protected String id_transaksi;
protected LocalDate tgl_peminjam;
protected LocalDate tgl_kembali;
protected Koleksi koleksii [];
protected Peminjam Peminjam;
protected float denda;
protected static float priceDenda = 2000;

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public LocalDate getTgl_peminjam() {
        return tgl_peminjam;
    }

    public void setTgl_peminjam(LocalDate tgl_peminjam) {
        this.tgl_peminjam = tgl_peminjam;
    }

    public LocalDate getTgl_kembali() {
        return tgl_kembali;
    }

    public void setTgl_kembali(LocalDate tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public Koleksi[] getKoleksi() {
        return koleksii;
    }

    public void setKoleksi(Koleksi[] koleksi) {
        this.koleksii = koleksi;
    }

    public Peminjam getBorrow() {
        return Peminjam;
    }

    public void setBorrow(Peminjam borrow) {
        this.Peminjam = borrow;
    }

    public float getDenda() {
        return denda;
    }

    public void setDenda(float denda) {
        this.denda = denda;
    }
     public static float getPriceDenda() {
        return priceDenda;
    }

    public Transaksi () {

    }
    public Transaksi(String id_transaksi, LocalDate tgl_pinjam, LocalDate tgl_kembali, int denda, Koleksi[] arkoleksi, Peminjam peminjam) {
        this.id_transaksi = id_transaksi;
        this.tgl_peminjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.denda = denda;
        this.koleksii = arkoleksi;
        this.Peminjam = peminjam;
    }
    public void pinjam(){
        tgl_peminjam = LocalDate.now();
        tgl_kembali = tgl_peminjam.plusDays(14);
        this.denda = 0;
        
    }
     public void kembali(){
        LocalDate harini = LocalDate.now();
        this.tgl_kembali = harini;
        long telat =  ChronoUnit.DAYS.between(tgl_peminjam, harini);
        if (telat > 14) {
            denda = (telat - 14)* getPriceDenda();
        }
    }

    @Override
    public String toString() {
        return "Transaksi{" + "id_transaksi=" + id_transaksi + ", tgl_peminjam=" + tgl_peminjam + ", tgl_kembali=" + tgl_kembali + ", koleksi=" + koleksii + ", peminjam=" + Peminjam + ", denda=" + denda + '}';
    }

     public void pinjam(String id_transaksi, ArrayList<Koleksi> arkoleksi, Peminjam peminjam){
        this.id_transaksi = id_transaksi;
        tgl_peminjam=LocalDate.now();
        tgl_kembali = tgl_peminjam.plusDays(30);
        this.denda = 0;
        this.setArkoleksi(arkoleksi);
        this.Peminjam = peminjam;
        
    }
     public void setArkoleksi(ArrayList<Koleksi> arkoleksi) {
        this.arkoleksi = arkoleksi;
    }
     public ArrayList<Koleksi> getArkoleksi() {
        return arkoleksi;
    }
    
   


}








