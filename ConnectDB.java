import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	//DB Connections Variables
	static Connection connection= null;
	static String databaseName = "";
	static String url = "Jdbc:mysql://localhost:3306/" +databaseName;
	static String username = "root";
	static String password = "123456";
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username , password);
		
	}
}
