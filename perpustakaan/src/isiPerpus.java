
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class isiPerpus {

    ArrayList<Peminjam> peminjamList = new ArrayList<>();
    ArrayList<Koleksi> koleksiList = new ArrayList<>();
    ArrayList<Transaksi> transaksiList = new ArrayList<>();
    DbPerpus dataPerpus;

//    public isiPerpus() {
//        dataPerpus = new DbPerpus("hr", "hr");
//        try {
//            peminjamList = dataPerpus.getPeminjam();
//            //koleksiList = dataPerpus.g
//        } catch (SQLException ex) {
//            Logger.getLogger(isiPerpus.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public void refreshPeminjam() {
//        peminjamList.clear();
//        try {
//            peminjamList = dataPerpus.getPeminjam();
//        } catch (Exception ex) {
//
//            Logger.getLogger(isiPerpus.class.getName()).log(Level.SEVERE,
//                    null, ex);
//        }
//    }

    public void isiDataPeminjam(Peminjam data) {
        try {
            peminjamList.add(data);
        } catch (Exception ex) {
            Logger.getLogger(isiPerpus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void isiDataKoleksi(Koleksi data) {
        try {
            koleksiList.add(data);
        } catch (Exception ex) {
            Logger.getLogger(isiPerpus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void isiDataTransaksi(Transaksi data) {
        try {
            transaksiList.add(data);
        } catch (Exception ex) {
            Logger.getLogger(isiPerpus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
