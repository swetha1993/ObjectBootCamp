
public class Meter extends Unit{

	double qty;
	
	@Override
	public double getConversionToCentimeter(){
		return qty*100;
	}

	/*@Override
	public double getConversionToMeter() {
		return qty;
	}*/

	/*@Override
	public boolean checkEquality(double qty1) {
		// TODO Auto-generated method stub
		return false;
	}*/
	
}

