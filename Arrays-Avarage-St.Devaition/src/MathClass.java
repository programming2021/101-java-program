
public class MathClass {
	
	public MathClass() {
		// TODO Auto-generated constructor stub
	}
	
	private double avarage(double[] x) {
		double sum = 0;
		for (int k = 0; k < x.length; k++) {
			sum += x[k];
		}
		return sum / x.length;
	}
	
	private double deviation(double[] x) {
		double mean = avarage(x);
		double std = 0;
		for (int k = 0; k < x.length; k++) {
			std += Math.pow((x[k] - mean), 2);
		}
		return Math.sqrt(std / x.length);
	}
	
	public void display_avarage_std(double[] x) {
		System.out.println("The mean value   = " + avarage(x));
		System.out.println("The st-deviation = " + deviation(x));
	}

}
