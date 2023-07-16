
import java.io.Serializable;


public class Koleksi  implements Serializable {
protected String id_Koleksi;
protected String judul;
protected String penerbit;
protected boolean statuc_peminjam;
protected String isbn,format,issn;
protected int seri,volume,halaman;

public Koleksi (String id_Koleksi,String judul,String penerbit,boolean statuc_peminjam) {
    this.id_Koleksi=id_Koleksi;
    this.judul=judul;
    this.penerbit=penerbit;
    this.statuc_peminjam=statuc_peminjam;
}
public Koleksi() {
        this.id_Koleksi = "0000000";
        this.judul="noTitle";
        this.penerbit="none";
        this.statuc_peminjam = Boolean.FALSE;
    }
    public String getId_Koleksi() {
        return id_Koleksi;
    }

    public void setId_Koleksi(String id_Koleksi) {
        this.id_Koleksi = id_Koleksi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }
       public String getIsbn() {
        return isbn;
    }
        public String getFormat() {
        return format;
    }
        public int getVolume() {
        return volume;
    }
        public int getSeri() {
        return seri;
    }
        public String getIssn() {
        return issn;
    }
        public int getHalaman() {
        return halaman;
    }



    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public boolean getStatuc_peminjam() {
        return statuc_peminjam;
    }

    public void setStatuc_peminjam(boolean statuc_peminjam) {
        this.statuc_peminjam = statuc_peminjam;
    }

    @Override
    public String toString() {
        return "Koleksi{" + "id_Koleksi=" + id_Koleksi + ", judul=" + judul + ", penerbit=" + penerbit + ", statuc_peminjam=" + statuc_peminjam + '}';
    }
    
}
