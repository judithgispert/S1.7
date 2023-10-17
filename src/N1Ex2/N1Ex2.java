package N1Ex2;

public class N1Ex2 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		
		OfficeWorker ofWorker = new OfficeWorker("Ariadna", "Gilbert", 12, 68);
		System.out.println("Gasoline: " + ofWorker.retornGasoline());
		System.out.println("Gasoline: " + ofWorker.getGasoline());
		
		OnlineWorker onWorker = new OnlineWorker("Jaume", "Monto", 11, 45);
		System.out.println(onWorker.salaryTotal(40));
		System.out.println(onWorker.calculateSalary(40));
	}

}
