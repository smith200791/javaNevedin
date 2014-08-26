package viewers;

import intf.Viewer;

public class ConsoleViewer implements Viewer {

	public void onView(Integer result) {

		System.out.println(result);
	}

}
