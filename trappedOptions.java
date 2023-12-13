import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class trappedOptions extends Adventure{
	Connection conn;
	public trappedOptions(Connection C) throws SQLException {
		conn = C;
		ResultSet clues;
	    ResultSet combinationlock;
	    ResultSet enemies;
	    ResultSet furniture;	
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        clues = stmt.executeQuery("SELECT item FROM clues;");
        clues.next();
        Random rnd = new Random();
        System.out.println("1. Go to next room ");
    	System.out.println("2. Look at " + clues.getString(1));
    	System.out.println("3. ");
    	System.out.println("4. ");
	}

}
