
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNums z1 = new ComplexNums(1,2);
		ComplexNums z2 = new ComplexNums(3,5);
		ComplexNums sum = (ComplexNums.add(z1, z2));
		ComplexNums mult = (ComplexNums.mult(z1, z2));
		
		System.out.println("z1 = " + z1.toString()); 
		System.out.println("z2 = " + z2.toString()); 
		System.out.println("z1 + z2 = " + sum.toString()); 
		System.out.println("z1 * z2 = " + mult.toString()); 
		
		ComplexNums z3 = new ComplexNums();
		
		z3.setRe(1);
		z3.setIm(2);
		System.out.println("z3 = " + z3.toString()); 
		ComplexNums.toPolar(z3);
		 
	}

}
