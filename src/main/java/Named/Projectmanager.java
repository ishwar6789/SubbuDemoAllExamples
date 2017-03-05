package Named;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Projectmanager {
	
	@Inject @Named("logintime") int logintime1; 
	
	@Inject
	public void accessMyPages(@AdminUser Page page){
		page.called();
	}

	
	@Inject
	public void accessMyPages2(@Named("Checkout") Page page){
		page.called();
	}
	
	
	
	public void instanceBinding(){
		System.out.println("Instance Injected : " + logintime1 );
	}
	
	
	

	
}
