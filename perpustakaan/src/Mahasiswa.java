
import java.io.Serializable;

//menggunakan extend atau pewarisan dari class peminjam
public class Mahasiswa extends Peminjam  implements Serializable{
    protected String nim; //memesan memori dengan tipe data String nim protected
    ///menggunakan super
    public Mahasiswa(String id_peminjam, String nama, String alamat, int mak_peminjam,String nim) {
        super(id_peminjam, nama, alamat, mak_peminjam);
        this.nim=nim;
    }
    public void setNim (String nimm) {
        nim=nimm;
    }
    public String getNim () {
        return nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + '}';
    }
    
}
