package controller;

public class cModulos {
	public double somaFrac(int num, double s) {

		if (num == 1) {
			return 1;
		} else {
			s = 1/(double)num;
			return s + somaFrac(num-1, s);
		}
		
	}
}