package N1Ex2;

public class Worker {
	
	protected String name;
	protected String surname;
	protected int priceHour;
	
	public Worker (String name, String surname, int priceHour) {
		this.name = name;
		this.surname = surname;
		this.priceHour = priceHour;
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getPriceHour() {
		return priceHour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSurame(String surname) {
		this.surname = surname;
	}
	public void setPreuHora(int priceHour) {
		this.priceHour = priceHour;
	}
	
	
	public int calculateSalary(int hoursWorked) {
		return (priceHour * hoursWorked);
		
	}
	
	public String toString() {
		return "Worker name and surname: " + name + " " + surname + ". Price by hour: " + priceHour + "€. ";
	}

}
