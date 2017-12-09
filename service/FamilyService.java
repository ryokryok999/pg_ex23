package service;

public class FamilyService implements Service {

	private static final int TEL_NUMBER = 2;
	private static final String SERVICE_CODE = "C1";
	private static final int BASIC_CHARGE = 100;
	private boolean joined = false;
	private String[] telNumbers = new String[TEL_NUMBER];
	private int telNumberCount = 0;

	public void clear() {
		telNumberCount = 0;
	}

	public void appendFamilyTelNumber(String telNumber) {
		telNumbers[telNumberCount] = telNumber;
		telNumberCount ++;
	}

	public boolean isJoined() {
		return joined;
	}

	public boolean isFamilyTelNumber(String telNumber) {
		for (int i = 0; i < telNumbers.length; i++){
			if (telNumber.equals(telNumbers[i])){
				return true;
			}
		}
		return false;
	}

	public void checkService(Record record) {
		if (record.getServiceCode().equals(SERVICE_CODE)){
			joined = true;
			appendFamilyTelNumber(record.getServiceOption());
		}
	}

	public int calcUnitPrice(Record record, int unitPrice) {
		if(isJoined() & isFamilyTelNumber(record.getCallNumber())){
			unitPrice = unitPrice / 2;
		}
		return unitPrice;
	}

	public int calcBasicCharge(int basicCharge) {
		return basicCharge += BASIC_CHARGE;
	}

}
