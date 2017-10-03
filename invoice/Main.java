package invoice;

import service.Record;
import service.Service;
import service.ServiceCollection;

public class Main {

	private static final int INITIAL_BASIC_CHARGE = 1000;
	private static final int INITIAL_CALL_UNIT_PRICE = 20;
	private static final char RC_OWNER_INFO = '1';
	private static final char RC_SERVICE_INFO = '2';
	private static final char RC_CALL_LOG = '5';
	private static final char RC_SEPARATOR = '9';
	private static final String String = null;
	
	public static void main(String[] args) {
		ServiceCollection service = new ServiceCollection();
		RecordReader reader = new RecordReader();
		InvoiceWriter writer = new InvoiceWriter();
		Invoice invoice = new Invoice();
		
		Record record = reader.read();
		char recordCode = record.getRecordCode();
		
		//File inputFile = new File("record.log");
		//BufferedReader br = new BufferedReader(new FileReader(inputFile));
		//String line = br.readLine();
		
		while (record != null) {

			switch (recordCode){
			case RC_OWNER_INFO:
				String ownerTelNumber = record.getOwnerTelNumber();
				invoice.setOwnerTelNumber(ownerTelNumber);
				break;
			case RC_SERVICE_INFO:
				service(service, record);
				service.checkService(record);
				break;
			case RC_CALL_LOG:
				call(invoice, service, record);
				int unitPrice = service.calcUnitPrice(record, unitPrice);
				
				//
				
				invoice.addCallCharge(callCharge);
				
				break;
			case INPUT_FIRST_CHAR_KUGIRI:
				k[Keiyakusya.getCount()-1].calcKihonRyokin();
				k[Keiyakusya.getCount()-1].calcTsuuwaRyokin();
				break;
			}

			line = br.readLine();
		}
		br.close();
		
	}

	private static void service(Service service, Record record) {

	}

	private static void call(Invoice invoice, Service service, Record record) {

	}

	private static void separate(Invoice invoice, Service service, InvoiceWriter writer) {

	}

}
