import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertesTest1 {
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.setProperty("driver", "org.mariadb.jdbc.Driver");
		props.setProperty("url", "jdbc:mariadb://localhost:3306/testdb");
		props.setProperty("username", "root");
		props.setProperty("password", "7564");
		
		//props.store(new FileOutputStream("db.properties"), "Database Connection");
		props.storeToXML(new FileOutputStream("db.xml"), "Database Connection");
	}

}
