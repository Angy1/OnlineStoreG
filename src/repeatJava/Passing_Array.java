package repeatJava;

public class Passing_Array {

	public static void main(String[] args) {
		//Declaring an Array
		String[] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		//Calling Print Array method and passing an Array as a parametr
		Print_Array(aMake);
	}
	//This accept Array as argument of type of String
	private static void Print_Array(String[] aMake) {
		
		for(int i=0; i<=aMake.length-1; i++) {
		System.out.println("Printing of the value of an Array ==> " + aMake[i]);
	}
	}}

