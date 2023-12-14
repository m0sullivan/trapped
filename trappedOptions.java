import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class trappedOptions extends Adventure{
	Connection conn;
	public void mainOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        Random rnd = new Random();
        System.out.println("1. Go to Door1");
    	System.out.println("2. Go to Door2");
    	System.out.println("3. Try to open Main Door");
    	System.out.println("4. Look at chest");
	}
	
	public void officeOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        Random rnd = new Random();
        System.out.println("1. Go to Door");
    	System.out.println("2. Look at file cabinet");
    	System.out.println("3. Look at desk");
    	System.out.println("4. ");
	}
	public void bedroomOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        Random rnd = new Random();
		System.out.println("1. Go to Door");
    	System.out.println("2. ");
    	System.out.println("3. ");
    	System.out.println("4. ");
	}
	public void libraryOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        Random rnd = new Random();
		System.out.println("1. Go to Door");
    	System.out.println("2. ");
    	System.out.println("3. ");
    	System.out.println("4. ");
	}
}
