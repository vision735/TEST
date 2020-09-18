package toooom;

public class Vehicle {
	private int speed;
	private int size;
	
	public void display() {
		System.out.println("speed:"+speed+"KM/H");
		System.out.println("size:"+size+"KG");
	}
	
	public void speedUp() {
		speed+=15;
		System.out.println("加速后speed:"+speed+"KM/H");
	}
	
	public void speedDowm() {
		speed-=15;
		System.out.println("减速后speed:"+speed+"KM/H");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
