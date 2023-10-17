package N1Ex2;

public class OnlineWorker extends Worker{

	private int internetPrice;
	
	public OnlineWorker(String name, String surname, int priceHour, int internetPrice) {
		super(name, surname, priceHour);
		this.internetPrice = internetPrice;
	}
	
	public int getInternetPrice() {
		return internetPrice;
	}
	
	public void setInternetPrice (int internetPrice) {
		this.internetPrice = internetPrice;
	}
	
	@Override
	public int calculateSalary(int hoursWorked) {
		return super.calculateSalary(hoursWorked) + internetPrice;
	}
	
	@Deprecated
	public int salaryTotal(int hoursWorked) {
		int totalPriceHours = priceHour * hoursWorked;
		int totalS = totalPriceHours + internetPrice;
		return totalS;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Internet price: " + internetPrice + "€.";
	}

}
