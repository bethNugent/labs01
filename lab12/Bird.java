package lab12;

public abstract class Bird extends Animal {
	public String name;
	
	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		public String describeTaste() {
			return getName() + ": " + "Delicate";
		}
		
	public String isMainCourseDish() {
		return getName() + ": " + true;
	}
	
}
