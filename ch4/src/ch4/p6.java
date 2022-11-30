package ch4;

public class p6 {
	public static void main(String[] args) {
		RacingCar6 rccar16= new RacingCar6(1234,20.5,5);
	}
}

class Car6{
	private int num;
	private double gas;
	public Car6() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Car6(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void setCar6(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油輛設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class RacingCar6 extends Car6{
	private int course;
	public RacingCar6() {
		course=0;
		System.out.println("生產了賽車");
	}
	public RacingCar6(int n,double g,int c) {
		super(n,g);
		course =c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車邊號設為"+course);
	}
}