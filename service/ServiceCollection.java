package service;

public class ServiceCollection implements Service {


	public ServiceCollection() {
		//DayService dayService = new DayService();
		//FamilyService familyService = new FamilyService();
		
	}
	
	private Service[] services = { new DayService() , new FamilyService() };

	public void clear() {

	}

	public void checkService(Record record) {
		services[0].checkService(record);
		services[1].checkService(record);
		

	}

	public int calcUnitPrice(Record record, int unitPrice) {
		services[0].calcUnitPrice(record, unitPrice)
		return 0;
	}

	public int calcBasicCharge(int basicCharge) {
		return 0;
	}

}
