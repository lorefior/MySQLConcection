
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {


	public static void main(String[] args) {
try {
	Class.forName("com.mysql.jdbc.Driver");
	DriverManager.getConnection("jdbc:mysql://localhost:3306/com_escuela", "root", "1234");
	System.out.println("connection OK!");
} catch (ClassNotFoundException e) {
System.out.println("error al cargar controller");
e.printStackTrace();
}catch (SQLException e) {
	System.out.println("error en la coneccion");
	e.printStackTrace();
}
	}
}