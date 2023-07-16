 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DBHelper {
    public static Connection con = null;
    public static PreparedStatement pst=null;
    public static ResultSet rs=null;
    public static Statement stmt=null;
    
    static {
         
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1","hr","hr");
            stmt=con.createStatement();
           pst=con.prepareStatement("SELECT * FROM DOSEN WHERE ID_DOSEN LIKE ?");
            
        } catch (SQLException ex) {
            ex.printStackTrace();     
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public static ResultSet getData (String id) throws SQLException {
        pst.setString(1,"%"+ id+"%");
        return pst.executeQuery();
    }
    
}




//
//  try {
//                String cari = txID.getText();
//                txID.setText(((Dosen)dtpeminjam).getId());
//                pst=con.prepareStatement("SELECT *FROM DOSEN WHERE CARI = ?");
//                con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1","hr","hr");
//
//                 pst=con.prepareStatement(cari);
//                pst.setString(1,cari);
//                rs=pst.executeQuery();
//                if (rs.next())
//                    JOptionPane.showMessageDialog(null,"%-15s%-20s%5s\n,"+rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
//                else 
//                    JOptionPane.showMessageDialog(null,"Not Found");
//                
//            } catch (Exception ex) {
//                Logger.getLogger(Mtransaksi.class.getName()).log(Level.SEVERE, null, ex);
////            }
