package implemented;

import intf.*;

public class WakeUpTimer implements TimeShift{

	@Override
	public void onTime() {
		String s = new String("weakeUp timer");
		System.out.println(s);
	}

}
