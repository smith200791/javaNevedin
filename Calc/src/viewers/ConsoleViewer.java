package viewers;

import intf.Viewer;

public class ConsoleViewer implements Viewer {

	public void onView(Double result) {
		System.out.println("the result is :" + result);	
	}

}
