package lab10;

public class Plane extends Token{
	public int height;
	public static int maxSpeed = 3060;
	
	public Plane(int x, int y, Map map) {
		super(x, y, map);
	}
	
	public int getHeight() {
		return height;
	}
	
	public void climb(int howHigh) {
		height += howHigh;
	}
	
	public void land() {
		height = 0;
	}

}
