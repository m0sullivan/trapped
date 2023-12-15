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
	    instructions();
	    System.out.println("--------------------------------------------");
	    System.out.println("You are trapped inside of a house, and you need to find a way out.");
	    
        Statement stmt = conn.createStatement();
	    trappedOptions options = new trappedOptions(); 
	    while(gameRunning) {
	    	options.mainOptions(conn);
	    }
	    

    }
    public static void instructions() {
    	System.out.println("--------------------------------------------");
	    System.out.println("INSTRUCTIONS:");
	    System.out.println("Find different objects and letters in different rooms to decode them for passwords, which you can use to open different doors.");
	    System.out.println("All input should be UPPERCASE");
	    System.out.println("Re-run game if something breaks, all passwords are the same everytime.");
	    }
        
}