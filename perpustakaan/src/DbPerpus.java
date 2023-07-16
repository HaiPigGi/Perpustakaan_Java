
import java.sql.*;
import java.util.ArrayList;

public class DbPerpus {

    private String jdbcURL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";//ssid
    //private String jdbcURL = "jdbc:oracle:thin:@//172.23.9.185:1521/orcl";//service
    private String user = "hr";
    private String password = "hr";
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public DbPerpus() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("koneksi berhasil");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (Exception ex) {
            System.out.println("message: " + ex.getMessage());
        }
    }

    DbPerpus(String hr, String hr0) {
        //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<Peminjam> getPeminjam() throws SQLException {
        ArrayList<Peminjam> peminjamList = new ArrayList<>();

        stmt = null;
        rs = null;
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM DOSEN");
        if (rs != null) {
            while (rs.next()) {
                Dosen dsn = new Dosen(
                        rs.getString("id_peminjam"),
                        rs.getString("nama"),
                        rs.getString("alamat"),
                        rs.getInt("mak_pinjam"),
                        rs.getString("nip")
                );
                peminjamList.add(dsn);
            }
        }
        rs = null;
        rs = stmt.executeQuery("SELECT * FROM MAHASISWA");
        if (rs != null) {
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(
                        rs.getString("id_peminjam"),
                        rs.getString("nama"),
                        rs.getString("alamat"),
                        rs.getInt("mak_pinjam"),
                        rs.getString("nim")
                );
                peminjamList.add(mhs);
            }
        }
        rs = null;
        rs = stmt.executeQuery("SELECT * FROM UMUM");
        if (rs != null) {
            while (rs.next()) {
                Umum um = new Umum(
                        rs.getString("id_peminjam"),
                        rs.getString("nama"),
                        rs.getString("alamat"),
                        rs.getInt("mak_pinjam"),
                        rs.getString("nik")
                );
                peminjamList.add(um);
            }
        }
        return peminjamList;
    }

}
