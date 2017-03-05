package dependency.inject;

import com.google.inject.Inject;

public class App {	
	
	@Inject
	public void payBill(Card card){
		card.payBill();
		
	}
	
	
	public void menu(){
		System.out.println("Special Chicken biryani");
	}
    
}
