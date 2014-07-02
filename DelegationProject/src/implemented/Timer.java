package implemented;

import java.util.Scanner;

import intf.TimeShift;

public class Timer {

	TimeShift action;

	/**
	 * Функция, которую вызывает программист для установки времени.
	 */
	void run() {
		if (isTime()) {
			action.onTime();
			// action.
		}
	}

	/**
	 * Некоторая функция, которая берет на себя всю работу со временем. Ее
	 * реализация не интересна в данном контексте.
	 * 
	 * @return
	 */
	private boolean isTime() {
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Введите тип действия:");
		Scanner scanner = new Scanner(System.in);
		String actionType = scanner.nextLine();
		Timer timer = new Timer();

		if (actionType.equalsIgnoreCase("set wake up timer")) {
			timer.action = new WakeUpTimer();
		} else if (actionType.equalsIgnoreCase("set chicken timer")) {
			timer.action = new CarSignalTimer();
		}
		
		

		timer.run();
	}
}
