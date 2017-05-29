package external;

public class ExternalConnection {
	
	private static int connectionIdSequence;
	
	static {
		connectionIdSequence = 1;
	}
	
	// mamy jakis stan
	private int connectionId;
	
	public ExternalConnection() {
		connectionId = ++connectionIdSequence;
	}
	
	public String executeStatement(String stmt) {
		return "statement executed: " + stmt;
	};
	
	public void openConnection() {
		System.out.println("opening connection " + connectionId);
	}
	
	public void closeConnection() {
		System.out.println("closing connection" + connectionId);
	}
}
