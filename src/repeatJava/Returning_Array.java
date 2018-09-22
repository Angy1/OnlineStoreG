package repeatJava;

public class Returning_Array {

	public static void main(String[] args) {
		
			String[] aMake = ReturnArray();
			for(int i = 0;i<=aMake.length-1;i++){
				System.out.println("Printing all the values of an Array ==> " + aMake[i]);
				}
			}

	private static String[] ReturnArray() {
		String []aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		return aArray;
	}

	}


