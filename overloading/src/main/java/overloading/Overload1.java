package overloading;

public class Overload1 {
	
	public void method1(int a ) {
		
		System.out.println("method with int argument is running..!!!");
		
		
	}
	
	public void method1(int... a ) {
		
		System.out.println("var- arg method is running...!!!!");
		
	}
	public static void main(String[] gs) {
		
		Overload1 ov= new Overload1();
		
		ov.method1();
		ov.method1(10,20);
		ov.method1(10);
		
		
		
	}

}
