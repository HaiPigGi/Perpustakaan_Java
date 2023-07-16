
import java.io.Serializable;

//menggunakan extend atau pewarisan dari class Koleksi
public class Disk extends Koleksi  implements Serializable{
    protected String format;
    protected String isbn;

    public Disk(String id_Koleksi, String judul, String penerbit, boolean statuc_peminjam,String format, String isbn) {
        super(id_Koleksi, judul, penerbit, statuc_peminjam);
         this.format = format;
        this.isbn = isbn;
    }

 
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Disk{" + "format=" + format + ", isbn=" + isbn + '}';
    }
    
}
