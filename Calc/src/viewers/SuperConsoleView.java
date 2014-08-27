package viewers;

import intf.Viewer;

public class SuperConsoleView implements Viewer {

	@Override
	public void onView(Integer result) {
		System.out.println("the super puper sping framework, \n and result is :" + result);

	}

}
