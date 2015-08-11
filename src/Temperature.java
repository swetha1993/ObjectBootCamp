
public abstract class Temperature {
	
	public abstract double toCelsius();
	
	public abstract double toFarenheit();
	
	public boolean checkEquality(Temperature t1){
		
		return this.toCelsius()==t1.toCelsius();
	}
}
