package N1Ex1;

public class OfficeWorker extends Worker{

	private static float gasoline;
	
	public OfficeWorker(String name, String surname, float priceHour, float gasoline) {
		super(name, surname, priceHour);
		this.gasoline = gasoline;
	}
	
	public float getGasoline() {
		return gasoline;
	}
	
	public void setGasoline (float gasoline) {
		this.gasoline = gasoline;
	}
	
	@Override
	public float calculateSalary(float hoursWorked) {
		return super.calculateSalary(hoursWorked) + gasoline;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Gasoline: " + gasoline + "€. ";
	}

}
