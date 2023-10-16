package N1Ex1;

public class N1Ex1 {
	
	public static void main (String[]args) {
		
		Worker workerOne = new OnlineWorker("Max", "Garriga", 12, 87);
		System.out.println(workerOne.toString());
		System.out.println("Total salary working online = " + workerOne.calculateSalary(40) +
					"€ a week.");
		
		Worker workerTwo = new OfficeWorker("Helena", "Prado", 14, 95);
		System.out.println(workerTwo.toString());
		System.out.println("Total salary working at the office = " + workerTwo.calculateSalary(40) +
				"€ a week.");
	}

}
