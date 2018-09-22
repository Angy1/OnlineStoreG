package repeatJava;

public class Array {

	public static void main(String[] args) {
		
		String[] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		
		//This is to store the size of the Array
		int iLength = aMake.length;
		System.out.println("Length of the Array is ==> " + iLength);
		
		//This is to access the first element of an array directly
		//with it's position
		String sBMW = aMake[0];
		System.out.println("The first value of the Array is " + sBMW);
		
		//This is to access the last element of Array
		String sHONDA = aMake[iLength -1];
		System.out.println("The last element of the Array is " + sHONDA);
		
		//This is to print all element of the Array
		for(int i=0;i <= iLength - 1; i++) {
			System.out.println("The value stored at position " + i + " in aMake array is " + aMake[i]);
		}
	}

}
