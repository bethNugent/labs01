package lab09;

public class Token {
public int x;
public int y;
public Map map;

public Token(int x, int y, Map map) {
	this.x = x;
	this.y = y;
//	this.map = map;
}

public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}


public boolean move(String direction, int distance) {
	if (map == null) {
		System.out.println("Error: Map is null");
		return false;
	}
	
	int newX = x;
	int newY = y;
	
	direction = direction.toLowerCase();
	if(direction.equals("east") || direction.contentEquals("e")) {
		newX += distance;
	} else if (direction.contentEquals("west") || direction.contentEquals("w")) {
		newX -= distance;
	} else if (direction.contentEquals("north") || direction.contentEquals("n")) {
		newY += distance;
	} else if (direction.contentEquals("south") || direction.contentEquals("s")) {
		newY -= distance;
	}
	
	if (newX >= 0 && newX <= map.xGetter() && newY >= 0 && newY <= map.yGetter()) {
		x = newX;
		y = newY;
		return true;
	} else {
		System.out.println("The token had fallen off the map.");
		return false;
	}
}



}
