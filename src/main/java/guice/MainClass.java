package guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.spi.Element;

import Named.Projectmanager;
import bindings.Logexample;
import dependency.inject.App;
import dependency.inject.MappingModule;
import providergo.WebTransactions;
import providesannot.ExamModules;
import providesannot.HeadMaster;
import providesannot.Result;

public class MainClass {

	public static void main(String[] args) {
			System.out.println("Learn dependency injections now");
			
			System.out.println("Google juice now ..right");
			System.out.println("Card used is Paypal : " +System.getenv("card"));
			
			// Initializes the module mappings class first
			 Injector injector = Guice.createInjector(new MappingModule());			 
			 App app = injector.getInstance(App.class);
			 Logexample log = injector.getInstance(Logexample.class);
			 Projectmanager pm =  injector.getInstance(Projectmanager.class);
			 pm.instanceBinding();	
			 
			 app.menu();
			 
			 
			 ///Provides
			 Injector injector2 = Guice.createInjector(new ExamModules());
			 Result res =   injector2.getInstance(Result.class);
			 System.out.println(res.getResult() + " HashCode : " +res.hashCode());
			 Result res2 =   injector2.getInstance(Result.class);
			 System.out.println(res2.getResult()+ " HashCode : " +res2.hashCode());
			 
			 ///Provides Singletom
			 HeadMaster hm = injector2.getInstance(HeadMaster.class);
			 System.out.println(hm.getTeacher() + " HashCode : " +hm.hashCode());
			 HeadMaster hm2 =   injector2.getInstance(HeadMaster.class);
			 System.out.println(hm2.getTeacher()+ " HashCode : " +hm2.hashCode());

			 // Provider
			 WebTransactions test = injector.getInstance(WebTransactions.class);
			 System.out.println("check the result chrome "+test.getBrowser());
			 
			 //untargetted bindings
			 //@implementeby not working will need to revisit later
			 Injector injector3 = Guice.createInjector();
			 injector3.getInstance(Element.class);
			// System.out.println("Utargeteed bindings : " + ele.g );
			 
	}

}
