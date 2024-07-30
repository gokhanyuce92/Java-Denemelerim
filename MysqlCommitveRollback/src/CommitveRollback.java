
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Database Transaction

Çoğu zaman programlarımızda bir çok veritabanı işlemini ard arda yaparız.
Örneğin elimizde birbiriyle bağlantılı 3 tane tablo güncelleme işlemimiz var (delete, update)
Bu işlemleri ve sorguları ard arda çalıştırdığımızı düşünelim.

statement.executeUpdate(sorgu1);
statement.executeUpdate(sorgu2); //Burada herhangi bir hata oldu ve programımız sona erdi
statement.executeUpdate(sorgu3);

Böyle bir durumda 2.sorgumuzda herhangi bir hata oluyor
Ancak 1.sorguda hata olmadığı için bu sorgumuz veritabanını güncelledi
Ancak bu sorgular birbirleriyle bağlantılı ise 1.sorgunun da çalışmaması gerekiyor
İşte biz böyle durumların önüne geçmek icin Transaction ları kullanıyoruz
öreğin: (ATM Örneği)

Transaction mantığını kullanmak için bu sorguların sadece hiçbir sorun oluşmadığında toplu çalışmasını istiyoruz

Java bu sorguları yazdığımız andan itibaren otomatik olarak sorguları sorgusuz sualsiz çalıştırır. Onun için ilk olarak
con.setAutoCommit(false)
şeklinde birsey yaparak bu durumu engelliyoruz.

commit() : Bütün sorguları çalıştırır. Sorun olmadığı zaman hepsini çalıştırmak için kullanıyoruz
rollback() : Bütün sorguları iptal et. Sorun olduğu zaman hiçbirini çalıştırmamak için kullanıyoruz

Not:  setAutoCommit(false)  yazsak bile veritabanını güncellemeyen bir sorgu varsa, herhangi bir güvenlik sıkıntı
olmayacağından çalıştırılır (select)
*/

public class CommitveRollback {
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public CommitveRollback() {
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
    
    public void transactionkullan() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            con.setAutoCommit(false); //
            statement = con.createStatement();
            
            String sorgu1 = "DELETE FROM calisanlar WHERE id > 14";
            String sorgu2 = "UPDATE calisanlar SET email = 'test@test1.com' WHERE id = 14";
            
            System.out.println("Güncellemeden önce");
            calisanlariGetir();
            
            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);
            
            System.out.print("İşlemleriniz kaydedilsin mi?(yes/no) : ");
            String cevap = scanner.nextLine();
            
            if (cevap.equals("yes")) {
                con.commit();
                System.out.println("Veritabanı güncellendi");
            }
            else {
                con.rollback();
                System.out.println("Veritabanı güncellenmesi iptal edildi");    
            }
            calisanlariGetir();
            
        } catch (SQLException ex) {
            Logger.getLogger(CommitveRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calisanlariGetir() {
        try {
            statement = con.createStatement();
            
            String sorgu = "SELECT * FROM calisanlar";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {                
                String ad = rs.getString("ad");
                String soyad =rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Ad : " + ad + " Soyad : " + soyad + " Email : " + email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommitveRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        CommitveRollback baglanti = new CommitveRollback();
        
        baglanti.transactionkullan();
    }
       
}
