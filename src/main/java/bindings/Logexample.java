package bindings;

import com.google.inject.Inject;

public class Logexample {
	
	
	@Inject
	public void startlogging(Log log){
		log.loggingstarted();
	}

}
