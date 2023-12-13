import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) throws IOException, SQLException{
    	Connection conn = null;
	    ResultSet clues;
	    ResultSet combinationlock;
	    ResultSet enemies;
	    ResultSet furniture;
	    ResultSet rooms = null;  
	    String input = null;
	    boolean gameRunning = false;  
	    try {
	    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TrappedGame", "root", "Keefe2012");
            System.out.println("Database connected!");
    	    
            //clues = stmt.executeQuery("SELECT * FROM clues;");
            //combinationlock = stmt.executeQuery("SELECT * FROM combinationlock;");
            //enemies = stmt.executeQuery("SELECT * FROM enemies;");
            //furniture = stmt.executeQuery("SELECT * FROM furniture;");

        } catch (SQLException e) {
            e.printStackTrace();
        }
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("            Welcome to Trapped");
	    System.out.println("--------------------------------------------");
	    System.out.println("Press ENTER to begin");
	    input = reader.readLine();
	    gameRunning = true;
	    controls();
	    System.out.println("--------------------------------------------");
	    System.out.println("You are trapped inside of a house, and you need to find a way out.");
	    
        Statement stmt = conn.createStatement();
        
        rooms = stmt.executeQuery("SELECT roomName FROM rooms;");
	    rooms.next();
	    System.out.println("You are currently in " + rooms.getString(1));       

	    while(gameRunning) {
	    	System.out.println("--------------------------------------------");
	    	System.out.println("What would you like to do?");
	    	options();
	    	input = reader.readLine();
	        if (input.equals("QUIT")) {
	        	System.out.println("--------------------------------------------");
	        	System.out.println("You Quit! Please type START to start again, or press ENTER to close game.");
	        	input = reader.readLine();
	        	if (input.equals("START")) {
	        		
	        	}
	        	System.exit(0);
	        }
	        else if (input.equals("CONTROLS")) {
	        	controls();
	        }
	        
	    }
	    

    }
    public static void controls() {
    	System.out.println("--------------------------------------------");
	    System.out.println("CONTROLS:");
	    System.out.println("Type CONTROLS anytime to show controls");
	    System.out.println("Type QUIT to Quit anytime");
	    System.out.println("Type HIDE to Hide when enemy appears");
	    System.out.println("DOOR to open and go through a door");
    }
    public static void options() {
    	System.out.println("1. ");
    	System.out.println("2. ");
    	System.out.println("3. ");
    	System.out.println("4. ");
    }
    
        
}