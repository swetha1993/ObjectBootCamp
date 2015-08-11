
public class Celsius extends Temperature{
	
private double value;
	

	public double getValue() {
	return value;
}

	public Celsius(double val){
		this.value=val;
	}
	
	@Override
	public double toFarenheit() {
		return (9.0/5*value)+32;
	}

	@Override
	public double toCelsius() {
		return value;
	}
	
	public Celsius convert(Temperature t1){
		return new Celsius(t1.toCelsius());
	}

	

}
