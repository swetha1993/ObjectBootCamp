
public class Ounce extends Volume{

	private double amt;
	
	public Ounce(double amt){
		this.amt=amt;
	}
	public double getAmt() {
		return amt;
	}

	@Override
	public double getConversionToTeaspoon() {
		return amt*6;
	}
	
	public static Ounce convertFrom(Volume q1){
		return new Ounce(q1.getConversionToTeaspoon()/6);
	}

}
