
public class gameLoop {
	public static void displayControls() {
    	System.out.println("--------------------------------------------");
	    System.out.println("Controls:");
	    System.out.println("C anytime to show controls");
	    System.out.println("Q to Quit anytime");
	    System.out.println("H to Hide when enemy appears");
	    System.out.println("DOOR to open and go through a door");
    }
	public boolean quitGame(boolean B) {
		System.out.println("You Quit!");
		return false;
	}
	public static void wrongInput() {
		System.out.println("Invalid input!");
		System.out.println("Try again!");
	}
	public void gameOptions() {
		System.out.println("");
	}
}
