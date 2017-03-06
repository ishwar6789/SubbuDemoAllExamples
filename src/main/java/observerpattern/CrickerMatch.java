package observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CrickerMatch extends Observable{
	private String score;
	/*private List<Observer> clients = new ArrayList<>();*/

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
		setChanged();
		notifyObservers(score);
	}
	
	
    /*public void	addObserver(Observer client){
    	clients.add(client);
    	
    }*/
    
    /*public void notifyObservers(Object obj){
    	clients.forEach(client -> client.notify());
    }*/

		
}
