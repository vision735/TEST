package toooom;

public class Cattle extends Animal {
	public Cattle() {
		super();
	}
	public void getFatherData() {
		System.out.println(super.name);
		super.move();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cattle cattle =new Cattle();
		cattle.getFatherData();
	}

}
