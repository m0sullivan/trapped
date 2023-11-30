package enemy;

public class Enemy {
  String name;
  String enemyType;
  String whereCanSpawn;
  double chanceOfSpawning;
  public Enemy(String n, String eT, String wCS, double cOS) {
    name = n;
    enemyType = eT;
    whereCanSpawn = wCS;
    chanceOfSpawning = cOS;
  }
}
