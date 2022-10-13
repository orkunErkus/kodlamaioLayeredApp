package kodlamaioLayeredApp.coreLogging;

public class DatabasaLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("veritabanına loglandı ; " + data);
		
	}

}
