package N1Ex1;

public class OnlineWorker extends Worker{

	private float internetPrice;
	
	public OnlineWorker(String name, String surname, float priceHour, float internetPrice) {
		super(name, surname, priceHour);
		this.internetPrice = internetPrice;
	}
	
	public float getInternetPrice() {
		return internetPrice;
	}
	
	public void setInternetPrice (float internetPrice) {
		this.internetPrice = internetPrice;
	}
	
	@Override
	public float calculateSalary(float hoursWorked) {
		return super.calculateSalary(hoursWorked) + internetPrice;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Internet price: " + internetPrice + "€.";
	}

}
