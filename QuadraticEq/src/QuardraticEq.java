
public class QuardraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b = -3.0;
		double c = 2.0;
		double root1 = (-b + Math.sqrt(b * b - 4 * c)) / 2.0;
		double root2 = (-b - Math.sqrt(b * b - 4 * c)) / 2.0;
		
		System.out.println("Root 1 = " + root1);
		System.out.println("Root 2 = " + root2);
	}

}
