
public class Teaspoon extends Volume{

	private double amt;
	
	public Teaspoon(double amt){
		this.amt=amt;
	}

	public double getAmt() {
		return amt;
	}

	@Override
	public double getConversionToTeaspoon() {
		return amt;
	}
	
	public static Teaspoon convertFrom(Volume q1)
	{
		return new Teaspoon(q1.getConversionToTeaspoon());
	}
}
