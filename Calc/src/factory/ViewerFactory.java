package factory;

import intf.Viewer;
import viewers.ConsoleViewer;
import viewers.FileViewer;

public class ViewerFactory {
	public Viewer createView(String code) {
		
		if (code.equals("1")) {
			return new FileViewer();			
		}
		
		if (code.equals("2")) {
			return new ConsoleViewer();			
		}
		
		return null;
	}
}
