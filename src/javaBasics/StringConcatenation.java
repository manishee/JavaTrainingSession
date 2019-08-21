package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
		
		String x="hello";
		String y="world";
		
		double c=13.22;
		double d=34.44;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		System.out.println(x+y+a+b+a+b+x+y);
		
		
		System.out.println(c+d);
		System.out.println(c+d+x+y);
		System.out.println(x+y+c+d);
		
		
	}

}
