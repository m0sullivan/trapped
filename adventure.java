import java.sql.*;

public class Enemy {
    String type;
    int timer;
    
    Enemy(String typeInput, int timerInput) {
        type = typeInput;
        timer = timerInput;
    }
}

public class Room {
    int id;
    String name;
    double chanceOfCreating;

    Room(double chanceOfCreating, String name, int id) {
        chanceOfCreating = chanceOfCreating; 
        name = name;
        id = id;
    }
}

public class sqlConn {

    public String assemble() {
        String text = "";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "")) {

            System.out.println("Database connected!");

            Statement stmt = conn.createStatement();

            stmt.executeQuery("USE TrappedGame;");

            ResultSet rs = stmt.executeQuery("SELECT * FROM rooms;");

            while(rs.next()) {
                text = text+rs.getString("roomName")+"\n";
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        return text;

    }

}

public class Adventure {

    public void main(String[] args) {
        System.out.println("You are trapped inside of a house, and you need to find a way out.");
        System.out.println("");
    }

}