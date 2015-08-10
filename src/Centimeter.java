
public class Centimeter extends Unit {
	double qty;

	@Override
	public double getConversionToCentimeter() {
		return qty;
	}

	/*@Override
	public double getConversionToMeter() {
		return qty*0.01;
	}*/

	/*@Override
	public boolean checkEquality(double qty1) {
		// TODO Auto-generated method stub
		return false;
	}*/
}
