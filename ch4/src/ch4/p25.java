
package ch4;

public class p25 {
	public static void main(String[] args) {
		Car25 car251= new Car25();
		Car25 car252=new Car25();
		Car25 car253;
		car253 = car251;
		System.out.println("car1與car2相同"+car251.equals(car252));
		System.out.println("car1與car3相同"+car251.equals(car253));
	}
}
class Car25{
	protected int num;
	protected double gas;
	public Car25() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
}