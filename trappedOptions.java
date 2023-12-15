import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class trappedOptions extends Adventure {
	Connection conn;
	Random rnd = new Random();
	Scanner myScan = new Scanner(System.in);
	String userInput = "";
	ResultSet clues;
	ResultSet rooms;
	boolean gameRunning;
	
	
	public void gameRunning() {
		while(gameRunning) {
	        if (userInput.equals("QUIT")) {
	        	System.out.println("--------------------------------------------");
	        	System.out.println("You Quit! Please type START to start again, or press ENTER to close game.");
	        	userInput = myScan.nextLine();
	        	if (userInput.equals("START")) {
	        		
	        	}
	        	System.exit(0);
	        }
	        else if (userInput.equals("CONTROLS")) {
	        	controls();
	        }
	    }
	}
	public void mainOptions(Connection C) throws SQLException {
		conn = C;
        Statement stmt = conn.createStatement();
        rooms = stmt.executeQuery("SELECT roomName, roomDescription FROM rooms");
	    rooms.next();
	    System.out.println("You are currently in " + rooms.getString(1));
	    System.out.println(rooms.getString(2));
        System.out.println("1. Go to door1");
    	System.out.println("2. Go to door2");
    	System.out.println("3. Try to open Main door");
    	System.out.println("4. Look inside the closet");
    	System.out.println("5. Try to open small door");
    	System.out.println("--------------------------------------------");
    	System.out.println("What would you like to do?");
    	userInput = myScan.nextLine();
    	gameRunning();
    	boolean done = false;
    	if (userInput.equals("1"))
		{
        	System.out.println("--------------------------------------------");
    		System.out.println("Door1 is unlocked. Do you want to go to the office? (Y/N)");
    		userInput = myScan.nextLine();
    		if (userInput.equals("Y")) {
    			officeOptions(conn);
    		}
    		else if (userInput.equals("Y")) {
    			mainOptions(conn);
    		}
		}
		else if (userInput.equals("2"))
		{
			System.out.println("Door2 is unlocked. Do you want to go to the bedroom? (Y/N)");
			userInput = myScan.nextLine();
    		if (userInput.equals("Y")){
    			bedroomOptions(conn);
    		}
		}
		else if (userInput.equals("3"))
		{
			System.out.println("--------------------------------------------");
			System.out.println("Main door is locked. You need to input a password. Try it? (Y/N)");
			while (!done) {
				userInput = myScan.nextLine();
				if (userInput.equals("Y")) {
					System.out.println("--------------------------------------------");
					System.out.println("Input the password: ");
			    	userInput = myScan.nextLine();
					if (userInput.equals("MACJ")) {
						System.out.println("--------------------------------------------");
						System.out.println("Door is unlocked! Do you want to leave? (Y/N)");
				    	userInput = myScan.nextLine();
						if (userInput.equals("Y")) {
							System.out.println("--------------------------------------------");
							System.out.println("You escaped!!! Congratulations. Would you like to play again? (Y/N)");
					    	userInput = myScan.nextLine();
							if (userInput.equals("Y")) {
								mainOptions(C);
							}
							else if (userInput.equals("N")) {
								System.out.flush();
								done = true;
							}
						}
						else if (userInput.equals("N")) {
							mainOptions(C);
							done = true;
						}
					}
					else if (userInput.equals("QUIT")) {
						done = true;
						mainOptions(C);
					}
					else {
						System.out.println("The password is incorrect. Try again or type QUIT to exit");
						System.out.println("--------------------------------------------");
				    	userInput = myScan.nextLine();
					}
				}
				else if (userInput.equals("N")) {
					mainOptions(C);
				}
			}
		}
		else if (userInput.equals("4"))
		{
			System.out.println("There is nothing inside the closet");
		}
		else if (userInput.equals("5")) {
			System.out.println("--------------------------------------------");
			System.out.println("This door is locked");
			System.out.println("I can input a password... might find it later... should I input it right now? (Y/N)");
			userInput = myScan.nextLine();
			while (!done) {
				if (userInput.equals("Y")) {
	    	    	System.out.println("--------------------------------------------");
					System.out.println("Input the password:");
					userInput = myScan.nextLine();
					if (userInput.equals("JULY")) {
		    	    	System.out.println("--------------------------------------------");
		    	    	rooms.next();
		    	    	rooms.next();
		    	    	rooms.next();
		    	    	rooms.next();
		    	    	rooms.next();
		    			System.out.println("The door is unlocked. Do you want to go to the " + rooms.getString(1) + "? (Y/N)");
		    			userInput = myScan.nextLine();
		    			if (userInput.equals("Y")) {
		    				kitchenOptions(C);
		    				done = true;
		    			}
		    			else if (userInput.equals("N")) {
		    				done = true;
		    			}
					}
				}
	    		else if (userInput.equals("N")) {
	    			done = true;
	    		}
			}
		}
	}
	
	public void officeOptions(Connection C) throws SQLException {
		conn = C;
        Statement stmt = conn.createStatement();
        boolean done = false;
        rooms = stmt.executeQuery("SELECT roomName, roomDescription FROM rooms");
	    rooms.next();
	    rooms.next();
    	System.out.println("--------------------------------------------");
	    System.out.println("You are currently in " + rooms.getString(1));
	    System.out.println(rooms.getString(2));
        System.out.println("1. Try to open the door");
    	System.out.println("2. Look inside the file cabinet");
    	System.out.println("3. Look for something on desk");
    	System.out.println("4. Go back to Main room");
    	System.out.println("--------------------------------------------");
    	System.out.println("What would you like to do?");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		System.out.println("--------------------------------------------");
    		System.out.println("The door is locked. It asks for a password. What should I try?");
			while (!done) {
				userInput = myScan.nextLine();
	    		if (userInput.equals("DTTTHL")) {
	    	    	System.out.println("--------------------------------------------");
	    	    	rooms.next();
	    	    	rooms.next();
	    			System.out.println("The door is unlocked. Do you want to go to the " + rooms.getString(1) + "? (Y/N)");
	    			userInput = myScan.nextLine();
	        		if (userInput.equals("Y")) {
	        			libraryOptions(conn);
	        		}
	        		else if (userInput.equals("N")) {
	        			officeOptions(conn);
	        		}
	    			done = true;
	    		}
	    		else if (userInput.equals("QUIT")) {
	    			done = true;
	    			officeOptions(C);
	    		}
	    		else {
	    			System.out.println("--------------------------------------------");
	    			System.out.println("The password is incorrect. Try again or type QUIT to leave");
	    		}
			}
		}
		else if (userInput.equals("2"))
		{
			System.out.println("There is nothing inside the file cabinet");
			officeOptions(C);
		}
		else if (userInput.equals("3"))
		{
	    	System.out.println("--------------------------------------------");
			System.out.println("There is a letter on top of the table. Look at the letter? (Y/N)");
			while(!done) {
				userInput = myScan.nextLine();
				if (userInput.equals("Y")) {
					clues = stmt.executeQuery("SELECT item, content FROM clues");
					clues.next();
			    	System.out.println("--------------------------------------------");
				    System.out.println("The letter reads: ");
				    System.out.println(clues.getString(2));
				    officeOptions(C);
				    done = true;
				}
			}
			
		}
		else if (userInput.equals("4"))
		{
	    	System.out.println("--------------------------------------------");
			System.out.println("Are you sure you would like to go back? (Y/N)");
	    	userInput = myScan.nextLine();
			if (userInput.equals("Y")) {
				mainOptions(conn);
			}
			else if (userInput.equals("N")) {
			officeOptions(conn);	
			}
		}
	}
	public void bedroomOptions(Connection C) throws SQLException {
		conn = C;
        Statement stmt = conn.createStatement();
        boolean done = false;
        clues = stmt.executeQuery("SELECT item, content FROM clues");
        clues.next();
        clues.next();
        rooms = stmt.executeQuery("SELECT roomName, roomDescription FROM rooms");
        rooms.next();
        rooms.next();
        rooms.next();
        System.out.println("--------------------------------------------");
	    System.out.println("You are currently in " + rooms.getString(1));
	    System.out.println(rooms.getString(2));
    	System.out.println("--------------------------------------------");
		System.out.println("1. Try to open the door");
    	System.out.println("2. Lay in bed");
    	System.out.println("3. Check the broken clock");
    	System.out.println("4. Go back to Main room");
    	System.out.println("--------------------------------------------");
    	System.out.println("What would you like to do?");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		System.out.println("The door is locked. It asks for a password. What should I try?");
    		while (!done) {
				userInput = myScan.nextLine();
	    		if (userInput.equals("328")) {
	    			rooms.next();
	    			rooms.next();
	    			System.out.println("The door is unlocked. Do you want to go to the " + rooms.getString(1) + "? (Y/N)");
	    			userInput = myScan.nextLine();
	    			if (userInput.equals("Y")) {
	    				bathroomOptions(C);
	    				done = true;
	    			}
	    			else if (userInput.equals("N")) {
	    				bedroomOptions(C);
	    				done = true;
	    			}
	    		}
	    		else if (userInput.equals("QUIT")) {
	    			done = true;
	    			bedroomOptions(C);
	    		}
	    		else {
	    			System.out.println("The password is incorrect. Try again or type QUIT to leave");
	    		}
			}
		}
		else if (userInput.equals("2"))
		{
			System.out.println("It's as comfortable as it looks");
		}
		else if (userInput.equals("3"))
		{
			//3:28AM
			System.out.println("The clock is stopped, and it reads " + clues.getString(1) + ".");
		}
		else if (userInput.equals("4"))
		{
			System.out.println("");
		}
	}
	public void libraryOptions(Connection C) throws SQLException {
		conn = C;
        Statement stmt = conn.createStatement();
        rooms = stmt.executeQuery("SELECT roomName, roomDescription FROM rooms");
        rooms.next();
        rooms.next();
        rooms.next();
        rooms.next();
    	System.out.println("--------------------------------------------");
        System.out.println("You are in " + rooms.getString(1));
        System.out.println(rooms.getString(2));
		System.out.println("1. Go to Door");
    	System.out.println("2. Check bookshelf");
    	System.out.println("3. Check big desk");
    	System.out.println("4. Go back to main room");
    	System.out.println("--------------------------------------------");
    	System.out.println("What would you like to do?");
    	userInput = myScan.nextLine();
    	boolean done = false;
    	if (userInput.equals("1"))
		{
    		System.out.println("This door seems to be barricaded, definetely no way through");
    		libraryOptions(C);
		}
		else if (userInput.equals("2"))
		{
			System.out.println("There is one book on the bookshelf. Open the book? (Y/N)");
			while (!done) {
		    	userInput = myScan.nextLine();
		    	if (userInput.equals("Y")) {
		            clues = stmt.executeQuery("SELECT item, content FROM clues");
		            clues.next();
		            clues.next();
		            clues.next();
		    		System.out.println("The book reads: " + clues.getString(2));
		    		done = true;
		    	}
		    	if (userInput.equals("N")) {
		    		libraryOptions(C);
		    		done = true;
		    	}
			}
		}
		else if (userInput.equals("3"))
		{
			System.out.println("There is a computer, but it doesn't turn on. Also a lot of books, but they are all empty pages.");
			libraryOptions(C);
		}
		else if (userInput.equals("4"))
		{
			System.out.println("--------------------------------------------");
			System.out.println("Are you sure you would like to go back? (Y/N)");
	    	userInput = myScan.nextLine();
			if (userInput.equals("Y")) {
				mainOptions(conn);
			}
			else if (userInput.equals("N")) {
				libraryOptions(conn);	
			}
		}
	}
	public void kitchenOptions(Connection C) throws SQLException {
		conn = C;
	    ResultSet rooms = null;
	    Statement stmt = conn.createStatement();
	    rooms = stmt.executeQuery("SELECT roomName, roomDescription FROM rooms");
	    rooms.next();
	    rooms.next();
	    rooms.next();
	    rooms.next();
	    rooms.next();
	    rooms.next();  
    	System.out.println("--------------------------------------------");
        System.out.println("You are currently in " + rooms.getString(1));
        System.out.println(rooms.getString(2));
		System.out.println("1. Check the grocery list");
    	System.out.println("2. Go back to Main room");
    	System.out.println("--------------------------------------------");
    	System.out.println("What would you like to do?");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		clues = stmt.executeQuery("SELECT item, content FROM clues");
    		clues.next();
    		clues.next();
    		clues.next();
    		clues.next();
    		clues.next();
    		System.out.println("The list reads: " + clues.getString(2));
		}
		else if (userInput.equals("2"))
		{
			System.out.println("--------------------------------------------");
			System.out.println("Are you sure you would like to go back? (Y/N)");
	    	userInput = myScan.nextLine();
			if (userInput.equals("Y")) {
				mainOptions(conn);
			}
			else if (userInput.equals("N")) {
				kitchenOptions(conn);	
			}
		}
	}
	public void bathroomOptions(Connection C) throws SQLException {
		conn = C;
		boolean done = false;
	    ResultSet rooms = null;
        Statement stmt = conn.createStatement();
        rooms = stmt.executeQuery("SELECT roomName, roomDescription FROM rooms");
        rooms.next();
        rooms.next();
        rooms.next();
        rooms.next();
        rooms.next();
    	System.out.println("--------------------------------------------");
    	System.out.println("You are in " + rooms.getString(1));
    	System.out.println(rooms.getString(2));
		System.out.println("1. Try to open the door");
    	System.out.println("2. Check the tiles");
    	System.out.println("--------------------------------------------");
    	System.out.println("What would you like to do?");
    	userInput = myScan.nextLine();
    	if (userInput.equals("1"))
		{
    		
    		System.out.println("--------------------------------------------");
    		System.out.println("The door is locked. It asks for a password. What should I try?");
			while (!done) {
				userInput = myScan.nextLine();
	    		if (userInput.equals("SPONTANEOUS")) {
	    			rooms.next();
	    	    	System.out.println("--------------------------------------------");
	    			System.out.println("The door is unlocked. Do you want to go to the bedroom? (Y/N)");
	    			userInput = myScan.nextLine();
	        		if (userInput.equals("Y")) {
	        			bedroomOptions(conn);
	        			done = true;
	        		}
	        		else if (userInput.equals("N")) {
	        			bathroomOptions(conn);
	        		}
	    			done = true;
	    		}
	    		else if (userInput.equals("QUIT")) {
	    			done = true;
	    			bathroomOptions(C);
	    		}
	    		else {
	    			System.out.println("--------------------------------------------");
	    			System.out.println("The password is incorrect. Try again or type QUIT to leave");
	    		}
			}
		}
		else if (userInput.equals("2"))
		{
			clues = stmt.executeQuery("SELECT item, content FROM clues");
			clues.next();
			clues.next();
			clues.next();
			clues.next();
	    	System.out.println("--------------------------------------------");
			System.out.println("The tiles reads: "+ clues.getString(2));
			bathroomOptions(C);
		}
	}
}
