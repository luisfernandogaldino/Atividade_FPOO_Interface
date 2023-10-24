package InterfaceAtividade2;

public class Calcular implements Calculos  {
	
	@Override
	public int Div(int vl1,int vl2) {
		return vl1/vl2;
	}

	@Override
	public double Mult(double vl1, double vl2) {
		return vl1*vl2;
	}

	@Override
	public double Somar(double vl1, double vl2) {
		return vl1+vl2;
	}

	@Override
	public double Sub(double vl1, double vl2) {
		return vl1-vl2;
	}

	@Override
	public int Exp(int vl1, int vl2) {
		return vl1^vl2;
	}
}
