
public class Cup extends Volume {

	private double amt;
	
	
	public double getAmt() {
		return amt;
	}

	public Cup(double amt){
		this.amt=amt;
	}

	@Override
	public double getConversionToTeaspoon() {
		return amt*46;
	}
	
	public static Cup convertFrom(Volume q1){
		return new Cup(q1.getConversionToTeaspoon()/48);
	}

}
