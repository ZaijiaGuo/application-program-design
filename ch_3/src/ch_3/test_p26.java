package ch_3;

public class test_p26 {
	public static void main(String[]args) {
		CarP26 car1;
		car1 =new CarP26();
		car1.show();
	}
}

class CarP26{
	private int num;
	private double gas;
	
	public CarP26() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}