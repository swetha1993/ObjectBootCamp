
public class Tablespoon extends Volume{

private double amt;
	
	public Tablespoon(double amt){
		this.amt=amt;
	}

	public double getAmt() {
		return amt;
	}

	@Override
	public double getConversionToTeaspoon() {
		return amt*3;
	}
	
	public static Tablespoon convertFrom(Volume q1){
	
		return new Tablespoon(q1.getConversionToTeaspoon()/3);
	}
}
