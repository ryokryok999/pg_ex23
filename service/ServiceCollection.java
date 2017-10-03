package service;

public class ServiceCollection implements Service {


	public ServiceCollection() {
		//DayService dayService = new DayService();
		//FamilyService familyService = new FamilyService();

	}

	private Service[] services = { new DayService() , new FamilyService() };

	public void clear() {
		for (int i = 0; i < services.length; i++){
			services[i].clear();
		}
	}

	public void checkService(Record record) {
		for (int i = 0; i < services.length; i++){
			services[i].checkService(record);
		}
	}

	public int calcUnitPrice(Record record, int unitPrice) {
		services[0].calcUnitPrice(record, unitPrice)
		return 0;
	}

	public int calcBasicCharge(int basicCharge) {
		return 0;
	}

}
