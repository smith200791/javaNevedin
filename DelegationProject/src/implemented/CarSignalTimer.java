package implemented;

import intf.TimeShift;

public class CarSignalTimer implements TimeShift {

	@Override
	public void onTime() {
		System.out.println("car is signal");
	}

}
