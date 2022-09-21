package day1;

public class Car {
	public void driveCar() {
		System.out.println("Car has a smooth drive");
	}
	private void applyBrake() {
		System.out.println("Perfect Brake");
	}
	private void soundHorn() {
		System.out.println("Horn sound is good");
	}
	private void isPuncture() {
		System.out.println("it has tubless tyres"); 
	}
	public static void main(String[] args) {
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
		
	}

}
