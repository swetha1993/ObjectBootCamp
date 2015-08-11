
public class Farenheit extends Temperature{
	private double value;
	
	public Farenheit(double val){
		this.value=val;
	}
	

	public double getValue() {
		return value;
	}


	@Override
	public double toCelsius() {
		return (value-32)*(5.0/9);
	}
	
	@Override
	public double toFarenheit() {
		return value;
	}
	
	public Farenheit convert(Temperature t1){
		return new Farenheit(t1.toFarenheit());
	}

}
