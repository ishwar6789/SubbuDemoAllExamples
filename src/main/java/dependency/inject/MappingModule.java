package dependency.inject;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import Named.AdminPage;
import Named.AdminUser;
import Named.AuditorPage;
import Named.Page;
import bindings.Log;
import bindings.Mysqllog;
import bindings.TransactionLog;

public class MappingModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Card.class).to(Mastercard.class);
		bind(Log.class).to(TransactionLog.class);
		bind(TransactionLog.class).to(Mysqllog.class);
		
		
		
		//Annotations binding
		bind(Page.class)
        .annotatedWith(AdminUser.class)
        .to(AdminPage.class);
		
		
		
		 bind(Page.class)
	        .annotatedWith(Names.named("Checkout"))
	        .to(AuditorPage.class);
		 
		 
		 
		 
		 //instance binding
		 
		 bind(Integer.class)
	        .annotatedWith(Names.named("logintime"))
	        .toInstance(10);
		 
		 
		
	}

}
