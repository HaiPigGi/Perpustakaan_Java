
import java.io.Serializable;

//menggunakan extend atau pewarisan dari class peminjam
public class Umum extends Peminjam  implements Serializable{
    protected String nik; // memesan tipe data String nik 
    //menggunakan super
    public Umum(String id_peminjam, String nama, String alamat, int mak_peminjam,String nik) {
        super(id_peminjam, nama, alamat, mak_peminjam);
        this.nik=nik;
    }
    public void setNik (String nikk) {
        nik=nikk;
    }
    public String getNik () {
        return nik;
    }

    @Override
    public String toString() {
        return "Umum{" + "nik=" + nik + '}';
    }
    
}
