package providesannot;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class ExamModules extends AbstractModule  {
	
	@Override
	protected void configure() {
		System.out.println("Started my own Exam modules configuration configuration");
	}

	@Provides
	Result returnResult(){
		Result res = new Result();
		res.setResult("Injected PRovides demo");
		return res;
	}
	@Provides @Singleton
	HeadMaster getheadMaster(){
		HeadMaster hm = new HeadMaster();
		hm.setTeacher("Example of Single ton check hash code");
		return hm;
	}
	
	
}
