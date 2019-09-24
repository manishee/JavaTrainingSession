package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// lowest index/bound starts from 0
		// highest index/bound is n-1, where n is the size/length of the array
		
		int i=10;
		System.out.println(i);
		i=20;
		System.out.println(i);
		
		int j[]=new int[3];
		j[0]=100;
		j[1]=200;
		j[2]=300;
		
		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println(j[2]);
		
		System.out.println(j.length);
		
		
	}

}
