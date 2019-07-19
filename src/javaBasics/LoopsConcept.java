package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		System.out.println("*************WHILE LOOP*************");
		int a=1;//initialization
		while(a<=10) {//condition
			System.out.println(a);
			a++;//increment or decrement
			//if you miss increment or decrement statement, the loop runs infinitely
		}
		
		System.out.println("**************FOR LOOP************");
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		for(int j=0; j>=-10; j--)
		{
			System.out.println(j);
		}
	}

}
