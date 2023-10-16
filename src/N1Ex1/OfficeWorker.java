package N1Ex1;

public class OfficeWorker extends Worker{

	private static int gasoline;
	
	public OfficeWorker(String name, String surname, int priceHour, int gasoline) {
		super(name, surname, priceHour);
		this.gasoline = gasoline;
	}
	
	public int getGasoline() {
		return gasoline;
	}

	
	@Override
	public int calculateSalary(int hoursWorked) {
		return super.calculateSalary(hoursWorked) + gasoline;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Gasoline: " + gasoline + "€. ";
	}

}
