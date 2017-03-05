package bindings;

public class Mysqllog extends TransactionLog implements Log{
	
	@Override
	public void loggingstarted() {
	System.out.println("Mysql logging started");
		
	}

}
