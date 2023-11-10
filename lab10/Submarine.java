package lab10;

public class Submarine extends Token{
	public int depth;
	public static int maxSpeed = 15;
	
	public Submarine(int x, int y, Map map) {
		super(x, y, map);
		this.depth = 0;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void dive(int howDeep) {
		depth += howDeep;
	}
	
	public void surface() {
		depth = 0;
	}

}
