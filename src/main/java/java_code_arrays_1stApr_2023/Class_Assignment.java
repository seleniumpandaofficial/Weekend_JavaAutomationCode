package java_code_arrays_1stApr_2023;

public class Class_Assignment {

	public static void main(String[] args) {
		//1. Create a 2-D String Array
		//2. Initialize that 2-D Array by entering values in respective cols.
		// 3. I want  you to retrieve the values of the String 2-D array in different rows in output console
		//4. I want to see representation of the String 2-D array in traditional style as well as compact style
		
		String[][] S1 = new String[2][3];
		
		S1[0][0] = "Java";
		S1[0][1] = "Java1";
		S1[0][2] = "Java2";
		
		S1[1][0] = "Python";
		S1[1][1] = "Python1";
		S1[1][2] = "Python2";
		
		for(int i=0 ; i<S1.length ; i++) {
			for(int j=0; j<S1[i].length; j++) {
				System.out.print(S1[i][j] + " ");
			}
			System.out.println();
		}
		
	System.out.println("---------------------------------------------------------------------");
		
		String[][] S2 = {{"Java" , "Java1", "Java2 "},
		                          { "Python", " Python1", " Python2"}};
		
		for(int i=0 ; i<S2.length ; i++) {
			for(int j=0; j<S2[i].length; j++) {
				System.out.print(S2[i][j] + " ");
			}
			System.out.println();
		}
		}

	}


