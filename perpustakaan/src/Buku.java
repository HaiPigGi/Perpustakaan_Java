
import java.io.Serializable;

//menggunakan extend atau pewarisan dari class Koleksi
public class Buku extends Koleksi  implements Serializable{
    protected int halaman;
    protected String isbn;

       public Buku (String id_koleksi, String judul, String penerbit, boolean status_pinjam, int halaman, String isbn) {
        super(id_koleksi, judul, penerbit, status_pinjam);
        this.halaman = halaman;
        this.isbn = isbn;
        
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Buku{" + "halaman=" + halaman + ", isbn=" + isbn + '}';
    }
    
    
}
