
import java.io.Serializable;

public class Peminjam implements Serializable {
    //memesan memori dengan tipe protected
    protected String id_peminjam;
    protected String nama;
    protected String alamat;
    protected String nim;
    protected String nik;
    protected String nip;    
    protected int mak_pinjam;
    
    public  Peminjam() {
        this.id_peminjam = "0000000";
        this.nama="noname";
        this.alamat="none";
        this.mak_pinjam = 0;
   } 
     public Peminjam(String id_peminjam, String nama, String alamat, int mak_pinjam) {
        this.id_peminjam = id_peminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.mak_pinjam = mak_pinjam;
    }

  public void setId(String id) {
      id_peminjam=id;
}
  public void setNama(String name) {
      nama=name;
  }
  public void setAlamat (String add) {
      alamat=add;
  }
  public void setMak_pinjam(int pinjam) {
      mak_pinjam=pinjam;
  }
  public String getId () {
      return id_peminjam;
  }
  public String getNama () {
      return nama;
  }
  public String getAlamat () {
      return alamat;
  }
  public int getPinjam (){
    return mak_pinjam;
}
   public String getNip () {
        return nip;
    }
    public String getNim () {
        return nim;
    }
    public String getNik () {
        return nik;
    }
    @Override
    public String toString() {
        return "peminjam{" + "id_peminjam=" + id_peminjam + ", nama=" + nama + ", alamat=" + alamat + ", mak_pinjam=" + mak_pinjam + '}';
    }
 
}
