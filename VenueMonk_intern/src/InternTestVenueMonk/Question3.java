package InternTestVenueMonk;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int a = 3; a < 1000; ++a) {
            for (int b = 3; b < 1000-a; ++b) {
                int c = 1000-a-b;
                if (c*c == a*a + b*b) {
                	System.out.println(a*b*c);
                	
                	//for breaking the both loop otherwise interchanging a and b may be done and result will be printed twice
                	a = 1000;
                	b = 1000;
                }
                
            }
        }
	}

}
