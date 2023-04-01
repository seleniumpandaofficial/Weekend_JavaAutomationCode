package java_code_arrays_1stApr_2023;

public class Retrieval_2D_Arrays {

	public static void main(String[] args) {
		
		int[][] a = {{10,20,30,40}, {11,21,31,41}, {12,22,32,42}};
		
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0; j<a[i].length ; j++) {
				System.out.print(a[i][j] +  " ");
			}
			
			System.out.println();
		}
		
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[0][0]);
		System.out.println(a[2][2]);
		
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[2].length);

	}

}
