import intf.Viewer;
import factory.ViewerFactory;

/**
 * @author macbookretina
 * 
 */
public class Calculate {

	public Integer result;

	public void ssumm(Integer firstParam, Integer secondParam) {
		result = firstParam + secondParam;
	}

	public void viewLastResult(String viewCode) {
		ViewerFactory viewerFactory = new ViewerFactory();
		Viewer viewer = viewerFactory.createView(viewCode);
		viewer.onView(result);
		System.out.println("success");	
	}

}
