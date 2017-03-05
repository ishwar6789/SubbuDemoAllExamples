package untargettedbinding;

import com.google.inject.ImplementedBy;

@ImplementedBy(WebProvider.class)
public interface Element {	
	public void getlement();

}
