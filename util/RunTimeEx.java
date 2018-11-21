package bokutlåning4.util;

public class RunTimeEx extends Throwable{

	public static void main(String[] args) throws RunTimeEx {
		int myTest = 1;
		
		try {
			if (myTest != 2) {
				throw new RuntimeException("Nått gick snett");
			}
		} catch (Exception e) {
			
		}
		
		System.out.println("Hoppla");
	}

}
