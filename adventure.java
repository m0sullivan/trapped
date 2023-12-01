import java.sql.*;
import java.util.Scanner;

public class adventure {
    ResultSet clues;
    ResultSet combinationlock;
    ResultSet enemies;
    ResultSet furniture;
    static ResultSet rooms;
    
    static boolean gameRunning;
    public static void main(String[] args) {
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Keefe2012")) {

            System.out.println("Database connected!");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("USE TrappedGame;");

            ResultSet clues = stmt.executeQuery("SELECT * FROM clues;");
            ResultSet combinationlock = stmt.executeQuery("SELECT * FROM combinationlock;");
            ResultSet enemies = stmt.executeQuery("SELECT * FROM enemies;");
            ResultSet furniture = stmt.executeQuery("SELECT * FROM furniture;");
            ResultSet rooms = stmt.executeQuery("SELECT * FROM rooms;");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("You are trapped inside of a house, and you need to find a way out.");
        Scanner userInput = new Scanner(System.in);
        
        while(gameRunning) {
            String line = userInput.nextLine();
            System.out.println("You are trapped inside of a house, and you need to find a way out.");
            
        }
        try {
			System.out.println("You are in: " + rooms.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
