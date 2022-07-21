
public class ComplexNums {
	
	private double re;
	private double im;
	
	public ComplexNums() {
		
	}

	public ComplexNums(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}
	
	static ComplexNums add(ComplexNums z1, ComplexNums z2) {
		ComplexNums sum = new ComplexNums();
		sum.re = z1.re + z2.re;
		sum.im = z1.im + z2.im;
		return sum;
	}
	
	static ComplexNums mult(ComplexNums z1, ComplexNums z2) {
		ComplexNums sum = new ComplexNums();
		sum.re = z1.re * z2.re - z1.im * z2.im;
		sum.im = z1.im * z2.re + z2.im * z1.re;
		return sum;
	}

	static double absVal(ComplexNums z) {
		return Math.sqrt(z.re * z.re + z.im * z.im);
	}
	
	static double tethaVal(ComplexNums z) {
		return Math.atan(z.im / z.re) * 180 / Math.PI;
	}
	
	static void toPolar(ComplexNums z) {
		System.out.print("The poar form of " + z + " = ");
		System.out.println( String.format("%.3f", absVal(z)) + " * " + "e ^i" + String.format("%.1f", tethaVal(z)) );
	}
	
	@Override
	public String toString() {
		return re + " + " + im + "i";
	}
	
	

}
