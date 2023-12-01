import java.sql.*;

public class enemies {
  String name;
  String enemyType;
  String whereCanSpawn;
  double chanceOfSpawning;
  String enemyQuestion;
  String enemyAnswer;
  
  try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "")) {

            System.out.println("Database connected!");
            Statement stmt = conn.createStatement();
            stmt.executeQuery("USE TrappedGame;");

            ResultSet clues = stmt.executeQuery("SELECT * FROM clues;");
            ResultSet combinationlock = stmt.executeQuery("SELECT * FROM combinationlock;");
            ResultSet enemies = stmt.executeQuery("SELECT * FROM enemies;");
            ResultSet furniture = stmt.executeQuery("SELECT * FROM furniture;");
            ResultSet rooms = stmt.executeQuery("SELECT * FROM rooms;");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    public enemies(name N, enemyType T, whereCanSpawn W, enemyQuestion Q, enemyAnswer A) {
      this.name = "
    }
}
