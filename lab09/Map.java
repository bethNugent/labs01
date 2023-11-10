package lab09;

public class Map {
	public int xSize;
	public int ySize;
	
	public Map(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
	}
	
	public int xGetter() {
		return xSize;
	}
	
	public int yGetter() {
		return ySize;
	}
	
	public int getxSize() {
		return xSize;
	}
	public void setxSize(int xSize) {
		this.xSize = xSize;
	}
	public int getySzie() {
		return ySize;
	}
	public void setySzie(int ySize) {
		this.ySize = ySize;
	}
}
