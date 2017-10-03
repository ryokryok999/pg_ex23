package invoice;

import service.Record;
import java.io.BufferedReader;
import java.io.Reader;

public class RecordReader {

	private BufferedReader reader;

	public RecordReader() {
		System.out.println("コンストラクタ呼ばれました。RecordReader");
	}

	public RecordReader(Reader reader) {

	}

	public Record read() {
		Record record = new Record(String record);
		return null;
	}

	public void close() {

	}

}
