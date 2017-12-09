package service;

abstract class TimeService implements Service {

	private boolean joined = false;

	public void clear() {

	}

	public void joined() {
		joined = true;
	}

	public boolean isJoined() {
		return joined;
	}

	public abstract boolean isServiceTime(int hour);

	public void checkService(Record record) {
			if (record.getServiceCode().equals(getServiceCode())){
				joined = true;
			}
	}

	public abstract String getServiceCode();

	public int calcUnitPrice(Record record, int unitPrice) {
		if(isJoined() & isServiceTime(record.getStartHour())){
			unitPrice = unitPrice - getDiscount();
			//unitPrice = unitPrice - 5;
		}
		return unitPrice;
	}

	public abstract int getDiscount();

	public int calcBasicCharge(int basicCharge) {
		return basicCharge + getBasicCharge();
	}

	public abstract int getBasicCharge();

}
