package ch4;

public class p24 {
	public static void main(String[] args) {
		Car24 car241;
		car241 = new Car24();
		car241.setcar24(1234,20.5);
		System.out.println(car241);
	}
}

class Car24{
	protected int num;
	protected double gas;
	public Car24() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setcar24(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public String toString() {
		String str = "車號:"+num+";汽車量:"+gas;
		return str;
	}
}