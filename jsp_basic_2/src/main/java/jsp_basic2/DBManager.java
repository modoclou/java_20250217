package jsp_basic2;

import javax.sql.*;
import javax.naming.*;
import java.sql.Connection;

public class DBManager {
	public static Connection conn;
	public DBManager() {super();}
	public Connection getConnection() {
		try {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/mbasic");
		conn = ds.getConnection();
		System.out.println("...ss" + conn);
		} catch(Exception e) {e.printStackTrace();}
		return conn;
	}
}
