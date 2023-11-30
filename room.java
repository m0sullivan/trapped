package room;

public class Room {
    int id;
    String name;
    double chanceOfCreating;

    private Room(double chanceOfCreating, String name, int id) {
	chanceOfCreating = chanceOfCreating; 
	name = name;
	id = id;
   }
}

