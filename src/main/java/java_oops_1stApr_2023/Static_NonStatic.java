package java_oops_1stApr_2023;

public class Static_NonStatic {
	
	//Class - static 
	//non static - Object level interaction
	
	//static will call  static entities
	//static will not call non-static entities
	
	//non static can interact with static [but with a warning]

	public static void main(String[] args) {
		Static_NonStatic.sample();
		sample();
		
		// Static_NonStatic.test();
        
		Static_NonStatic obj = new Static_NonStatic();
		obj.test();
		
		obj.sample();
		
	}
	
	public static void sample() {
		int i = 10;
		int j = 20;
		int sum = i+j;
		System.out.println(sum);
	
	}
	
	public void test() {
		String S1 = "Hello"; String S2 = "World";
		System.out.println(S1 + S2);
		sample();
	}

}
