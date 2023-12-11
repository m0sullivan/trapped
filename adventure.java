import java.sql.*;
import java.util.Scanner;

public class adventure {
    ResultSet clues;
    ResultSet combinationlock;
    ResultSet enemies;
    ResultSet furniture;
    ResultSet rooms;
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
        System.out.println("            Welcome to Trapped");
        System.out.println("--------------------------------------------");
        System.out.println("Controls:");
        System.out.println("Q to Quit anytime");
        System.out.println("H to Hide when enemy appears");
        System.out.println("DOOR to open and go through a door");
        System.out.println("--------------------------------------------");
        System.out.println("You are trapped inside of a house, and you need to find a way out.");
        
        
        Scanner userInput = new Scanner(System.in);
        
        while(true) {
            String line = userInput.nextLine();
            
            System.out.println("You are trapped inside of a house, and you need to find a way out.");
        }
    }

}
