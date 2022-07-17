
public class Main {

	public static void main(String[] args) {
		MathClass objClass = new MathClass();
		
		double[] x = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\nThe Avarage and Standard Deviation of array x: \n");
		objClass.display_avarage_std(x);
		
		double[] z = new double[100];
		for (int k = 0; k< z.length; k++) {
			z[k] = k+1;
		}
		
		System.out.println("\nThe Avarage and Standard Deviation of array z: \n");
		objClass.display_avarage_std(z);
	}

}
