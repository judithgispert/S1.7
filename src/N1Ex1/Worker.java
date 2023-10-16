package N1Ex1;

public class Worker {
	
	protected String name;
	protected String surname;
	protected float priceHour;
	
	public Worker (String name, String surname, float priceHour) {
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
	public float getPriceHour() {
		return priceHour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSurame(String surname) {
		this.surname = surname;
	}
	public void setPreuHora(float priceHour) {
		this.priceHour = priceHour;
	}
	
	
	public float calculateSalary(float hoursWorked) {
		return (priceHour * hoursWorked);
		
	}
	
	public String toString() {
		return "Worker name and surname: " + name + " " + surname + ". Price by hour: " + priceHour + "€. ";
	}

}
