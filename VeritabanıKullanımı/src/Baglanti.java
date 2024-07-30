
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Baglanti() {
        //jdbc:mysql://localhost:3306/demo
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
        }
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            
            System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız");
        }
    }
    
    public void preparedCalisanlariGetir(int id) {
        /*
        try {
            statement = con.createStatement();
            
            String sorgu = "SELECT * FROM calisanlar WHERE ad like 'G%'";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {                
                System.out.println("Ad : " + rs.getString("ad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        String sorgu = "SELECT * FROM calisanlar WHERE id > ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            ResultSet rs =  preparedStatement.executeQuery();
            while (rs.next()) {                
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Ad : " + ad + " Soyad : " + soyad + " Email : " + email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanSil() {
        try {
            statement = con.createStatement();
            
            String sorgu = "DELETE FROM calisanlar WHERE id > 1";
            
            int result = statement.executeUpdate(sorgu);
            System.out.println("Silinen kayıt sayısı : " + result);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanGuncelle() {
        try {
            statement = con.createStatement();
            
            String sorgu = "UPDATE calisanlar SET  email = 'g.yuce92@gmail.com' WHERE id = 1";
            
            int result = statement.executeUpdate(sorgu);
            System.out.println("Güncellenen kayıt sayısı : " + result);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanEkle() {
        String ad = "Test";
        String soyad = "Test";
        String email = "test@test.com";
        
        //String sorgu = "INSERT INTO calisanlar(ad, soyad, email) VALUES(" + "'" + ad + "'," + "'" + soyad + "',"  + "'" + email + "')";
        String sorgu = "INSERT INTO calisanlar(ad, soyad, email) VALUES(?, ?, ?)";
        
        try {
            //statement = con.createStatement();
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, email);
            
            //int result = statement.executeUpdate(sorgu);
            //System.out.println("Sorgu sonucu : " + result);
            
            int result  = preparedStatement.executeUpdate();
            System.out.println("Sorgu sonucu : " + result);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanlariGetir() {
        String sorgu = "SELECT * FROM calisanlar";
        
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println(id + " " + ad + " " + soyad + " " + email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        System.out.println("Çalışanlar tablosu");
        baglanti.calisanlariGetir();
        System.out.println("***********************");
        //baglanti.calisanEkle();
        //baglanti.calisanGuncelle();
        //baglanti.calisanSil();
        //baglanti.calisanlariGetir();
        //baglanti.preparedCalisanlariGetir(14);
    }
       
}
