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
		unitPrice = services[0].calcUnitPrice(record, unitPrice);
		unitPrice = services[1].calcUnitPrice(record, unitPrice);
		return unitPrice;
	}

	public int calcBasicCharge(int basicCharge) {
		basicCharge = services[0].calcBasicCharge(basicCharge);
		basicCharge = services[1].calcBasicCharge(basicCharge);
		return basicCharge;
	}

}
