package service;

public class FamilyService implements Service {

	private static final int TEL_NUMBER = 2;
	private static final String SERVICE_CODE = "C1";
	private static final int BASIC_CHARGE = 100;
	private boolean joined = false;
	private String[] telNumbers = new String[TEL_NUMBER];
	private int telNumberCount = 0;

	public void clear() {

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
		}
	}

	public int calcUnitPrice(Record record, int unitPrice) {
		return unitPrice / 2; //？？？？？？？？
	}

	public int calcBasicCharge(int basicCharge) {
		return basicCharge += BASIC_CHARGE;
	}

}
