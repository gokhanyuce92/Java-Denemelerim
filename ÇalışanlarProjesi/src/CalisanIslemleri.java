
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalisanIslemleri {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public CalisanIslemleri() {
        
        //jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=utf8
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            
            System.out.println("Connection successfull");
        } catch (SQLException ex) {
            System.out.println("Connection failed");
            //ex.printStackTrace();
        }
    }
    
    public void calisanSil(int id) {
        String sorgu = "Delete from calisanlar where id = ?";
        
        try {        
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            int result = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanGuncelle(int id, String yeni_ad, String yeni_soyad, String yeni_departman, String yeni_maas) {
        String sorgu = "Update calisanlar set ad = ?, soyad = ?, departman = ?, maas = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setString(3, yeni_departman);
            preparedStatement.setString(4, yeni_maas);
            preparedStatement.setInt(5, id);
            
            int result = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Calisan> calisanlariGetir() {
        ArrayList<Calisan> result = new ArrayList<Calisan>();
        
        try {
            statement = con.createStatement();
            
            String sorgu = "SELECT * FROM calisanlar";
            
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept = rs.getString("departman");
                String maas = rs.getString("maas");
                
                result.add(new Calisan(id, ad, soyad, dept, maas));
            }
            
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void calisanEkle(String ad, String soyad, String departman, String maas) {
        String sorgu = "INSERT INTO calisanlar(ad,soyad,departman,maas) VALUES(?, ?, ?, ?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, departman);
            preparedStatement.setString(4, maas);
            
            int result = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean girisYap(String kullanici_adi, String parola) {
        String sorgu = "SELECT * FROM adminler WHERE username = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
