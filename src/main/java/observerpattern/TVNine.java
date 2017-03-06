package observerpattern;

import java.util.Observable;
import java.util.Observer;

public class TVNine implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("TV nine reports score" +arg1);		
	}

}
