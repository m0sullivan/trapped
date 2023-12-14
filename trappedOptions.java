import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class trappedOptions extends Adventure{
	Connection conn;
	Random rnd = new Random();
	Scanner myScan = new Scanner(System.in);
	String userInput = "";
	public void mainOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        System.out.println("1. Go to door1");
    	System.out.println("2. Go to door2");
    	System.out.println("3. Try to open Main door");
    	System.out.println("4. Look inside the closet");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		System.out.println("Door1 is unlocked. Do you want to go to the office?");
    		if (userInput.equals("YES")) {
    			officeOptions(conn);
    		}
		}
		else if (userInput.equals("2"))
		{
			System.out.println("Door2 is unlocked. Do you want to go to the bedroom?");
		}
		else if (userInput.equals("3"))
		{
			System.out.println("Main door is locked");
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
        
        System.out.println("1. Try to open the door");
    	System.out.println("2. Look inside the file cabinet");
    	System.out.println("3. Look for something on desk");
    	System.out.println("4. Go back to Main room");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		System.out.println("The door is locked");
		}
		else if (userInput.equals("2"))
		{
			System.out.println("There is nothing inside the file cabinet");
		}
		else if (userInput.equals("3"))
		{
			System.out.println("There is a letter on top of the table. I should look at it");
		}
		else if (userInput.equals("4"))
		{
			System.out.println("");
		}
	}
	public void bedroomOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
		System.out.println("1. Try to open the door");
    	System.out.println("2. Lay in bed");
    	System.out.println("3. Look inside the closet");
    	System.out.println("4. Go back to Main room");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		System.out.println("");
		}
		else if (userInput.equals("2"))
		{
			System.out.println("It's as comfortable as it looks");
		}
		else if (userInput.equals("3"))
		{
			System.out.println("");
		}
		else if (userInput.equals("4"))
		{
			System.out.println("");
		}
	}
	public void libraryOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
		System.out.println("1. Go to Door");
    	System.out.println("2. ");
    	System.out.println("3. ");
    	System.out.println("4. ");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		System.out.println("");
		}
		else if (userInput.equals("2"))
		{
			System.out.println("");
		}
		else if (userInput.equals("3"))
		{
			System.out.println("");
		}
		else if (userInput.equals("4"))
		{
			System.out.println("");
		}
	}
}
