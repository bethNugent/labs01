package lab09;

public class Program {

	public static void main(String[] args) {
		Map map = new Map(500, 400);
		
		Token t1 = new Token(70, 30, map);
		Token t2 = new Token(200, 150, map);
		Token t3 = new Token(300, 100, map);
		
		System.out.println("Initial coordinates:\n");
		System.out.println("t1: (" + t1.getX() + ", " + t1.getY() +")");
		System.out.println("t2: (" + t2.getX() + ", " + t2.getY() +")");
		System.out.println("t3: (" + t3.getX() + ", " + t3.getY() +")");
		
		t1.move("east", 100);
		t2.move("south", 50);
		t3.move("north", 200);
		
		System.out.println("\nNew Coordinates after movement:");
		System.out.println("t1: (" + t1.getX() + ", " + t1.getY() + ")");
		System.out.println("t2: (" + t2.getX() + ", " + t2.getY() + ")");
		System.out.println("t3: (" + t3.getX() + ", " + t3.getY() + ")");

	}

}
