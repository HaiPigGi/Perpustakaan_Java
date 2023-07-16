//menggunakan extend atau pewarisan dari class peminjam
public class Dosen extends Peminjam{
    protected String nip; //Memesan tempat dimemori dengan tipe data String nip protected
    //menggunakan super
    public Dosen(String id_peminjam, String nama, String alamat, int mak_peminjam,String nip) {
        super(id_peminjam, nama, alamat, mak_peminjam);
        this.nip=nip;
    }
    
    public void setNip (String nipp) {
        nip=nipp;
    }
    public String getNip () {
        return nip;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nip=" + nip + '}';
    }
    
}
