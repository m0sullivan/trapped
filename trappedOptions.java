import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class trappedOptions extends Adventure{
	Connection conn;
	Scanner myScan = new Scanner(System.in);
	String userInput = "";
	public void mainOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        Random rnd = new Random();
        System.out.println("1. Go to door1");
    	System.out.println("2. Go to door2");
    	System.out.println("3. Try to open Main door");
    	System.out.println("4. Look inside the closet");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
			
		}
		else if (userInput.equals("2"))
		{
			
		}
		else if (userInput.equals("3"))
		{
		
		}
		else if (userInput.equals("4"))
		{
			System.out.println("There is nothing inside the closet");
		}
	}
	
	public void officeOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        Random rnd = new Random();
        System.out.println("1. Try to open the door");
    	System.out.println("2. Look inside the file cabinet");
    	System.out.println("3. Look for something on desk");
    	System.out.println("4. Go back to Main room");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
			
		}
		else if (userInput.equals("2"))
		{
			
		}
		else if (userInput.equals("3"))
		{
		
		}
		else if (userInput.equals("4"))
		{
		
		}
	}
	public void bedroomOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        Random rnd = new Random();
		System.out.println("1. Try to open the door");
    	System.out.println("2. Lay in bed");
    	System.out.println("3. Look inside the closet");
    	System.out.println("4. Go back to Main room");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
			
		}
		else if (userInput.equals("2"))
		{
			
		}
		else if (userInput.equals("3"))
		{
		
		}
		else if (userInput.equals("4"))
		{
		
		}
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
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
			
		}
		else if (userInput.equals("2"))
		{
			
		}
		else if (userInput.equals("3"))
		{
		
		}
		else if (userInput.equals("4"))
		{
		
		}
	}
}
