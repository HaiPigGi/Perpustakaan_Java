
import java.io.Serializable;

//menggunakan extend atau pewarisan dari class Koleksi
public class majalah extends Koleksi  implements Serializable {
    protected int volume;
    protected int seri;
    protected String issn;

     public majalah (String id_koleksi, String judul, String penerbit, boolean status_pinjam, int volume, int seri, String issn) {
        super(id_koleksi, judul, penerbit, status_pinjam);
        this.volume = volume;
        this.seri = seri;
        this.issn = issn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Override
    public String toString() {
        return "majalah{" + "volume=" + volume + ", seri=" + seri + ", issn=" + issn + '}';
    }
    
    
}
